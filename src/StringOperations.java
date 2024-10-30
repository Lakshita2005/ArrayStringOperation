public class StringOperations {

    // Method to concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Method to get a substring from a string
    public String substring(String str, int start, int end) {
        if (start >= 0 && end <= str.length() && start < end) {
            return str.substring(start, end);
        } else {
            return "Invalid range for substring.";
        }
    }

    // Method to compare two strings lexicographically
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }

    // Method to find the frequency of each character in a string
   public String characterFrequency(String str) {
    int[] freq = new int[256]; // ASCII character range
    StringBuilder result = new StringBuilder("\n"); // Start with a newline

    // Calculate frequencies
    for (char c : str.toCharArray()) {
        freq[c]++;
    }

    // Append characters in the order they appear, without duplicating
    for (char c : str.toCharArray()) {
        if (freq[c] > 0) {
            result.append(c).append(": ").append(freq[c]).append("\n");
            freq[c] = 0; // Set frequency to zero to avoid re-adding the same character
        }
    }

    return result.toString();
}



}
