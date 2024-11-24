package LAB9;

public class Q2 {
    public static void Print(String s, int n) {
        Integer freq[] = new Integer[26];
        // Initialize frequency array elements to 0
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 0;
        }

        // Count the frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
            }
        }

        // Print characters that exceed the frequency n
        for (int i = 0; i < 26; i++) {
            if (freq[i] > n) {
                System.out.println((char)(i + 'a'));
            }
        }
    }

    public static void main(String[] args) {
        Print("aabcdeaabcjlkjerwlaaabbsadfdsf", 4);
    }
}
