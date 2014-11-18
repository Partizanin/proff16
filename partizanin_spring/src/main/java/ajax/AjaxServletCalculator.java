package ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 03.09.2014
 * Time:  12:44
 * To change this template use File|Setting|File Templates.
 */
@WebServlet("/ServletTest")
public class AjaxServletCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int val1 = Integer.parseInt(request.getParameter("val1"));
        int val2 = Integer.parseInt(request.getParameter("val2"));
        System.out.println(val2 + val1);
        Double d = Math.pow(val1, 2);
        PrintWriter writer = response.getWriter();
        writer.println(d);
        System.out.println(d);

    }
}
