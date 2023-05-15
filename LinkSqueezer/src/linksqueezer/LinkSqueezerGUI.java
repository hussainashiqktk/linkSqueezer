package linksqueezer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
public class LinkSqueezerGUI extends JFrame {

    private JTextField longUrlTextField;
    private JTextField aliasTextField;
    private JButton shortenButton;
    private JTextField shortUrlTextField;
    private JButton retrieveButton;

    private LinkShortener linkShortener;
    private LinkStorage linkStorage;

    public LinkSqueezerGUI(LinkShortener linkShortener, LinkStorage linkStorage) {
        this.linkShortener = linkShortener;
        this.linkStorage = linkStorage;
        initComponents();
    }

    void initComponents() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("LinkSqueezer");

        longUrlTextField = new JTextField(30);
        aliasTextField = new JTextField(10);
        shortenButton = new JButton("Shorten");
        shortUrlTextField = new JTextField(30);
        shortUrlTextField.setEditable(false);
        retrieveButton = new JButton("Retrieve");

        shortenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String longUrl = longUrlTextField.getText();
                if (linkShortener.isValidUrl(longUrl)) {
                    String alias = aliasTextField.getText();
                    String shortUrl = linkShortener.generateShortUrl(longUrl);
                    if (!alias.isEmpty()) {
                        shortUrl = "https://example.com/" + alias;
                    }
                    shortUrlTextField.setText(shortUrl);
                    try {
                        linkStorage.saveLink(new Link(longUrl, shortUrl, alias));
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    JOptionPane.showMessageDialog(LinkSqueezerGUI.this, "Invalid URL", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        retrieveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String shortUrl = shortUrlTextField.getText();
                if (!shortUrl.isEmpty()) {
                    try {
                        Link link = linkStorage.getLinkByShortUrl(shortUrl);
                        if (link == null) {
                            link = linkStorage.getLinkByAlias(shortUrl);
                        }
                        if (link != null) {
                            longUrlTextField.setText(link.getLongUrl());
                        } else {
                            JOptionPane.showMessageDialog(LinkSqueezerGUI.this, "Link not found", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("Long URL:"));
        inputPanel.add(longUrlTextField);
        inputPanel.add(new JLabel("Alias:"));
        inputPanel.add(aliasTextField);
        inputPanel.add(shortenButton);

        JPanel outputPanel = new JPanel(new FlowLayout());
        outputPanel.add(new JLabel("Short URL:"));
        outputPanel.add(shortUrlTextField);
        outputPanel.add(retrieveButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(outputPanel, BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
}