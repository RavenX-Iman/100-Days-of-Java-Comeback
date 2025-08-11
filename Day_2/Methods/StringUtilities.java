package Day_2.Methods;

public class StringUtilities {
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) count++;
        }
        return count;
    }

    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String rev = reverse(str);
        return str.equalsIgnoreCase(rev);
    }

    public static String toTitleCase(String str) {
        String[] words = str.toLowerCase().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            if (!w.isEmpty())
                sb.append(Character.toUpperCase(w.charAt(0))).append(w.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        String test = "hello world";
        String palindromeTest = "Madam";

        System.out.println("Vowel count in '" + test + "': " + countVowels(test));
        System.out.println("Reverse of '" + test + "': " + reverse(test));
        System.out.println("'" + palindromeTest + "' is palindrome? " + isPalindrome(palindromeTest));
        System.out.println("Title Case of '" + test + "': " + toTitleCase(test));
    }
}
