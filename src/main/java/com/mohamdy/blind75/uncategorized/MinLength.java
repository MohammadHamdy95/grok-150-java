package com.mohamdy.blind75.uncategorized;

public class MinLength {

    public static int getMinLength(String seq) {
        int currentStack = 0;

        for (int i = 0;i < seq.length(); i++) {
            char currentChar = seq.charAt(i);
            if (currentChar == 'B' && currentStack > 0) {
                System.out.print("Subbing 1 on a count of " + currentChar);
                currentStack--;
                System.out.println(" Current Stack: "+currentStack);
            }
            else {
                System.out.print("Adding 1 on a count of " + currentChar);
                currentStack++;
                System.out.println(" Current Stack: "+currentStack);

            }
        }
        System.out.println(currentStack);
        return currentStack;

    }

    static void main() {
        getMinLength("BABBA");
    }


}
