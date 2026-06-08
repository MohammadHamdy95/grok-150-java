package com.mohamdy.grok150.misc;

public class CountDown {
    public void countDown(int n) {
        if (n == 0) {
            System.out.println(0);
        } else {
            System.out.println(n);
            countDown(n-1);

        }
    }

    static void main() {
        CountDown countDown = new CountDown();

        countDown.countDown(5);
    }
}
