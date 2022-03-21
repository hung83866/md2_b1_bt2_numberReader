import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số cần đọc : ");
        String input = sc.nextLine();
        if (Integer.parseInt(input) < 0) {
            System.out.println("nhập số lớn 0 đi bro!");
        } else {
            String[] array = input.split("");
            switch (array.length) {
                case 1:
                    if (array[0].equals("0")) {
                        System.out.println("zero");
                    } else {
                        System.out.println(tenDown(array[0]));
                    }
                    break;
                case 2:
                    System.out.println(tenUp(array[0], tenDown(array[1])));
                    break;
                case 3:
                    if ((array[1].equals("0")) && (array[2].equals("0"))) {
                        System.out.println(hunredUp(array[1]));
                    } else {
                        System.out.print(hunredUp(array[0]));
                        System.out.print(" and " + tenUp(array[1], tenDown(array[2])) + "\n");
                    }
            }

        }
    }

    private static String tenDown(String number) {
        switch (number) {
            case "0":
                return "";
            case "1":
                return "one";
            case "2":
                return "two";
            case "3":
                return "three";
            case "4":
                return "four";
            case "5":
                return "five";
            case "6":
                return "six";
            case "7":
                return "seven";
            case "8":
                return "eight";
            case "9":
                return "nine";
            default:
                return "chịu chết không đọc được!";
        }
    }

    private static String tenUp(String number1, String number2) {
        switch (number1) {
            case "0":
                return number2;
            case "1":
                switch (number2) {
                    case "":
                        return "ten";
                    case "one":
                        return "eleven";
                    case "two":
                        return "twelve";
                    case "three":
                        return "thirdteen";
                    default:
                        return number2 + "teen";
                }
            case "2":
                return "twenty " + number2;
            case "3":
                return "thirdty " + number2;
            default:
                return tenDown(number1) + "ty" + " " + number2;

        }
    }

    private static String hunredUp(String number) {
        return tenDown(number) + " hunred";
    }
}
