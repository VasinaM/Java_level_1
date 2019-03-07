package calculator;

import java.util.Scanner;

public class MadeCalc {

    static private Scanner in = new Scanner(System.in);

    private static void consoleCalc() {

        String[] line = in.nextLine().split(" ");

        switch (line[1]) {
            case "+":
                int count1 = Integer.parseInt(line[0]);
                int count2 = Integer.parseInt(line[2]);
                System.out.println(count1 + count2);
                break;
            case "-":
                int count3 = Integer.parseInt(line[0]);
                int count4 = Integer.parseInt(line[2]);
                System.out.println(count3 - count4);
                break;
            case "*":
                int count5 = Integer.parseInt(line[0]);
                int count6 = Integer.parseInt(line[2]);
                System.out.println(count5 * count6);
                break;
            case "/":
                float count7 = Float.parseFloat(line[0]);
                float count8 = Float.parseFloat(line[2]);
                System.out.println(count7 / count8);
                break;
        }

    }

    public static void main(String[] args) {
        consoleCalc();
    }
}
