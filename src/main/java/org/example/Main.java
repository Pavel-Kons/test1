package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
//        System.out.print("Input: ");
//        Scanner stringScan = new Scanner(System.in);
//        String inputString = stringScan.nextLine();

        String stringScan = "9 / 3";

//        String[] words = inputString.split(" ");
        String[] splitWordsVariable = stringScan.split(" ");
        int number1 = 0;
        char operator = 0;
        int number2 = 0;

        String romanNumber = "I";
        if (romanNumber == "I") {
            System.out.println(1);
        }
        if (romanNumber == "II") {
            System.out.println(2);
        }
        if (romanNumber == "III") {
            System.out.println(3);
        }
        if (romanNumber == "IV") {
            System.out.println(4);
        }
        if (romanNumber == "V") {
            System.out.println(5);
        }
        if (romanNumber == "VI") {
            System.out.println(6);
        }
        if (romanNumber == "VII") {
            System.out.println(7);
        }
        if (romanNumber == "VIII") {
            System.out.println(8);
        }
        if (romanNumber == "IX") {
            System.out.println(9);
        }
        if (romanNumber == "X") {
            System.out.println(10);
        }

        try {
            number1 = Integer.parseInt(splitWordsVariable[0]);
            System.out.println("Converted integer: " + number1);
            operator = splitWordsVariable[1].charAt(0);
            number2 = Integer.parseInt(splitWordsVariable[2]);
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