package StringAndProblems;

import  java.util.*;
class StringPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        str = str.toLowerCase();
        if (str.isEmpty()) {
            System.out.println("Palindrome");
            return;
        }
        boolean isPalindrome = true;
        for (int i = 0; i < str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if (start != end) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}


class StringOperation1{
    public static void main(String[] args) {
        System.out.println("a" + 'b');
    }
}

class StringOperation2{
    public static void main(String[] args) {
        System.out.println('a' + 'b');
    }
}
class StringOperation3{
    public static void main(String[] args) {
        System.out.println("a" + 1);
    }
}
class StringOperation4{
    public static void main(String[] args) {
        System.out.println((char)('a' + 3));
    }
}




