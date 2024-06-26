package Datastructures;

//Prob:1.Reverse the string using stack

import java.util.Stack;

class CollectionStack1{
    public  String reverseString(String word){
        Stack<Character> stk= new Stack<>();
        char[] ch =word.toCharArray();
        for( char ele: ch){
            stk.push(ele);
        }
         StringBuilder res= new StringBuilder(" ");
        while (!stk.isEmpty())
            res.append(stk.pop());
          return res.toString();
    }
}

class ReverseString{
    public static void main(String[] args) {
        CollectionStack1 stk=new CollectionStack1();
        System.out.println(stk.reverseString("Rithickshan"));
    }
}

//prob2: Check for balanced bracket

class CollectionStack2{
    public String checkBalance(String s){
        char[]ch=s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c: ch){
            if(c=='{'||c=='('||c=='['){
                stack.push(c);
            }
            else {
                if(stack.isEmpty()||
                !isMatchingPair(stack.pop(),c)){
                    return  "No";
                }
            }
        }
        return stack.isEmpty()?"Yes":"No";
    }

    public boolean isMatchingPair(char open, char close){
        return (open=='{'||close=='}')|| (open=='['||close==']')||(open=='('||close==')');

    }
}

class BalancedParenthesis {
    public static void main(String[] args) {
            CollectionStack2 stk2=new CollectionStack2();
            System.out.println(stk2.checkBalance("[{}]"));
    }
}

//Prob: Evaluate the Postfix Expression



class CollectionStack3 {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                // If the scanned character is an operator, pop two
                // elements from stack apply the operator.
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String expression = "231*+9-";
        System.out.println("Postfix Evaluation: " + evaluatePostfix(expression));
    }
}



class CollectionStack4 {

    public static int evaluatePrefix(String exp) {
        Stack<Integer> stack = new Stack<>();

        // Scan the expression from right to left
        for (int i = exp.length() - 1; i >= 0; i--) {
            char c = exp.charAt(i);

            // If the character is an operand (number), push it to the stack
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                // If the character is an operator, pop two operands from the stack,
                // perform the operation, and push the result back to the stack
                int val1 = stack.pop();
                int val2 = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(val1 + val2);
                        break;
                    case '-':
                        stack.push(val1 - val2);
                        break;
                    case '*':
                        stack.push(val1 * val2);
                        break;
                    case '/':
                        stack.push(val1 / val2);
                        break;
                }
            }
        }
        // The final result will be at the top of the stack
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "*-+352/62"; // Example prefix expression: "-+*23*549"
        System.out.println("Result of expression evaluation: " + evaluatePrefix(exp));
    }
}
















