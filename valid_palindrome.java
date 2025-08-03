package DSA;

    import java.util.Scanner;

public class valid_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        boolean result = isPalindrome(input);
        System.out.println(result ? "True" : "False");
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
            }
        }

        String original = sb.toString();
        String reversed = sb.reverse().toString();

        return original.equals(reversed);
    }
}

//Time Complexity :O(n);
//Space Complexity:O(n);
