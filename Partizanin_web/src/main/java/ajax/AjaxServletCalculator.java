package ajax;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 03.09.2014
 * Time:  12:44
 * To change this template use File|Setting|File Templates.
 */
@WebServlet("/Main")
public class AjaxServletCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String username = request.getParameter("name");
        String password = request.getParameter("pass");
        System.out.println(username + " " + password);
        System.out.println(username + " " + password);
        System.out.println(username + " " + password);
        System.out.println(username + " " + password);
        System.out.println(username + " " + password);
        System.out.println(username + " " + password);

    }
}
