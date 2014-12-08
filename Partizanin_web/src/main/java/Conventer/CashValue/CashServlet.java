package Conventer.CashValue;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Cash", urlPatterns = "/Cash")
public class CashServlet extends HttpServlet {

    public static void UAH(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("UAH");


        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            String buyUSD = "";
            String buyEUR = "";
            String buyRUB = "";
            request.setAttribute("UAHResult", value);
            request.setAttribute("USDResult", buyUSD);
            request.setAttribute("EURResult", buyEUR);
            request.setAttribute("RUBResult", buyRUB);


            Cookie cookie0 = new Cookie("USDOld", String.valueOf(buyUSD));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("EUROld", String.valueOf(buyEUR));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("RUBROld", String.valueOf(buyRUB));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);

            Cookie cookie3 = new Cookie("UAHOld", String.valueOf(value));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);

        } else {

            String buyUSD = "";
            String buyEUR = "";
            String buyRUB = "";

            request.setAttribute("UAHResult", value);
            request.setAttribute("USDResult", buyUSD);
            request.setAttribute("EURResult", buyEUR);
            request.setAttribute("RUBResult", buyRUB);


            Cookie cookie0 = new Cookie("USDOld", String.valueOf(buyUSD));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("EUROld", String.valueOf(buyEUR));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("RUBROld", String.valueOf(buyRUB));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);

            Cookie cookie3 = new Cookie("UAHOld", String.valueOf(value));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);

        }

        request.getRequestDispatcher("index.html").forward(request, response);


    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        Cookie[] cookie = request.getCookies();
        String USDCookie = "";
        String RUBCookie = "";
        String EURCookie = "";
        String UAHCookie = "";

        String UAHParam = request.getParameter("UAH");
        UAHParam = UAHParam.replaceAll(",", ".");
        String RUBParam = request.getParameter("RUB");
        RUBParam = RUBParam.replaceAll(",", ".");
        String EURParam = request.getParameter("EUR");
        EURParam = EURParam.replaceAll(",", ".");
        String USDParam = request.getParameter("USD");
        USDParam = USDParam.replaceAll(",", ".");
        for (Cookie cookie1 : cookie) {

            if (cookie1.getName().equals("UAHOld")) {

                UAHCookie = cookie1.getValue();
                UAHCookie = UAHCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("EUROld")) {

                EURCookie = cookie1.getValue();
                EURCookie = EURCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("USDOld")) {

                USDCookie = cookie1.getValue();
                USDCookie = USDCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("RUBOld")) {

                RUBCookie = cookie1.getValue();
                RUBCookie = RUBCookie.replaceAll(",", ".");
            }


        }

        UAH(request, response);


    }
}
