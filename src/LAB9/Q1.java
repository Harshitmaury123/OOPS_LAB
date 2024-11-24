//Q.9) We need to write the function to check the password entered is correct or not based on the following
//conditions.
//        a) It must have atleast one lower case character and one digit.
//b) It must not have any Upper case characters and any special characters
//c) length should be b/w 5-12.
//d) It should not have any same immediate patterns like
//abcanan1 : not acceptable coz of an an pattern
//abc11se: not acceptable, coz of pattern 11
//        123sd123 : acceptable, as not immediate pattern
//adfasdsdf : not acceptable, as no digits
//Aasdfasd12: not acceptable, as have uppercase character

package LAB9;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;

public class Q1 {
    public static boolean isValidPassword(String password) {
        // Check if the password length is between 5 and 12
        if (password.length() < 5 || password.length() > 12) {
            return false;
        }

        // Check for at least one lowercase character and one digit
        boolean hasLowerCase = false;
        boolean hasDigit = false;

       for(int i=0;i<password.length();i++){
           if(isLowerCase(password.charAt(i))){
             hasLowerCase=true;
           }
           else if(Character.isDigit(password.charAt(i))){
               hasDigit=true;
           }
           else if (isUpperCase(password.charAt(i)) || !Character.isLetterOrDigit(password.charAt(i))) {
               return false;
           }
       }
        // If no lowercase character or digit was found, return false
        if (!hasLowerCase || !hasDigit) {
            return false;
        }

        // Check for any immediate repeating patterns
        for (int i = 0; i < password.length() - 1; i++) {
            String pattern1 = password.substring(i, i + 2);
            if (password.indexOf(pattern1, i + 2) == i + 2) {
                return false;
            }
            String pattern2 = password.substring(i, i + 1);
            if (password.indexOf(pattern2, i + 1) == i + 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Test cases
        String[] passwords = {
                "abcanan1",
                "abc11se",
                "123sd123",
                "adfasdsdf",
                "Aasdfasd12"
        };
        for (String password : passwords) {
            System.out.println("Password: " + password + " is " + (isValidPassword(password) ? "Valid" : "Invalid"));
        }
    }
}

