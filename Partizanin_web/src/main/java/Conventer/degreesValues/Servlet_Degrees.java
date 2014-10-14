package Conventer.degreesValues;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 27.08.2014
 * Time:  19:16
 * To change this template use File|Setting|File Templates.
 */
@WebServlet("/degrees")
public class Servlet_Degrees extends HttpServlet {

    public static DegreesUtils du = new DegreesUtils();

    public static void howMethod(HttpServletRequest request, HttpServletResponse response, String CelsiyParam, String CelvinParam, String FarengeitParam,
                                 String RankinParam, String ReomurParam, String CelsiyCookie, String FarengeitCookie, String RankinCookie, String ReomurCookie, String CelvinCookie) throws ServletException, IOException {


        if (CelsiyParam != null && !CelsiyParam.equals("") && !CelsiyCookie.equals(CelsiyParam)) {

            Celsiy(request, response);
        } else if (FarengeitParam != null && !FarengeitParam.equals("") && !FarengeitCookie.equals(FarengeitParam)) {

            Farengeit(request, response);
        } else if (CelvinParam != null && !CelvinParam.equals("") && !CelvinCookie.equals(CelvinParam)) {

            Celvin(request, response);
        } else if (ReomurParam != null && !ReomurParam.equals("") && !ReomurCookie.equals(ReomurParam)) {

            Reomur(request, response);
        } else if (RankinParam != null && !RankinParam.equals("") && !RankinCookie.equals(RankinParam)) {

            Rankin(request, response);

        } else {
            All(request, response, CelsiyParam, CelvinParam, FarengeitParam, RankinParam, ReomurParam);
        }

    }

    public static void Celsiy(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String value = request.getParameter("Celsiy");

        du.Celsiy(value);

        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");


            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(value));
            request.setAttribute("CelvinResult", String.valueOf(celvin));
            request.setAttribute("ReomurResult", String.valueOf(reomur));
            request.setAttribute("FarengeitResult", String.valueOf(farengeit));
            request.setAttribute("RankinResult", String.valueOf(rankin));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(value));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(celvin));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(farengeit));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(rankin));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(reomur));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        } else {


            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(value));
            request.setAttribute("CelvinResult", String.valueOf(celvin));
            request.setAttribute("ReomurResult", String.valueOf(reomur));
            request.setAttribute("FarengeitResult", String.valueOf(farengeit));
            request.setAttribute("RankinResult", String.valueOf(rankin));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(value));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(celvin));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(farengeit));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(rankin));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(reomur));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Celvin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String value = request.getParameter("Celvin");

        du.Celvin(value);

        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");


            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(celsiy));
            request.setAttribute("CelvinResult", String.valueOf(value));
            request.setAttribute("ReomurResult", String.valueOf(reomur));
            request.setAttribute("FarengeitResult", String.valueOf(farengeit));
            request.setAttribute("RankinResult", String.valueOf(rankin));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(celsiy));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(value));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(farengeit));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(rankin));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(reomur));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        } else {


            double celvin = Double.valueOf(value);
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(celsiy));
            request.setAttribute("CelvinResult", String.valueOf(value));
            request.setAttribute("ReomurResult", String.valueOf(reomur));
            request.setAttribute("FarengeitResult", String.valueOf(farengeit));
            request.setAttribute("RankinResult", String.valueOf(rankin));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(celsiy));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(value));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(farengeit));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(rankin));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(reomur));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Reomur(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String value = request.getParameter("Reomur");

        du.Reomur(value);

        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");


            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(celsiy));
            request.setAttribute("CelvinResult", String.valueOf(celvin));
            request.setAttribute("ReomurResult", String.valueOf(value));
            request.setAttribute("FarengeitResult", String.valueOf(farengeit));
            request.setAttribute("RankinResult", String.valueOf(rankin));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(celsiy));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(celvin));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(farengeit));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(rankin));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(value));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        } else {


            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(celsiy));
            request.setAttribute("CelvinResult", String.valueOf(celvin));
            request.setAttribute("ReomurResult", String.valueOf(value));
            request.setAttribute("FarengeitResult", String.valueOf(farengeit));
            request.setAttribute("RankinResult", String.valueOf(rankin));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(celsiy));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(celvin));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(farengeit));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(rankin));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(value));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Rankin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String value = request.getParameter("Rankin");

        du.Rankin(value);

        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");


            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(celsiy));
            request.setAttribute("CelvinResult", String.valueOf(celvin));
            request.setAttribute("ReomurResult", String.valueOf(reomur));
            request.setAttribute("FarengeitResult", String.valueOf(farengeit));
            request.setAttribute("RankinResult", String.valueOf(value));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(celsiy));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(celvin));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(farengeit));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(value));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(reomur));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        } else {


            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(celsiy));
            request.setAttribute("CelvinResult", String.valueOf(celvin));
            request.setAttribute("ReomurResult", String.valueOf(reomur));
            request.setAttribute("FarengeitResult", String.valueOf(farengeit));
            request.setAttribute("RankinResult", String.valueOf(value));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(celsiy));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(celvin));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(farengeit));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(value));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(reomur));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Farengeit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String value = request.getParameter("Farengeit");

        du.Reomur(value);

        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(celsiy));
            request.setAttribute("CelvinResult", String.valueOf(celvin));
            request.setAttribute("ReomurResult", String.valueOf(reomur));
            request.setAttribute("FarengeitResult", String.valueOf(value));
            request.setAttribute("RankinResult", String.valueOf(rankin));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(celsiy));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(celvin));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(value));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(rankin));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(reomur));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        } else {


            double celvin = Double.valueOf(du.getCelvin());
            double celsiy = Double.valueOf(du.getCelsiy());
            double rankin = Double.valueOf(du.getRankin());
            double reomur = Double.valueOf(du.getReomur());
            double farengeit = Double.valueOf(du.getFarengeit());


            request.setAttribute("СelsiyResult", String.valueOf(celsiy));
            request.setAttribute("CelvinResult", String.valueOf(celvin));
            request.setAttribute("ReomurResult", String.valueOf(reomur));
            request.setAttribute("FarengeitResult", String.valueOf(value));
            request.setAttribute("RankinResult", String.valueOf(rankin));


            Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(celsiy));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(celvin));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(value));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("RankinOld", String.valueOf(rankin));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(reomur));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);
    }

    public static void All(HttpServletRequest request, HttpServletResponse response, String CelsiyParam, String CelvinParam, String FarengeitParam,
                           String RankinParam, String ReomurParam) throws ServletException, IOException {


        request.setAttribute("СelsiyResult", String.valueOf(CelsiyParam));
        request.setAttribute("CelvinResult", String.valueOf(CelvinParam));
        request.setAttribute("ReomurResult", String.valueOf(ReomurParam));
        request.setAttribute("FarengeitResult", String.valueOf(FarengeitParam));
        request.setAttribute("RankinResult", String.valueOf(RankinParam));


        Cookie cookie0 = new Cookie("CelsiyOld", String.valueOf(CelsiyParam));
        cookie0.setMaxAge(60);
        response.addCookie(cookie0);

        Cookie cookie1 = new Cookie("CelvinOld", String.valueOf(CelvinParam));
        cookie1.setMaxAge(60);
        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("FarengeitOld", String.valueOf(FarengeitParam));
        cookie2.setMaxAge(60);
        response.addCookie(cookie2);


        Cookie cookie3 = new Cookie("RankinOld", String.valueOf(RankinParam));
        cookie3.setMaxAge(60);
        response.addCookie(cookie3);


        Cookie cookie4 = new Cookie("ReomurOld", String.valueOf(ReomurParam));
        cookie4.setMaxAge(60);
        response.addCookie(cookie4);

        request.getRequestDispatcher("index2.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookie = request.getCookies();
        String CelsiyCookie = "";
        String FarengeitCookie = "";
        String RankinCookie = "";
        String ReomurCookie = "";
        String CelvinCookie = "";


        String CelsiyParam = request.getParameter("Celsiy");
        CelsiyParam = CelsiyParam.replaceAll(",", ".");
        String CelvinParam = request.getParameter("Celvin");
        CelvinParam = CelvinParam.replaceAll(",", ".");
        String FarengeitParam = request.getParameter("Farengeit");
        FarengeitParam = FarengeitParam.replaceAll(",", ".");
        String RankinParam = request.getParameter("Rankin");
        RankinParam = RankinParam.replaceAll(",", ".");
        String ReomurParam = request.getParameter("Reomur");
        ReomurParam = ReomurParam.replaceAll(",", ".");

        for (Cookie cookie1 : cookie) {

            if (cookie1.getName().equals("CelsiyOld")) {

                CelsiyCookie = cookie1.getValue();
                CelsiyCookie = CelsiyCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("CelvinOld")) {

                CelvinCookie = cookie1.getValue();
                CelvinCookie = CelvinCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("FarengeitOld")) {

                FarengeitCookie = cookie1.getValue();
                FarengeitCookie = FarengeitCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("RankinOld")) {

                RankinCookie = cookie1.getValue();
                RankinCookie = RankinCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("ReomurOld")) {

                ReomurCookie = cookie1.getValue();
                ReomurCookie = ReomurCookie.replaceAll(",", ".");
            }


        }
        howMethod(request, response, CelsiyParam, CelvinParam, FarengeitParam, RankinParam, ReomurParam, CelsiyCookie,
                FarengeitCookie, RankinCookie, ReomurCookie, CelvinCookie);

    }
}
