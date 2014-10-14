package Conventer.ComputerValue;

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
 * Date: 16.08.2014
 * Time:  16:07
 * To change this template use File|Setting|File Templates.
 */
@WebServlet("/serv")
public class Servlet extends HttpServlet {

    public static void howMethod(HttpServletRequest request, HttpServletResponse response, String EksabyteCookie, String PetabyteCookie, String TerabyteCookie,
                                 String GigabyteCookie, String MegabyteCookie, String KilobyteCookie,
                                 String ByteCookie, String EksabyteParam, String PetabyteParam, String TerabyteParam,
                                 String GigabyteParam, String MegabyteParam, String KilobyteParam, String ByteParam) throws ServletException, IOException {


        if (EksabyteParam != null && !EksabyteParam.equals("") && !EksabyteCookie.equals(EksabyteParam)) {

            Eksabyte(request, response);
        } else if (PetabyteParam != null && !PetabyteParam.equals("") && !PetabyteCookie.equals(PetabyteParam)) {

            Pentabyte(request, response);
        } else if (TerabyteParam != null && !TerabyteParam.equals("") && !TerabyteCookie.equals(TerabyteParam)) {

            Terabyte(request, response);
        } else if (GigabyteParam != null && !GigabyteParam.equals("") && !GigabyteCookie.equals(GigabyteParam)) {

            Gigabyte(request, response);
        } else if (MegabyteParam != null && !MegabyteParam.equals("") && !MegabyteCookie.equals(MegabyteParam)) {

            Megabyte(request, response);
        } else if (KilobyteParam != null && !KilobyteParam.equals("") && !KilobyteCookie.equals(KilobyteParam)) {

            Kilobyte(request, response);
        } else if (ByteParam != null && !ByteParam.equals("") && !ByteCookie.equals(ByteParam)) {

            Byte(request, response);
        } else {
            All(request, response, EksabyteParam, PetabyteParam, TerabyteParam,
                    GigabyteParam, MegabyteParam, KilobyteParam, ByteParam);
        }

    }

    public static void All(HttpServletRequest request, HttpServletResponse response, String EksabyteParam, String PetabyteParam, String TerabyteParam,
                           String GigabyteParam, String MegabyteParam, String KilobyteParam, String ByteParam) throws ServletException, IOException {

        request.setAttribute("EksabyteResult", EksabyteParam);
        request.setAttribute("PetabyteResult", PetabyteParam);
        request.setAttribute("TerabyteResult", TerabyteParam);
        request.setAttribute("GigabyteResult", GigabyteParam);
        request.setAttribute("MegabyteResult", MegabyteParam);
        request.setAttribute("KilobyteResult", KilobyteParam);
        request.setAttribute("ByteResult", ByteParam);

        Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(EksabyteParam));
        cookie0.setMaxAge(60);
        response.addCookie(cookie0);

        Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(PetabyteParam));
        cookie1.setMaxAge(60);
        response.addCookie(cookie1);

        Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(TerabyteParam));
        cookie2.setMaxAge(60);
        response.addCookie(cookie2);


        Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(GigabyteParam));
        cookie3.setMaxAge(60);
        response.addCookie(cookie3);


        Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(MegabyteParam));
        cookie4.setMaxAge(60);
        response.addCookie(cookie4);


        Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(KilobyteParam));
        cookie5.setMaxAge(60);
        response.addCookie(cookie5);

        Cookie cookie6 = new Cookie("ByteOld", String.valueOf(ByteParam));
        cookie6.setMaxAge(60);
        response.addCookie(cookie6);

        request.getRequestDispatcher("index2.jsp").forward(request, response);
    }

    public static void Eksabyte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("UAH");


        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            Double Petabyte = Double.parseDouble(value) * 1024;
            Double Terabyte = Petabyte * 1024;
            Double Gigabyte = Terabyte * 1024;
            Double Megabyte = Gigabyte * 1024;
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(value));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(value));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        } else {

            Double Petabyte = Double.parseDouble(value) * 1024;
            Double Terabyte = Petabyte * 1024;
            Double Gigabyte = Terabyte * 1024;
            Double Megabyte = Gigabyte * 1024;
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;

            request.setAttribute("EksabyteResult", String.valueOf(value));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(value));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);


    }

    public static void Pentabyte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String value = request.getParameter("Petabyte");


        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            Double Eksabyte = Double.parseDouble(value) / 1024;
            Double Petabyte = Double.parseDouble(value);
            Double Terabyte = Petabyte * 1024;
            Double Gigabyte = Terabyte * 1024;
            Double Megabyte = Gigabyte * 1024;
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(value));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(value));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        } else {

            Double Eksabyte = Double.parseDouble(value) / 1024;
            Double Petabyte = Double.parseDouble(value);
            Double Terabyte = Petabyte * 1024;
            Double Gigabyte = Terabyte * 1024;
            Double Megabyte = Gigabyte * 1024;
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(value));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(value));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Terabyte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("Terabyte");


        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            Double Petabyte = Double.valueOf(value) / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Terabyte = Double.valueOf(value);
            Double Gigabyte = Terabyte * 1024;
            Double Megabyte = Gigabyte * 1024;
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(value));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(value));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        } else {

            Double Petabyte = Double.valueOf(value) / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Terabyte = Double.valueOf(value);
            Double Gigabyte = Terabyte * 1024;
            Double Megabyte = Gigabyte * 1024;
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(value));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(value));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Gigabyte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("Gigabyte");


        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            Double Terabyte = Double.valueOf(value) / 1024;
            Double Petabyte = Terabyte / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Gigabyte = Double.valueOf(value);
            Double Megabyte = Gigabyte * 1024;
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(value));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(value));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        } else {

            Double Terabyte = Double.valueOf(value) / 1024;
            Double Petabyte = Terabyte / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Gigabyte = Double.valueOf(value);
            Double Megabyte = Gigabyte * 1024;
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(value));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(value));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);

        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Megabyte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("Megabyte");


        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            Double Gigabyte = Double.valueOf(value) / 1024;
            Double Terabyte = Gigabyte / 1024;
            Double Petabyte = Terabyte / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Megabyte = Double.valueOf(value);
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(value));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(value));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        } else {

            Double Gigabyte = Double.valueOf(value) / 1024;
            Double Terabyte = Gigabyte / 1024;
            Double Petabyte = Terabyte / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Megabyte = Double.valueOf(value);
            Double Kilobyte = Megabyte * 1024;
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(value));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(value));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Kilobyte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("Kilobyte");


        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            Double Megabyte = Double.valueOf(value) / 1024;
            Double Gigabyte = Megabyte / 1024;
            Double Terabyte = Gigabyte / 1024;
            Double Petabyte = Terabyte / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Kilobyte = Double.valueOf(value);
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(value));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(value));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);

        } else {

            Double Megabyte = Double.valueOf(value) / 1024;
            Double Gigabyte = Megabyte / 1024;
            Double Terabyte = Gigabyte / 1024;
            Double Petabyte = Terabyte / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Kilobyte = Double.valueOf(value);
            Double Byte = Kilobyte * 1024;


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(value));
            request.setAttribute("ByteResult", String.valueOf(Byte));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(value));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(Byte));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);

        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    public static void Byte(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String value = request.getParameter("Byte");


        if (value.contains(",") || value.contains(".")) {

            value = value.replaceAll(",", ".");

            Double Kilobyte = Double.valueOf(value) / 1024;
            Double Megabyte = Kilobyte / 1024;
            Double Gigabyte = Megabyte / 1024;
            Double Terabyte = Gigabyte / 1024;
            Double Petabyte = Terabyte / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Byte = Double.valueOf(value);


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(value));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(value));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        } else {

            Double Kilobyte = Double.valueOf(value) / 1024;
            Double Megabyte = Kilobyte / 1024;
            Double Gigabyte = Megabyte / 1024;
            Double Terabyte = Gigabyte / 1024;
            Double Petabyte = Terabyte / 1024;
            Double Eksabyte = Petabyte / 1024;
            Double Byte = Double.valueOf(value);


            request.setAttribute("EksabyteResult", String.valueOf(Eksabyte));
            request.setAttribute("PetabyteResult", String.valueOf(Petabyte));
            request.setAttribute("TerabyteResult", String.valueOf(Terabyte));
            request.setAttribute("GigabyteResult", String.valueOf(Gigabyte));
            request.setAttribute("MegabyteResult", String.valueOf(Megabyte));
            request.setAttribute("KilobyteResult", String.valueOf(Kilobyte));
            request.setAttribute("ByteResult", String.valueOf(value));

            Cookie cookie0 = new Cookie("EksabyteOld", String.valueOf(Eksabyte));
            cookie0.setMaxAge(60);
            response.addCookie(cookie0);

            Cookie cookie1 = new Cookie("PetabyteOld", String.valueOf(Petabyte));
            cookie1.setMaxAge(60);
            response.addCookie(cookie1);

            Cookie cookie2 = new Cookie("TerabyteOld", String.valueOf(Terabyte));
            cookie2.setMaxAge(60);
            response.addCookie(cookie2);


            Cookie cookie3 = new Cookie("GigabyteOld", String.valueOf(Gigabyte));
            cookie3.setMaxAge(60);
            response.addCookie(cookie3);


            Cookie cookie4 = new Cookie("MegabyteOld", String.valueOf(Megabyte));
            cookie4.setMaxAge(60);
            response.addCookie(cookie4);


            Cookie cookie5 = new Cookie("KilobyteOld", String.valueOf(Kilobyte));
            cookie5.setMaxAge(60);
            response.addCookie(cookie5);

            Cookie cookie6 = new Cookie("ByteOld", String.valueOf(value));
            cookie6.setMaxAge(60);
            response.addCookie(cookie6);


        }

        request.getRequestDispatcher("index2.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        Cookie[] cookie = request.getCookies();
        String EksabyteCookie = "";
        String PetabyteCookie = "";
        String TerabyteCookie = "";
        String GigabyteCookie = "";
        String MegabyteCookie = "";
        String KilobyteCookie = "";
        String ByteCookie = "";

        String EksabyteParam = request.getParameter("UAH");
        EksabyteParam = EksabyteParam.replaceAll(",", ".");
        String PetabyteParam = request.getParameter("Petabyte");
        PetabyteParam = PetabyteParam.replaceAll(",", ".");
        String TerabyteParam = request.getParameter("Terabyte");
        TerabyteParam = TerabyteParam.replaceAll(",", ".");
        String GigabyteParam = request.getParameter("Gigabyte");
        GigabyteParam = GigabyteParam.replaceAll(",", ".");
        String MegabyteParam = request.getParameter("Megabyte");
        MegabyteParam = MegabyteParam.replaceAll(",", ".");
        String KilobyteParam = request.getParameter("Kilobyte");
        KilobyteParam = KilobyteParam.replaceAll(",", ".");
        String ByteParam = request.getParameter("Byte");
        ByteParam = ByteParam.replaceAll(",", ".");

        for (Cookie cookie1 : cookie) {

            if (cookie1.getName().equals("EksabyteOld")) {

                EksabyteCookie = cookie1.getValue();
                EksabyteCookie = EksabyteCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("PetabyteOld")) {

                PetabyteCookie = cookie1.getValue();
                PetabyteCookie = PetabyteCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("TerabyteOld")) {

                TerabyteCookie = cookie1.getValue();
                TerabyteCookie = TerabyteCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("GigabyteOld")) {

                GigabyteCookie = cookie1.getValue();
                GigabyteCookie = GigabyteCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("MegabyteOld")) {

                MegabyteCookie = cookie1.getValue();
                MegabyteCookie = MegabyteCookie.replaceAll(",", ".");
            }

            if (cookie1.getName().equals("KilobyteOld")) {

                KilobyteCookie = cookie1.getValue();
                KilobyteCookie = KilobyteCookie.replaceAll(",", ".");
            }
            if (cookie1.getName().equals("ByteOld")) {

                ByteCookie = cookie1.getValue();
                ByteCookie = ByteCookie.replaceAll(",", ".");
            }

        }

        howMethod(request, response, EksabyteCookie, PetabyteCookie, TerabyteCookie,
                GigabyteCookie, MegabyteCookie, KilobyteCookie,
                ByteCookie, EksabyteParam, PetabyteParam, TerabyteParam,
                GigabyteParam, MegabyteParam, KilobyteParam, ByteParam);


    }

}

