import java.util.Stack;

class InfixToPostfixConverter {
    public static String infixToPostfix(String expression) {
        StringBuilder result = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isDigit(ch)) {
                result.append(ch);  
            } else if (ch == '(') {
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (!operatorStack.isEmpty() && operatorStack.peek() != '(') {
                    result.append(" ").append(operatorStack.pop());
                }
                if (!operatorStack.isEmpty() && operatorStack.peek() == '(') {
                    operatorStack.pop();  
                }
            } else {
             
                while (!operatorStack.isEmpty() && precedence(operatorStack.peek()) >= precedence(ch)) {
                    result.append(" ").append(operatorStack.pop());
                }
                operatorStack.push(ch);
            }
        }

        
        while (!operatorStack.isEmpty()) {
            result.append(" ").append(operatorStack.pop());
        }

        return result.toString().trim();
    }

    private static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;  
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java InfixToPostfixConverter 'infix_expression'");
            System.exit(1);
        }

        String expression = args[0];
        String postfixExpression = infixToPostfix(expression);

        System.out.println("Infix Expression: " + expression);
        System.out.println("Postfix Expression: " + postfixExpression);
    }
}