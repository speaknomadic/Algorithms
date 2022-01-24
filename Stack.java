package com.company;

import java.util.Scanner;

public class Stack {

    private final int n;
    private final int[] arr;

    private int t;

    public Stack(int cap) {
        n = cap;
        arr = new int[n];
        t = - 1;//index from the array is top of stack
    }

    public Stack(Stack st) {
        n = st.n;
        t = st.t;
        arr = new int[n];
        for (int i = 0; i < t; i++) {
            arr[i] = st.arr[i];

        }
    }

    public static void main(String[] args) {

        //Sort Two Stacks 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m");
        int m = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();

        Stack stack1 = new Stack(n);
        Stack stack2 = new Stack(m);
        int s1;
        int s2;

        Stack result = new Stack(n + m);

        int temp;

        for (int i = 0; i < n; i++) {
            temp = sc.nextInt();
            stack1.push(temp);
        }

        for (int i = 0; i < m; i++) {
            temp = sc.nextInt();
            stack2.push(temp);
        }

        while (! (stack1.isEmpty() || stack2.isEmpty())) {
            s1 = stack1.top();
            s2 = stack2.top();

            if (s1 >= s2) {
                result.push(s1);
                stack1.pop();
            } else {
                result.push(s2);
                stack2.pop();
            }
        }

        if (stack1.size() > stack2.size()) {
            while (! stack1.isEmpty()) {
                s1 = stack1.top();
                result.push(s1);
                stack1.pop();

            }
        }

        if (stack2.size() > stack1.size()) {
            while (! stack2.isEmpty()) {
                s2 = stack2.top();
                result.push(s2);
                stack2.pop();

            }
        }
        result.print();
    }

    public void push(int obj) {
        if (size() == n) {
            System.out.println("Stack overflow");
            return;
        }
        t++;
        arr[t] = obj;
    }

    private int size() {
        return (t + 1);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Access to empty Stack");
            return - 1;
        }
        return arr[t--];
    }

    private boolean isEmpty() {
        return (t < 0);
    }

    public int top() {
        return arr[t];
    }

    public void print() {
        while (! isEmpty()) {
            System.out.println(top() + " ");
            pop();
        }
        System.out.println();
    }
}
