package hw9.controller;

import hw9.domain.User;
import hw9.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 15.07.2014
 * Time: 14:28
 * To change this template use File|Setting|File Templates.
 */
@Controller
@WebServlet("/Controller")
public class ServletController extends HttpServlet {

    List<User> users;
    private UserServiceImpl userService;
    @Autowired
    private WebApplicationContext context;

    @Override
    public void init() {
        context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        userService = (UserServiceImpl) context.getBean("UserServiceImpl");

        users = userService.findAll();

        if (request.getParameter("loginButton") != null) {

            String login = request.getParameter("login");
            String password = request.getParameter("password");

            if (searchUsers(login, password)) {

                request.setAttribute("message", "Login Successful");
                request.getRequestDispatcher("WEB-INF/jsps/Products.jsp").forward(request, response);
//                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);
            } else if (searchLogin(login)) {

                request.setAttribute("message", "Password incorrect");
                request.getRequestDispatcher("index2.jsp").forward(request, response);

            } else if (searchPassword(password)) {

                request.setAttribute("message", "Login incorrect");
                request.getRequestDispatcher("index2.jsp").forward(request, response);

            } else {
                request.setAttribute("message", "This user not exist");
                request.getRequestDispatcher("index2.jsp").forward(request, response);

            }

        }


        if (request.getParameter("registrationButton") != null) {
            request.setAttribute("", "");
            request.getRequestDispatcher("WEB-INF/jsps/Registration.jsp").forward(request, response);

        }
        /*    request.setAttribute("list",users);
            request.getRequestDispatcher("/Products").forward(request,response);
    */


        if (request.getParameter("RegistrationButton") != null) {

            String login = request.getParameter("login");
            String password = request.getParameter("password1");
            String password2 = request.getParameter("password2");

            if (!searchLogin(login)) {

                if (password.equals(password2)) {

                    if (chackPassword(password)) {

                        users.add(new User(login, password));
                        request.setAttribute("message", "Registration was successful");
                        request.getRequestDispatcher("index2.jsp").forward(request, response);

                    } else {
                        request.setAttribute("message", "password does not meet the requirements");
                        request.getRequestDispatcher("WEB-INF/jsps/Registration.jsp").forward(request, response);

                    }

                } else {
                    request.setAttribute("message", "Passwords do not match");
                    request.getRequestDispatcher("WEB-INF/jsps/Registration.jsp").forward(request, response);

                }


            } else {
                request.setAttribute("message", "This login is already exist");
                request.getRequestDispatcher("WEB-INF/jsps/Registration.jsp").forward(request, response);

            }

        }


    }

    /*1. Длинна 8 символов.
    2. В пароле должны быть буквы, цифры, большие буквы.
    3. Пароль не должен совпадать с логином*/
    public boolean chackPassword(String password) {

        return password.length() > 8 && password.matches("[a-zA-Z]+\\d*[a-zA-Z]*\\d+");


    }

    public boolean searchLogin(String login) {

        for (User user : users) {

            if (user.getLogin().equals(login)) {

                return true;
            }
        }

        return false;
    }

    public boolean searchPassword(String password) {

        for (User user : users) {

            if (user.getPassword().equals(password)) {

                return true;
            }
        }

        return false;
    }

    public boolean searchUsers(String login, String password) {

        for (User user : users) {

            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {

                return true;
            }

        }

        return false;
    }
}
