
package linksqueezer;

import java.io.IOException;
import java.util.List;
public class LinkSqueezerApp {
    public static void main(String[] args) throws IOException {
        LinkShortener linkShortener = new LinkShortener();
        LinkStorage linkStorage = new LinkStorage("linksDB.csv");
        List<Link> links = linkStorage.loadLinks();
        for (Link link : links) {
            System.out.println(link.getLongUrl() + " " + link.getShortUrl() + " " + link.getAlias());
        }
        LinkSqueezerGUI linkSqueezerGUI = new LinkSqueezerGUI(linkShortener, linkStorage);
        linkSqueezerGUI.initComponents();
    }
}