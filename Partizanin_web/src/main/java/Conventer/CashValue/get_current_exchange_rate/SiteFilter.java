package Conventer.CashValue.get_current_exchange_rate;

import Conventer.CashValue.SiteDownload;

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

    private static DecimalFormat df = new DecimalFormat("#.####");


    public static class UAH {

        private static String buyUSD = buyUSD();//покупка доллора относительно гривны
        private static String sellUSD = sellUSD();//продажа доллора относительно гривны

        private static String buyRUB = buyRUB();//покупка рубля относительно гривны
        private static String sellRUB = sellRUB();//продажа рубля относительно гривны

        private static String buyEUR = buyEUR();//покупка евро относительно гривны
        private static String sellEUR = sellEUR();//продажа евроотносительно гривны

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

            return String.valueOf(df.format(Double.parseDouble(temp)));
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

            return String.valueOf(df.format(Double.parseDouble(temp)));
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


            return String.valueOf(df.format(Double.parseDouble(temp)));
        }

        private static String buyUSD() {
            String source = getUSD();

            int start = source.indexOf("<Ask>") + 4;
            int finish = source.indexOf("</Ask>");

            String temp = "";

            for (int i = start; i < source.length(); i++) {
                if (i > start && i < finish) {
                    temp += source.charAt(i);
                }
            }


            return String.valueOf(df.format(Double.parseDouble(temp)));
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


            return String.valueOf(df.format(Double.parseDouble(temp)));

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

            return String.valueOf(df.format(Double.parseDouble(temp)));

        }


        private static String getUSD() {
            String source = getValues();
            String USD = "";

            int start = source.indexOf("<rate id=\"UAHUSD\">");
            int end = source.indexOf("</rate>", start);

            for (int i = start; i < source.length(); i++) {

                if (i > start && i < end) {


                    USD += source.charAt(i);
                }
            }
            return USD;
        }

        private static String getEUR() {
            String result = getValues();
            String EUR = "";

            int start = result.indexOf("<rate id=\"UAHEUR\">");
            int end = result.indexOf("</rate>", start);

            for (int i = start; i < result.length(); i++) {

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

    public static class USD {

        private static String buyUAH = buyUAH();//покупка доллора относительно гривны
        private static String sellUAH = sellUAH();//продажа доллора относительно гривны

        private static String buyRUB = buyRUB();//покупка рубля относительно гривны
        private static String sellRUB = sellRUB();//продажа рубля относительно гривны

        private static String buyEUR = buyEUR();//покупка евро относительно гривны
        private static String sellEUR = sellEUR();//продажа евроотносительно гривны

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

            return String.valueOf(df.format(Double.parseDouble(temp)));
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

            return String.valueOf(df.format(Double.parseDouble(temp)));
        }

        private static String sellUAH() {
            String source = getUAH();


            int start = source.indexOf("<Rate>") + 5;
            int finish = source.indexOf("</Rate>");

            String temp = "";

            for (int i = start; i < source.length(); i++) {
                if (i > start && i < finish) {
                    temp += source.charAt(i);
                }
            }


            return String.valueOf(df.format(Double.parseDouble(temp)));
        }

        private static String buyUAH() {
            String source = getUAH();

            int start = source.indexOf("<Ask>") + 4;
            int finish = source.indexOf("</Ask>");

            String temp = "";

            for (int i = start; i < source.length(); i++) {
                if (i > start && i < finish) {
                    temp += source.charAt(i);
                }
            }


            return String.valueOf(df.format(Double.parseDouble(temp)));
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


            return String.valueOf(df.format(Double.parseDouble(temp)));

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

            return String.valueOf(df.format(Double.parseDouble(temp)));

        }


        private static String getUAH() {
            String result = getValues();
            String USD = "";

            int start = result.indexOf("<rate id=\"USDUAH\">");
            int end = result.indexOf("</rate>", start);

            for (int i = start; i < result.length(); i++) {

                if (i > start && i < end) {


                    USD += result.charAt(i);
                }
            }
            return USD;
        }

        private static String getEUR() {
            String result = getValues();
            String EUR = "";

            int start = result.indexOf("<rate id=\"USDEUR\">");
            int end = result.indexOf("</rate>", start);

            for (int i = start; i < result.length(); i++) {

                if (i > start && i < end) {


                    EUR += result.charAt(i);
                }
            }
            return EUR;
        }

        private static String getRUB() {
            String result = getValues();
            String RUB = "";

            int start = result.indexOf("<rate id=\"USDRUB\">");
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

        public String getBuyUAH() {
            return buyUAH;
        }

        public String getSellUAH() {
            return sellUAH;
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

    public static class EUR {

        private static String buyUSD = buyUSD();//покупка доллора относительно гривны
        private static String sellUSD = sellUSD();//продажа доллора относительно гривны

        private static String buyRUB = buyRUB();//покупка рубля относительно гривны
        private static String sellRUB = sellRUB();//продажа рубля относительно гривны

        private static String buyUAH = buyUAH();//покупка евро относительно гривны
        private static String sellUAH = sellUAH();//продажа евроотносительно гривны

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

            return String.valueOf(df.format(Double.parseDouble(temp)));
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

            return String.valueOf(df.format(Double.parseDouble(temp)));
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


            return String.valueOf(df.format(Double.parseDouble(temp)));
        }

        private static String buyUSD() {
            String source = getUSD();

            int start = source.indexOf("<Ask>") + 4;
            int finish = source.indexOf("</Ask>");

            String temp = "";

            for (int i = start; i < source.length(); i++) {
                if (i > start && i < finish) {
                    temp += source.charAt(i);
                }
            }


            return String.valueOf(df.format(Double.parseDouble(temp)));
        }

        private static String sellUAH() {
            String source = getUAH();


            int start = source.indexOf("<Rate>") + 5;
            int finish = source.indexOf("</Rate>");

            String temp = "";

            for (int i = start; i < source.length(); i++) {
                if (i > start && i < finish) {
                    temp += source.charAt(i);
                }
            }


            return String.valueOf(df.format(Double.parseDouble(temp)));

        }

        private static String buyUAH() {
            String source = getUAH();

            int start = source.indexOf("<Ask>") + 4;
            int finish = source.indexOf("</Ask>");


            String temp = "";

            for (int i = start; i < source.length(); i++) {
                if (i > start && i < finish) {
                    temp += source.charAt(i);
                }
            }

            return String.valueOf(df.format(Double.parseDouble(temp)));

        }


        private static String getUSD() {
            String result = getValues();
            String USD = "";

            int start = result.indexOf("<rate id=\"EURUSD\">");
            int end = result.indexOf("</rate>", start);

            for (int i = start; i < result.length(); i++) {

                if (i > start && i < end) {


                    USD += result.charAt(i);
                }
            }
            return USD;
        }

        private static String getUAH() {
            String result = getValues();
            String EUR = "";

            int start = result.indexOf("<rate id=\"EURUAH\">");
            int end = result.indexOf("</rate>", start);

            for (int i = start; i < result.length(); i++) {

                if (i > start && i < end) {


                    EUR += result.charAt(i);
                }
            }
            return EUR;
        }

        private static String getRUB() {
            String result = getValues();
            String RUB = "";

            int start = result.indexOf("<rate id=\"EURRUB\">");
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

        public String getBuyUAH() {
            return buyUAH;
        }

        public String getSellUAH() {
            return sellUAH;
        }
    }

    public static class RUB {

        private static String buyUSD = buyUSD();//покупка доллора относительно гривны
        private static String sellUSD = sellUSD();//продажа доллора относительно гривны

        private static String buyUAH = buyUAH();//покупка рубля относительно гривны
        private static String sellUAH = sellUAH();//продажа рубля относительно гривны

        private static String buyEUR = buyEUR();//покупка евро относительно гривны
        private static String sellEUR = sellEUR();//продажа евроотносительно гривны

        private static String sellUAH() {

            String line = getUAH();

            int start = line.indexOf("<Rate>") + 5;
            int finish = line.indexOf("</Rate>");

            String temp = "";

            for (int i = start; i < line.length(); i++) {
                if (i > start && i < finish) {
                    temp += line.charAt(i);
                }
            }

            return String.valueOf(df.format(Double.parseDouble(temp)));
        }

        private static String buyUAH() {
            String source = getUAH();

            int start = source.indexOf("<Ask>") + 4;
            int finish = source.indexOf("</Ask>");

            String temp = "";

            for (int i = start; i < source.length(); i++) {
                if (i > start && i < finish) {
                    temp += source.charAt(i);
                }
            }

            return String.valueOf(df.format(Double.parseDouble(temp)));
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


            return String.valueOf(df.format(Double.parseDouble(temp)));
        }

        private static String buyUSD() {
            String source = getUSD();

            int start = source.indexOf("<Ask>") + 4;
            int finish = source.indexOf("</Ask>");

            String temp = "";

            for (int i = start; i < source.length(); i++) {
                if (i > start && i < finish) {
                    temp += source.charAt(i);
                }
            }


            return String.valueOf(df.format(Double.parseDouble(temp)));
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


            return String.valueOf(df.format(Double.parseDouble(temp)));

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

            return String.valueOf(df.format(Double.parseDouble(temp)));

        }


        private static String getUSD() {
            String result = getValues();
            String USD = "";

            int start = result.indexOf("<rate id=\"RUBUSD\">");
            int end = result.indexOf("</rate>", start);

            for (int i = start; i < result.length(); i++) {

                if (i > start && i < end) {


                    USD += result.charAt(i);
                }
            }
            return USD;
        }

        private static String getEUR() {
            String result = getValues();
            String EUR = "";

            int start = result.indexOf("<rate id=\"RUBEUR\">");
            int end = result.indexOf("</rate>", start);

            for (int i = start; i < result.length(); i++) {

                if (i > start && i < end) {


                    EUR += result.charAt(i);
                }
            }
            return EUR;
        }

        private static String getUAH() {
            String result = getValues();
            String RUB = "";

            int start = result.indexOf("<rate id=\"RUBUAH\">");
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

        public String getBuyUAH() {
            return buyUAH;
        }

        public String getSellUAH() {
            return sellUAH;
        }

        public String getBuyEUR() {
            return buyEUR;
        }

        public String getSellEUR() {
            return sellEUR;
        }
    }


}
