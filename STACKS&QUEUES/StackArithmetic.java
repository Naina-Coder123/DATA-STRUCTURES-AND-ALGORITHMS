import java.util.Stack;

public class StackArithmetic {
    
    static String infixToPostfix(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();
        int i = 0;
        
        while (i < s.length()) {
            char c = s.charAt(i);

            // Operand (letter or digit)
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                ans.append(c);
            }
            // Left parenthesis
            else if (c == '(') {
                st.push(c);
            }
            // Right parenthesis
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop(); // remove '('
                }
            }
            // Operator
            else {
                while (!st.isEmpty() && priority(c) <= priority(st.peek())) {
                    ans.append(st.pop());
                }
                st.push(c);
            }
            i++;
        }

        // Pop remaining operators
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }
        // 1. Infix → Prefix
    public static String infixToPrefix(String infix) {
        // Step 1: Reverse the infix
        StringBuilder sb = new StringBuilder(infix);
        sb.reverse();
        char[] chars = sb.toString().toCharArray();

        // Replace ( with ) and vice versa
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') chars[i] = ')';
            else if (chars[i] == ')') chars[i] = '(';
        }

        // Step 2: Convert reversed infix to postfix
        String reversedInfix = new String(chars);
        String postfix = infixToPostfix(reversedInfix);

        // Step 3: Reverse postfix → prefix
        return new StringBuilder(postfix).reverse().toString();
    }

    // 2. Prefix → Infix
  public static String prefixToInfix(String prefix) {
    Stack<String> st = new Stack<>();
    for (int i = prefix.length() - 1; i >= 0; i--) {
        char c = prefix.charAt(i);

        if (Character.isLetterOrDigit(c)) {
            st.push(c + "");
        } else {
            if (st.size() < 2) {
                throw new IllegalArgumentException("Invalid prefix expression: " + prefix);
            }
            String op1 = st.pop();
            String op2 = st.pop();
            String exp = "(" + op1 + c + op2 + ")";
            st.push(exp);
        }
    }
    if (st.size() != 1) {
        throw new IllegalArgumentException("Invalid prefix expression: " + prefix);
    }
    return st.peek();
}


    // 3. Postfix → Infix
    public static String postfixToInfix(String postfix) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(c + "");
            } else {
                String op2 = st.pop();
                String op1 = st.pop();
                String exp = "(" + op1 + c + op2 + ")";
                st.push(exp);
            }
        }
        return st.peek();
    }

    // 4. Postfix → Prefix
    public static String postfixToPrefix(String postfix) {
        Stack<String> st = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(c + "");
            } else {
                String op2 = st.pop();
                String op1 = st.pop();
                String exp = c + op1 + op2;
                st.push(exp);
            }
        }
        return st.peek();
    }

    // 5. Prefix → Postfix
    public static String prefixToPostfix(String prefix) {
        Stack<String> st = new Stack<>();
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                st.push(c + "");
            } else {
                String op1 = st.pop();
                String op2 = st.pop();
                String exp = op1 + op2 + c;
                st.push(exp);
            }
        }
        return st.peek();
    }




    static int priority(char ch) {
        if (ch == '^') return 3;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '+' || ch == '-') return 1;
        return -1;
    }

    public static void main(String[] args) {
    String infix = "A+B*(C^D-E)";
    String postfix = infixToPostfix(infix);
    String prefix = infixToPrefix(infix);

    System.out.println("Infix: " + infix);
    System.out.println("Infix → Postfix: " + postfix);
    System.out.println("Infix → Prefix: " + prefix);

    System.out.println("Postfix → Infix: " + postfixToInfix(postfix));
    System.out.println("Prefix → Infix: " + prefixToInfix(prefix)); // use the same prefix here
    System.out.println("Postfix → Prefix: " + postfixToPrefix(postfix));
    System.out.println("Prefix → Postfix: " + prefixToPostfix(prefix));

    }
}
