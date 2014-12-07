package Conventer.CashValue;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 28.08.2014
 * Time:  22:00
 * To change this template use File|Setting|File Templates.
 */
public class SiteFilter {

    private static SiteDownload sd = new SiteDownload();

    private static String siteSource = sd.getSource();

    private static DecimalFormat df = new DecimalFormat("#.###");

    private String buyUSD = buyUSD();//покупка доллора относительно гривны
    private String sellUSD = sellUSD();//продажа доллора относительно гривны

    private String buyRUB = buyRUB();//покупка рубля относительно гривны
    private String sellRUB = sellRUB();//продажа рубля относительно гривны

    private String buyEUR = buyEUR();//покупка евро относительно гривны
    private String sellEUR = sellEUR();//продажа евроотносительно гривны

    public static void main(String[] args) throws FileNotFoundException {

        String USD = getUSD();
        String EUR = getEUR();
        String RUB = getRUB();

        SiteFilter sf = new SiteFilter();
        String buyUSD = sf.getBuyUSD();
        String sellUSD = sf.getSellUSD();

        String buyRUB = sf.getBuyRUB();
        String sellRUB = sf.getSellRUB();

        String buyEUR = sf.getBuyEUR();
        String sellEUR = sf.getSellEUR();

        System.out.println("-----------------------EUR--------------------\n" + EUR);
        System.out.println("Sell EUR = " + sellEUR);
        System.out.println("Buy EUR = " + buyEUR);
        System.out.println("-------------------------------------------\n");

        System.out.println("-----------------------USD--------------------\n" + USD);
        System.out.println("Sell USD = " + sellUSD);
        System.out.println("Buy USD = " + buyUSD);
        System.out.println("-------------------------------------------\n");


        System.out.println("-----------------------RUB--------------------\n" + RUB);
        System.out.println("Sell RUB = " + sellRUB);
        System.out.println("Buy RUB = " + buyRUB);
        System.out.println("-------------------------------------------\n");

    }

    private static String sellRUB() {

        String line = getRUB();

        int start = line.indexOf("<Rate>") + 5;
        int finish = line.indexOf("</Rate>");

        String temp = "";

        for (int i = start; i < line.length(); i++) {
            if (i > start && i < finish) {
                temp += line.charAt(i);
            }
        }

        return String.valueOf(df.format(1 / Double.parseDouble(temp)));
    }

    private static String buyRUB() {
        String source = getRUB();

        int start = source.indexOf("<Ask>") + 4;
        int finish = source.indexOf("</Ask>");

        String temp = "";

        for (int i = start; i < source.length(); i++) {
            if (i > start && i < finish) {
                temp += source.charAt(i);
            }
        }

        return String.valueOf(df.format(1 / Double.parseDouble(temp)));
    }

    private static String sellUSD() {
        String source = getUSD();


        int start = source.indexOf("<Rate>") + 5;
        int finish = source.indexOf("</Rate>");

        String temp = "";

        for (int i = start; i < source.length(); i++) {
            if (i > start && i < finish) {
                temp += source.charAt(i);
            }
        }


        return String.valueOf(df.format(1 / Double.parseDouble(temp)));
    }

    private static String buyUSD() {
        String source = getUSD();

        int start = source.indexOf("<Ask>") + 4;
        int finish = source.indexOf("</Ask>");

        String temp = "";

        for (int i = 0; i < source.length(); i++) {
            if (i > start && i < finish) {
                temp += source.charAt(i);
            }
        }


        return String.valueOf(df.format(1 / Double.parseDouble(temp)));
    }

    private static String sellEUR() {
        String source = getEUR();


        int start = source.indexOf("<Rate>") + 5;
        int finish = source.indexOf("</Rate>");

        String temp = "";

        for (int i = start; i < source.length(); i++) {
            if (i > start && i < finish) {
                temp += source.charAt(i);
            }
        }


        return String.valueOf(df.format(1 / Double.parseDouble(temp)));

    }

    private static String buyEUR() {
        String source = getEUR();

        int start = source.indexOf("<Ask>") + 4;
        int finish = source.indexOf("</Ask>");


        String temp = "";

        for (int i = start; i < source.length(); i++) {
            if (i > start && i < finish) {
                temp += source.charAt(i);
            }
        }

        return String.valueOf(df.format(1 / Double.parseDouble(temp)));

    }

    private static String getUSD() {
        String result = getValues();
        String USD = "";

        int start = result.indexOf("<rate id=\"UAHUSD\">");
        int end = result.indexOf("</rate>", start);

        for (int i = 0; i < result.length(); i++) {

            if (i > start && i < end) {


                USD += result.charAt(i);
            }
        }
        return USD;
    }

    private static String getEUR() {
        String result = getValues();
        String EUR = "";

        int start = result.indexOf("<rate id=\"UAHEUR\">");
        int end = result.indexOf("</rate>", start);

        for (int i = 0; i < result.length(); i++) {

            if (i > start && i < end) {


                EUR += result.charAt(i);
            }
        }
        return EUR;
    }

    private static String getRUB() {
        String result = getValues();
        String RUB = "";

        int start = result.indexOf("<rate id=\"UAHRUB\">");
        int end = result.indexOf("</rate>", start);


        for (int i = start; i < result.length(); i++) {

            if (i > start && i < end) {


                RUB += result.charAt(i);
            }
        }


        return RUB;
    }

    private static String getValues() {
        String siteSourceCode = siteSource;

        String result = " ";

        int start = siteSourceCode.indexOf("<results>");

        int end = siteSourceCode.indexOf("</results>");

        for (int i = start; i < siteSourceCode.length(); i++) {

            if (i > start && i <= end) {

                result += siteSourceCode.charAt(i);
            }
        }

        return result;
    }

    public String getBuyUSD() {
        return buyUSD;
    }

    public String getSellUSD() {
        return sellUSD;
    }

    public String getBuyRUB() {
        return buyRUB;
    }

    public String getSellRUB() {
        return sellRUB;
    }

    public String getBuyEUR() {
        return buyEUR;
    }

    public String getSellEUR() {
        return sellEUR;
    }

}
