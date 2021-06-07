package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean balanceCheck(String line){
        char[] charArray = line.toCharArray();
        //boolean check = true;
        //int curlyOpenCheck, squareOpenCheck, parenOpenCheck, curlyCloseCheck, squareCloseCheck, parenCloseCheck;
        Stack<Character> charStack = new Stack<Character>();
        //char currentChar;
        for(char currentChar: charArray){
            if((currentChar == '{') || (currentChar == '(') || (currentChar == '[')){
                charStack.push(currentChar);
            }
            if((currentChar == '}') || (currentChar == ')') || (currentChar == ']')) {
                if (charStack.isEmpty()) {
                    return false;
                } else if (currentChar == '}') {
                    if (charStack.peek() != '{') {
                        return false;
                    } else {
                        charStack.pop();
                    }
                } else if (currentChar == ']') {
                    if (charStack.peek() != '[') {
                        return false;
                    } else {
                        charStack.pop();
                    }
                } else if (currentChar == ')') {
                    if (charStack.peek() != '(') {
                        return false;
                    } else {
                        charStack.pop();
                    }
                }
            }
        }
        return true;
    }




    public static void main(String[] args) {
        System.out.print("Enter parentheses to check: ");
        Scanner reader = new Scanner(System.in);
        String inString = reader.nextLine();
        boolean check;
        String result;
        check = balanceCheck(inString);
        if(check){
            result = "true";
        }
        else{
            result = "false";
        }
        System.out.println("input = " + inString + ", balanced = " + result);
    }
}
