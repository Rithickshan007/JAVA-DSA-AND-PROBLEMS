package StringAndProblems;

import java.util.Scanner;

class StringCaps {

    public static void main(String[] args) {
        String s = "java programming is very difficult";
        char[] ch = s.toCharArray();
        int len = ch.length;
        ch[0] = Character.toUpperCase(ch[0]);
        ch[ch.length - 1] = Character.toUpperCase(ch[ch.length - 1]);
        for (int i = 0; i < len; i++) {
            if (ch[i] == ' ') {
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                ch[i - 1] = Character.toUpperCase(ch[i - 1]);
            }
        }
        System.out.println(ch);
    }
}


class Main {
    public static void main(String[] args) {
        String inputStr = "Rithickshan R";

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);

            if (inputStr.indexOf(currentChar) == inputStr.lastIndexOf(currentChar)) {
                System.out.println(currentChar);
                break;
            }
            else {
                System.out.println("Element not found");
            }
        }

    }
}


class SumString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();  //a12b3c2
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += ch - '0';
            }
        }
        System.out.println(sum);
    }
}

class StringCapital {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        char[] ch = s.toCharArray();
        int len = ch.length;
        ch[0] = Character.toUpperCase(ch[0]);
        ch[len - 1] = Character.toUpperCase(ch[len - 1]);
        for (int i = 0; i < len; i++) {
            if (ch[i] == ' ') {
                ch[i - 1] = Character.toUpperCase(ch[i - 1]);
                ch[i + 1] = Character.toUpperCase(ch[i + 1]);
            }
        }
        System.out.println(ch);
    }
}


class NonRepeat{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();            //Rithickshan R
        int len=s.length();
        for(int i=0;i<len;i++){
            char curr=s.charAt(i);
            if(s.indexOf(curr)==s.lastIndexOf(curr)){ // t-2 == t-2
                System.out.println(curr);
                break;
            }
        }
    }
}


//Reverse the words in a sentence

//Sample input:
//welcome everyone
//Sample output
//emoclew enoyreve























