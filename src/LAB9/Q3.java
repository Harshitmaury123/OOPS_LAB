//You have to enter a string and check whether it is a perfect string or not. A perfect string is a string
//which has occurance of every character only once.
//Eg. absdhkqwertyuioplmnvczx


package LAB9;

public class Q3 {
    public static boolean Perfect_String(String s) {
        Integer freq[] = new Integer[26];
        // Initialize frequency array elements to 0
        for (int i = 0; i < freq.length; i++) {
            freq[i] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                freq[ch - 'a']++;
                if(freq[ch-'a']>1){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println((Perfect_String("absdhkqwertyuioplmnvczx")));
    }
}
