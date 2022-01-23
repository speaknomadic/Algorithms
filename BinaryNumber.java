package com.company.selfprep;

public class BinaryNumber {

    public static void main(String[] args) {
        int n = 50;
        FixedCapacityStack<Integer> stack = new FixedCapacityStack<Integer>(n);
        while (n > 0) {
            stack.push(n % 2);
            n = n / 2;
        }

        while (! stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
