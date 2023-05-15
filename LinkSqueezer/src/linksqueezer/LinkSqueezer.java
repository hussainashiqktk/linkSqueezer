package linksqueezer;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LinkSqueezer {

    private static final String BASE62_ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public String generateShortUrl(String longUrl) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hash = md.digest(longUrl.getBytes());
            BigInteger bigInt = new BigInteger(1, hash);
            String digest = bigInt.toString(62);
            StringBuilder shortUrl = new StringBuilder("https://squeezer.com/");
            for (int i = 0; i < digest.length(); i++) {
                char c = digest.charAt(i);
                int index = (int) c;
                shortUrl.append(BASE62_ALPHABET.charAt(index));
            }
            return shortUrl.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error generating short URL", e);
        }
    }

    public boolean isValidUrl(String url) {
        // Use a regular expression to check if the URL is valid
        // This is a simple example, you can use a more complex regex to handle edge cases
        String regex = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\S*)$";
        return url.matches(regex);
    }
}
