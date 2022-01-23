package com.company.selfprep;

public class BracketsProblemWithAStack {

    public static void main(String[] args) {
        String expression = "1+(3+2-(2+3)*4-((3+1)*(4-2)))";
        System.out.println(areBracketsCorrect(expression));

    }

    public static boolean areBracketsCorrect(String mathExpression) {
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<Integer>(mathExpression.length());
        boolean correctBrackets = true;

        for (int index = 0; index < mathExpression.length(); index++) {
            char ch = mathExpression.charAt(index);

            if (ch == '(') {
                stack.push(index);
            } else
                if (ch == ')') {
                    if (stack.isEmpty()) {
                        return false;

                    }
                    stack.pop();
                }
        }

        if (! stack.isEmpty()) {
            correctBrackets = false;
        }
        return correctBrackets;
    }

}


