package Week3;

import java.util.*;

import java.util.Scanner;

public class Stack {
    static final int MAX = 1000;
    static int top;
    int a[] = new int[MAX];

    boolean isEmpty() {
        return (top < 0);
    }

    Stack(){
    top=-1;
    }

    boolean push(int x) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack OverFlow");
            return false;
        } else {
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack UnderFlow");
            return 0;
        } else {
            int x = a[top];
            return x;
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        System.out.println("peek of the stack" + s.peek());
        s.push(20);
        System.out.println("peek of the stack" + s.peek());
        s.push(30);
        System.out.println("peek of the stack" + s.peek());
        System.out.println(s.pop() + "popped from stack");
    }
}