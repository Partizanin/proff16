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
 * Date: 07.09.2014
 * Time:  11:42
 * To change this template use File|Setting|File Templates.
 */

@WebServlet("/MyServlet")
public class ajaxServlet2 extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {

        String catName = request.getParameter("catName");
        System.out.println(catName);
    }

}
