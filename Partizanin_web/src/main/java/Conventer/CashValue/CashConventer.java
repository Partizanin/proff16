package Conventer.CashValue;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 01.09.2014
 * Time:  10:36
 * To change this template use File|Setting|File Templates.
 */
public class CashConventer {

    private static SiteFilter sf = new SiteFilter();

    public static String multiply(String a, String b) {

        return String.valueOf(BigDecimal.valueOf(Double.parseDouble(a)).multiply(BigDecimal.valueOf(Double.parseDouble(b))));

    }

    public static String devide(String a, String b) {


        return String.valueOf(BigDecimal.valueOf(Double.parseDouble(a)).divide(BigDecimal.valueOf(Double.parseDouble(b)), 4, RoundingMode.HALF_UP));

    }

    public static String buyUSD() {

        return sf.getBuyUSD();
    }

    public static String buyRUB() {

        return sf.getBuyRUB();
    }

    public static String buyEUR() {

        return sf.getBuyEUR();
    }

    public static String sellEUR() {

        return sf.getSellEUR();
    }

    public static String sellRUB() {

        return sf.getSellRUB();
    }

    public static String sellUSD() {

        return sf.getSellUSD();
    }

    public static class UAH {

        public static String buyUSD(String value) {
            return devide(value, CashConventer.buyUSD());

        }

        public static String buyRUB(String value) {
            return devide(value, CashConventer.buyRUB());
        }

        public static String buyEUR(String value) {
            return devide(value, CashConventer.buyEUR());
        }

        public static String sellUSD(String value) {
            return devide(value, CashConventer.sellUSD());
        }

        public static String sellRUB(String value) {
            return devide(value, CashConventer.sellRUB());

        }

        public static String sellEUR(String value) {
            return devide(value, CashConventer.sellEUR());
        }
    }

    class EUR {

        public String buyUAH() {
            return CashConventer.buyEUR();
        }

        public String buyUSD() {
            return devide(CashConventer.buyEUR(), CashConventer.buyUSD());
        }

        public String buyRUB() {
            return devide(CashConventer.buyEUR(), CashConventer.buyRUB());
        }

        public String sellUAH() {
            return CashConventer.sellEUR();
        }

        public String sellUSD() {
            return devide(CashConventer.sellEUR(), CashConventer.sellUSD());
        }

        public String sellRUB() {
            return devide(CashConventer.sellEUR(), CashConventer.sellRUB());
        }
    }

    class RUB {

        public String buyUAH() {
            return CashConventer.buyEUR();
        }

        public String buyUSD() {
            return devide(CashConventer.buyEUR(), CashConventer.buyUSD());
        }

        public String buyRUB() {
            return devide(CashConventer.buyEUR(), CashConventer.buyRUB());
        }

        public String sellUAH() {
            return CashConventer.sellEUR();
        }

        public String sellUSD() {
            return devide(CashConventer.sellEUR(), CashConventer.sellUSD());
        }

        public String sellRUB() {
            return devide(CashConventer.sellEUR(), CashConventer.sellRUB());
        }
    }

    class USD {

        public String buyUAH() {
            return CashConventer.buyEUR();
        }

        public String buyUSD() {
            return devide(CashConventer.buyEUR(), CashConventer.buyUSD());
        }

        public String buyRUB() {
            return devide(CashConventer.buyEUR(), CashConventer.buyRUB());
        }

        public String sellUAH() {
            return CashConventer.sellEUR();
        }

        public String sellUSD() {
            return devide(CashConventer.sellEUR(), CashConventer.sellUSD());
        }

        public String sellRUB() {
            return devide(CashConventer.sellEUR(), CashConventer.sellRUB());
        }
    }


}
