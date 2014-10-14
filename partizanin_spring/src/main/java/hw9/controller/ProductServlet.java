package hw9.controller;

import hw9.domain.Product;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 15.07.2014
 * Time: 16:12
 * To change this template use File|Setting|File Templates.
 */
@Controller
@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    //    private WebApplicationContext context;
    private List<Product> products;
    private Map<Product, Integer> basket;
//    private User user;

    @Override
    public void init() {
//        context = context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());

        Locale.setDefault(Locale.ENGLISH);
        basket = new HashMap<Product, Integer>();
        products = new ArrayList<Product>();
        products.add(new Product("Bread", 4.50));
        products.add(new Product("Water", 8.70));
        products.add(new Product("Eggs", 12.20));
        products.add(new Product("Sugar", 12.30));
        products.add(new Product("Meet", 20.30));
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {
//        user = (User) context.getBean("User");

        String product = "";
        if (request.getParameter("product") != null) {

            product = request.getParameter("product");


            if (product.equals("Meet")) {

                request.setAttribute("product", "Meet");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else if (product.equals("Mineral Water")) {

                request.setAttribute("product", "Mineral Water");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else if (product.equals("Bread")) {

                request.setAttribute("product", "Bread");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else if (product.equals("Eggs")) {

                request.setAttribute("product", "Eggs");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else if (product.equals("Sugar")) {

                request.setAttribute("product", "Sugar");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            }
        }
    }


    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {
//        user = (User) context.getBean("user");


        String product = "";
        if (request.getParameter("product") != null) {

            product = request.getParameter("product");


            if (product.equals("Meet")) {

                request.setAttribute("product", "Meet");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else if (product.equals("Mineral Water")) {

                request.setAttribute("product", "Mineral Water");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else if (product.equals("Bread")) {

                request.setAttribute("product", "Bread");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else if (product.equals("Eggs")) {

                request.setAttribute("product", "Eggs");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else if (product.equals("Sugar")) {

                request.setAttribute("product", "Sugar");
                request.getRequestDispatcher("WEB-INF/jsps/Buy.jsp").forward(request, response);

            } else {

                request.setAttribute("prodwwuct", "Sugar");
                request.getRequestDispatcher("").forward(request, response);

            }
        }
    }

}
