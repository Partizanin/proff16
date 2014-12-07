package Conventer.CashValue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 28.08.2014
 * Time:  21:30
 * To change this template use File|Setting|File Templates.
 */
public class SiteDownload {

    public static void main(String[] args) {
        HttpURLConnection con = null;
        String line = "";
        try {
            URL url = new URL("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22UAHEUR%22%2C%22UAHUSD%22%2C%22UAHRUB%22)&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "Cp1251"));//"Cp1251"
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");


            }
            line += sb;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert con != null;
            con.disconnect();
        }

        System.out.println(line);

    }

    public String getSource() {
        HttpURLConnection con = null;
        String line = "";
        try {
            URL url = new URL("https://query.yahooapis.com/v1/public/yql?q=select%20*%20from%20yahoo.finance.xchange%20where%20pair%20in%20(%22UAHEUR%22%2C%22UAHUSD%22%2C%22UAHRUB%22)&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys");
            con = (HttpURLConnection) url.openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));//"Cp1251"
            StringBuffer sb = new StringBuffer();
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");

            }
            line += sb;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            assert con != null;
            con.disconnect();
        }
        return line;
    }
}
