package org.example;

import java.util.Scanner;


public class Main {
    static int parseRomanNumber(String romanNumber) throws Exception {
        return switch (romanNumber) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> throw new Exception("Not a Roman number");
        };
    }


    public static String intToRoman(int number) {
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return hundreds[(number % 1000) / 100] + tens[(number % 100) / 10] + units[number % 10];
    }


    public static void main(String[] args) throws Exception {
        System.out.print("Input: \n");
        Scanner scanObject = new Scanner(System.in);
        String stringScan = scanObject.nextLine();
//        String stringScan = "X * X"; //TEMP STRING


        int number1 = 0;
        char operator = 0;
        int number2 = 0;
        boolean romanOutput = false;


        String[] arguments = stringScan.split(" ");
        if (arguments.length > 3) {
            throw new Exception("Too many variables");
        }


        try {
            number1 = Integer.parseInt(arguments[0]);
            number2 = Integer.parseInt(arguments[2]);
        } catch (NumberFormatException e) {
            romanOutput = true;
            number1 = parseRomanNumber(arguments[0]);
            number2 = parseRomanNumber(arguments[2]);
        }
        if (number1 > 10 || number2 > 10 || number1 < 1 || number2 < 1) {
            throw new Exception("Value must be more than 0 and less than 11");
        }


        operator = arguments[1].charAt(0);
        if (romanOutput) {
            int ConvertIntToRoman = 0;
            switch (operator) {
                case '+' -> {
                    ConvertIntToRoman = (number1 + number2);
                    System.out.println("Output: \n" + intToRoman(ConvertIntToRoman));
                }
                case '-' -> {
                    ConvertIntToRoman = (number1 - number2);
                    System.out.println("Output: \n" + intToRoman(ConvertIntToRoman));
                }
                case '/' -> {
                    ConvertIntToRoman = (number1 / number2);
                    System.out.println("Output: \n" + intToRoman(ConvertIntToRoman));
                }
                case '*' -> {
                    ConvertIntToRoman = (number1 * number2);
                    System.out.println("Output: \n" + intToRoman(ConvertIntToRoman));
                }
                default -> {
                    throw new Exception("Incorrect operator");
                }
            }


        } else {
            switch (operator) {
                case '+' -> {
                    System.out.println("Output: \n" + (number1 + number2));
                }
                case '-' -> {
                    System.out.println("Output: \n" + (number1 - number2));
                }
                case '/' -> {
                    System.out.println("Output: \n" + (number1 / number2));
                }
                case '*' -> {
                    System.out.println("Output: \n" + (number1 * number2));
                }
                default -> {
                    throw new Exception("Incorrect operator");
                }
            }
        }
    }
}