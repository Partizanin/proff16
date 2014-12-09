package Conventer.CashValue;

import Conventer.CashValue.get_current_exchange_rate.SiteFilter;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with Intellij IDEA.
 * Project name: proff16.
 * User: Partizanin.
 * Date: 05.12.2014.
 * Time:  15:30.
 * To change this template use File|Setting|Editor|File and Code Templates.
 */
@WebServlet(name = "ConventerServlet", urlPatterns = "/ConventerServlet")
public class ConventerServlet extends HttpServlet {
    private static SiteFilter.UAH uah = new SiteFilter.UAH();
    private static SiteFilter.USD usd = new SiteFilter.USD();
    private static SiteFilter.EUR eur = new SiteFilter.EUR();
    private static SiteFilter.RUB rub = new SiteFilter.RUB();

    public static JSONObject UAHCourseBuy() {
        JSONObject obj = new JSONObject();

        try {
            obj.put("exchange1", uah.getBuyUSD());
            obj.put("exchange2", uah.getBuyRUB());
            obj.put("exchange3", uah.getBuyEUR());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return obj;
    }

    public static JSONObject UAHCourseSell() {
        JSONObject obj = new JSONObject();

        try {
            obj.put("exchange1", uah.getSellUSD());
            obj.put("exchange2", uah.getSellRUB());
            obj.put("exchange3", uah.getSellEUR());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return obj;
    }

    public static JSONObject USDCourseBuy() {
        JSONObject obj = new JSONObject();

        try {
            obj.put("exchange1", usd.getBuyUAH());
            obj.put("exchange2", usd.getBuyRUB());
            obj.put("exchange3", usd.getBuyEUR());
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return obj;
    }

    public static JSONObject USDCourseSell() {
        JSONObject obj = new JSONObject();

        try {
            obj.put("exchange1", usd.getSellUAH());
            obj.put("exchange2", usd.getSellRUB());
            obj.put("exchange3", usd.getSellEUR());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return obj;
    }

    public static JSONObject EURCourseBuy() {
        JSONObject obj = new JSONObject();

        try {
            obj.put("exchange1", eur.getBuyUAH());
            obj.put("exchange2", eur.getBuyRUB());
            obj.put("exchange3", eur.getBuyUSD());
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return obj;
    }

    public static JSONObject EURCourseSell() {
        JSONObject obj = new JSONObject();

        try {
            obj.put("exchange1", eur.getSellUAH());
            obj.put("exchange2", eur.getSellRUB());
            obj.put("exchange3", eur.getSellUSD());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return obj;
    }

    public static JSONObject RUBCourseBuy() {
        JSONObject obj = new JSONObject();

        try {
            obj.put("exchange1", rub.getBuyUAH());
            obj.put("exchange2", rub.getBuyUSD());
            obj.put("exchange3", rub.getBuyEUR());
        } catch (JSONException e) {
            e.printStackTrace();
        }


        return obj;
    }

    public static JSONObject RUBCourseSell() {
        JSONObject obj = new JSONObject();

        try {
            obj.put("exchange1", rub.getSellUAH());
            obj.put("exchange2", rub.getSellUSD());
            obj.put("exchange3", rub.getSellEUR());
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return obj;
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        JSONObject newObj = new JSONObject();


        try {
            newObj = new JSONObject(request.getParameter("jsonData"));
        } catch (JSONException e) {
            e.printStackTrace();
        }


        PrintWriter writer = response.getWriter();
        JSONObject obj;


        String operation = "";
        String exchange = "";

        try {
            operation = newObj.getString("operationCall");
            exchange = newObj.getString("exchange");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        if (operation.equals("buy") && exchange.equals("usd")) {
                    obj = USDCourseBuy();
        } else if (operation.equals("sell") && exchange.equals("usd")) {
            obj = USDCourseSell();
        } else if (operation.equals("buy") && exchange.equals("rub")) {
            obj = RUBCourseBuy();
        }else if (operation.equals("sell") && exchange.equals("rub")) {
            obj = RUBCourseSell();
        }else if (operation.equals("buy") && exchange.equals("eur")) {
            obj = EURCourseBuy();
        }else if (operation.equals("sell") && exchange.equals("eur")) {
            obj = EURCourseSell();
        }else if (operation.equals("buy") && exchange.equals("uah")) {
            obj = UAHCourseBuy();
        } else {
            obj = UAHCourseSell();
        }

        writer.println(obj);
        writer.flush();

    }

}
