package ajax;

import org.springframework.stereotype.Controller;

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
 * Date: 22.07.2014
 * Time: 15:12
 * To change this template use File|Setting|File Templates.
 */

@Controller
@WebServlet("/Search")
public class SearchServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameter("client") != null) {

            request.getRequestDispatcher("/hw11/jsp/clients/LoginClient.jsp").forward(request, response);

        } else if (request.getParameter("operator") != null) {

            request.getRequestDispatcher("/hw11/jsp/operators/LoginOperator.jsp").forward(request, response);

        } else if (request.getParameter("administrator") != null) {

            request.getRequestDispatcher("/hw11/jsp/admins/LoginAdministrator.jsp").forward(request, response);

        } else if (request.getParameter("button").equals("Show Administrators List")) {

            request.setAttribute("", "");
            request.getRequestDispatcher("/hw11/jsp/admins/functions/adminsList.jsp").forward(request, response);

        } else if (request.getParameter("button").equals("Show Clients List")) {

            request.setAttribute("", "");

            request.getRequestDispatcher("/hw11/jsp/admins/functions/clientsList.jsp").forward(request, response);

        } else if (request.getParameter("button").equals("Show Operators List")) {

            request.setAttribute("", "");
            request.getRequestDispatcher("/hw11/jsp/admins/functions/operatorsList.jsp").forward(request, response);

        }

    }
}
