package linksqueezer;

public class LinkShortener {

    public String generateShortUrl(String longUrl) {
        // Generate a shortened URL using any algorithm you like
        // For example, you can use a hashing algorithm
        return "https://example.com/" + longUrl.hashCode();
    }

    public boolean isValidUrl(String url) {
        // Use a regular expression to check if the URL is valid
        // This is a simple example, you can use a more complex regex to handle edge cases
        String regex = "^(http|https)://[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}(\\S*)$";
        return url.matches(regex);
    }
}