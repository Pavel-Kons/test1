package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.print("Input: ");
//        Scanner stringScan = new Scanner(System.in);
//        String inputString = stringScan.nextLine();

        String stringScan = "9 / 3";

//        String[] words = inputString.split(" ");
        String[] words = stringScan.split(" ");

        int number1 = 0;
        char operator = 0;
        int number2 = 0;
        try {
            number1 = Integer.parseInt(words[0]);
            System.out.println("Converted integer: " + number1);
            operator = words[1].charAt(0);
            number2 = Integer.parseInt(words[2]);
            System.out.println("Converted integer: " + number2);
        } catch (NumberFormatException e) {
            System.out.println("Invalid integer input");
        }

        switch (operator) {
            case '+': {
                System.out.println(number1 + number2);
                break;
            }
            case '-': {
                System.out.println(number1 - number2);
                break;
            }
            case '/': {
                System.out.println(number1 / number2);
                break;
            }
            case '*': {
                System.out.println(number1 * number2);
                break;
            }
            default: {
                throw new Exception("Incorrect operator");
            }
        }
    }
}