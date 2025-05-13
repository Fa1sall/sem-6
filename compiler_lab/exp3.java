public class exp3 {

    // 1. Find the Length of a String
    public static int findLength(String str) {
        int length = 0;
        for (char ch : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // 2. Concatenate Two Strings
    public static String concatenate(String str1, String str2) {
        char[] result = new char[findLength(str1) + findLength(str2)];
        int i = 0;
        for (char ch : str1.toCharArray()) {
            result[i++] = ch;
        }
        for (char ch : str2.toCharArray()) {
            result[i++] = ch;
        }
        return new String(result);
    }

    // 3. Reverse a String
    public static String reverse(String str) {
        char[] rev = new char[findLength(str)];
        int j = 0;
        for (int i = findLength(str) - 1; i >= 0; i--) {
            rev[j++] = str.charAt(i);
        }
        return new String(rev);
    }

    // 4. Compare Two Strings
    public static boolean compareStrings(String str1, String str2) {
        if (findLength(str1) != findLength(str2)) return false;
        for (int i = 0; i < findLength(str1); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }

    // 5. Convert to Uppercase
    public static String toUpperCase(String str) {
        char[] result = new char[findLength(str)];
        for (int i = 0; i < findLength(str); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result[i] = (char) (ch - 32);
            } else {
                result[i] = ch;
            }
        }
        return new String(result);
    }

    // 6. Convert to Lowercase
    public static String toLowerCase(String str) {
        char[] result = new char[findLength(str)];
        for (int i = 0; i < findLength(str); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result[i] = (char) (ch + 32);
            } else {
                result[i] = ch;
            }
        }
        return new String(result);
    }

    // 7. Count Vowels in a String
    public static int countVowels(String str) {
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

    // 8. Check if a String is a Palindrome
    public static boolean isPalindrome(String str) {
        int length = findLength(str);
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // 9. Find a Character at a Given Index
    public static char charAt(String str, int index) {
        if (index < 0 || index >= findLength(str)) {
            return '\0'; // Null character for invalid index
        }
        return str.charAt(index);
    }

    // 10. Count Words in a String
    public static int countWords(String str) {
        int count = 1; // Assuming at least one word
        for (char ch : str.toCharArray()) {
            if (ch == ' ') count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "madam";

        System.out.println("String 1: " + str1 + " | String 2: " + str2 + " | String 3: " + str3);
        System.out.println("Length of '" + str1 + "': " + findLength(str1));
        System.out.println("Concatenation: " + concatenate(str1, str2));
        System.out.println("Reversed '" + str1 + "': " + reverse(str1));
        System.out.println("Comparison of 'Hello' and 'World': " + compareStrings(str1, str2));
        System.out.println("Uppercase of '" + str1 + "': " + toUpperCase(str1));
        System.out.println("Lowercase of '" + str2 + "': " + toLowerCase(str2));
        System.out.println("Vowel count in 'Hello': " + countVowels(str1));
        System.out.println("'" + str3 + "' is palindrome: " + isPalindrome(str3));
        System.out.println("Character at index 1 of 'Hello': " + charAt(str1, 1));
        System.out.println("Word count in 'Hello World Java': " + countWords("Hello World Java"));
    }
}
