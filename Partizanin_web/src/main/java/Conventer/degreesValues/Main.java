package Conventer.degreesValues;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 28.08.2014
 * Time:  13:49
 * To change this template use File|Setting|File Templates.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(new InputStreamReader(System.in));
        DegreesUtils dU = new DegreesUtils();
        for (; ; ) {

            System.out.println("0-Exit\n" +
                    "1-Celsiy");

            String value = sc.nextLine();

            if (value.equals("0")) {
                break;
            } else if (value.equals("1")) {
                for (; ; ) {
                    System.out.print("\n" +
                            "Off program:Input 'back' " +
                            "\nInput celsiy:" +
                            "\n");

                    String inputValue = sc.nextLine();

                    if (inputValue.equals("back")) {
                        break;
                    }

                    dU.Celsiy(inputValue);

                    System.out.println("\n" +
                            "\nCelsiy: " + dU.getCelsiy() +
                            "\nCelvin: " + dU.getCelvin() +
                            "\nFarengeit: " + dU.getFarengeit() +
                            "\nRankin: " + dU.getRankin() +
                            "\nReomur: " + dU.getReomur());
                }
            }
        }
    }
}
