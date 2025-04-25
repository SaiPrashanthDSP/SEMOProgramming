import java.util.Stack;

class PostfixEvaluator {

    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (String symbol : expression.split("\\s+")) {
            if (symbol.matches("\\d+")) {
                stack.push(Integer.parseInt(symbol));
            } else {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result;
                switch (symbol) {
                    case "+":
                        result = operand1 + operand2;
                        break;
                    case "-":
                        result = operand1 - operand2;
                        break;
                    case "*":
                        result = operand1 * operand2;
                        break;
                    case "/":
                        result = operand1 / operand2;  // Note: This assumes integer division
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + symbol);
                }
                stack.push(result);
            }
        }

        if (stack.size() != 1) {
            throw new IllegalArgumentException("Invalid postfix expression");
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java PostfixEvaluator <postfix_expression>");
        } else {
            String postfixExpression = args[0];
            int result = evaluatePostfix(postfixExpression);
            System.out.println("The result of the postfix expression " + postfixExpression + " is: " + result);
        }
    }
}
