package org.example;

import java.util.Scanner;

public class Main {

    static int parseRomanNumber(String romanNumber) throws Exception {
        switch (romanNumber) {
            case "I": {
                return 1;
            }
            case "II": {
                return 2;
            }
            case "III": {
                return 3;
            }
            case "IV": {
                return 4;
            }
            case "V": {
                return 5;
            }
            case "VI": {
                return 6;
            }
            case "VII": {
                return 7;
            }
            case "VIII": {
                return 8;
            }
            case "IX": {
                return 9;
            }
            case "X": {
                return 10;
            }
            default: {
                throw new Exception("Not a Roman number");
            }
        }
    }

    public static void main(String[] args) throws Exception {
        System.out.print("Input: \n");
        Scanner scanObject = new Scanner(System.in);
        String stringScan = scanObject.nextLine();

//        String stringScan = "9 / 3"; //TEMP STRING

        int number1 = 0;
        char operator = 0;
        int number2 = 0;

        String[] splitWordsVariable = stringScan.split(" ");

        try {
            number1 = Integer.parseInt(splitWordsVariable[0]);
            number2 = Integer.parseInt(splitWordsVariable[2]);
        } catch (NumberFormatException e) {
            number1 = parseRomanNumber(splitWordsVariable[0]);
            number2 = parseRomanNumber(splitWordsVariable[2]);
        }

        operator = splitWordsVariable[1].charAt(0);
        switch (operator) {
            case '+': {
                System.out.println("Output: \n" + (number1 + number2));
                break;
            }
            case '-': {
                System.out.println("Output: \n" + (number1 - number2));
                break;
            }
            case '/': {
                System.out.println("Output: \n" + (number1 / number2));
                break;
            }
            case '*': {
                System.out.println("Output: \n" + (number1 * number2));
                break;
            }
            default: {
                throw new Exception("Incorrect operator");
            }
        }
    }
}