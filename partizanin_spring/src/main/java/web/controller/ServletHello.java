package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import web.domain.User;
import web.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Locale;

/**
 * Created with IntelliJ IDEA.
 * User: al1
 * Date: 9/8/13
 */
@Controller
@WebServlet("/springHello")
public class ServletHello extends HttpServlet {
    private WebApplicationContext context;

    private UserService service;

    @Override
    public void init() {
        Locale.setDefault(Locale.ENGLISH);
        context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    }


    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
        service = (UserService) context.getBean("userServiceImpl");

        String login = request.getParameter("login");
        String password = request.getParameter("pass");
        User user = new User(login, password);
        service.createUser(user);

        if (request.getParameter("Registration") != null) {
            System.out.println("Registration");
            System.out.println("Registration");
            System.out.println("Registration");
            if (context != null) {
                String login2 = request.getParameter("login");
                String password2 = request.getParameter("pass");
                User user2 = new User(login, password);
                service.createUser(user);
                request.setAttribute("dsgdfh", "false");
                request.getRequestDispatcher("/index2.jsp").forward(request, response);
                //response.getWriter().print(message);
            } else {
                response.getWriter().print("Error: Context not found!");
            }
        }
    }
}
