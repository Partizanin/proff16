package hw11.controller.admin;

import hw11.model.domain.Operator;
import org.springframework.stereotype.Controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Project name: proff16
 * User: Partizanin
 * Date: 21.09.2014
 * Time:  11:54
 * To change this template use File|Setting|File Templates.
 */
@Controller
@WebServlet("/OperatorTable")
public class OperatorTableServlet extends HttpServlet {

  /*  private WebApplicationContext context;

    private AdminService adminService;
    private OperatorService operatorService;
    private ClientService clientService;*/


    private List<Operator> operators = new ArrayList<>(10);


    @Override
    public void init()
            throws ServletException {
/*        Locale.setDefault(Locale.ENGLISH);
        context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());*/

    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


       /* adminService = (AdminService) context.getBean("adminServiceImpl");
        operatorService = (OperatorService) context.getBean("operatorServiceImpl");
        clientService = (ClientService) context.getBean("clientServiceImpl");*/

        String message = "";
        String action = request.getParameter("action");

        if (action.equals("Return")) {
            request.getRequestDispatcher("/hw11/jsp/admins/enterAdmin.jsp").forward(request, response);
        }

        String operator_id = request.getParameter("operatorID");
        String operator_login = request.getParameter("operatorLogin");
        String operator_password = request.getParameter("operatorPass");
        String operator_identifyNumber = request.getParameter("operatorIDN");
        String operator_invitor = request.getParameter("operatorAnotherLogin");
        Long operatorId = 0l;


        Operator operator = new Operator();

        operator.setPassword(operator_password);
        operator.setLogin(operator_login);

        operator.setLoginAnotherOperator(operator_invitor);

        if (operator_identifyNumber != null && !operator_identifyNumber.equals("")) {
            try {
                operator.setIdentifyNumber(Integer.parseInt(operator_identifyNumber));
            } catch (NumberFormatException e) {
                message = "Pleas input correct identify number!!!";
                request.setAttribute("operator", operator);
                request.setAttribute("operatorList", operators);
                request.setAttribute("message", message);
                request.getRequestDispatcher("/hw11/jsp/admins/functions/operatorsList.jsp").forward(request, response);

            }
        }

        if (operator_id != null && !operator_id.equals("")) {
            try {
                operatorId = Long.parseLong(operator_id);
                operator.setId(operatorId);
            } catch (NumberFormatException e) {
                message = "Pleas input correct id";
                request.setAttribute("operator", operator);
                request.setAttribute("operatorList", operators);
                request.setAttribute("message", message);
                request.getRequestDispatcher("/hw11/jsp/admins/functions/operatorsList.jsp").forward(request, response);

            }

        }

        if (operators.size() < 1 && !action.equals("Add")) {
       /*     request.setAttribute("message","The list does not have operators, add one");
            request.getRequestDispatcher("/hw11/jsp/admins/functions/operatorsList.jsp").forward(request, response);
       */

            Operator operator1 = new Operator("Partizanin", "95999599w", 1111, "Main Operator");
            operator1.setId(1l);
            operators.add(operator1);

            operator1 = new Operator("Vasa", "123", 221321, "Partizanin");
            operator1.setId(2l);
            operators.add(operator1);

            operator1 = new Operator("Petya", "234", 3122, "Vasa");
            operator1.setId(3l);
            operators.add(operator1);

            operator1 = new Operator("Kolia", "12332442", 213123, "Petya");
            operator1.setId(4l);
            operators.add(operator1);


        }

        switch (action) {
            case "Add":

                message = operatorAdd(operator);

                break;
            case "Edit":
                message = editOperator(operator);

                break;
            case "Delete":

                message = deleteOperator(operator);

                break;
            case "Search":

                operator = searchOperator(operator);
                break;
        }

        /*operators = operatorService.findAll();*/
        request.setAttribute("operator", operator);
        request.setAttribute("message", message);
        request.setAttribute("operatorList", operators);
        request.getRequestDispatcher("/hw11/jsp/admins/functions/operatorsList.jsp").forward(request, response);

    }

    private String deleteOperator(Operator operator) {

        if (operator.getId() == null || operator.getId() == 0) {
            return "Pleas input id what you want delete!";
        }
        for (int i = 0; i < operators.size(); i++) {

            if (operators.get(i).getId().equals(operator.getId())) {

                operators.remove(i);
                break;
            }
        }

        return "";
    }

    private String editOperator(Operator operator) {
        Operator operator1 = searchOperator(operator);

        if (operator.getId() == null || operator.getId() == 0) {
            return "Pleas input id what you want delete!";
        }

        for (Operator operator2 : operators) {

            if (operator.getLogin().equals(operator2.getLogin())) {
                return "This login already use!\nPleas select another login";
            } else if (operator.getIdentifyNumber() == operator2.getIdentifyNumber()) {
                return "This identify number already use!\nPleas select another identify number";
            }
        }

        operator1.setLoginAnotherOperator(operator.getLoginAnotherOperator());
        operator1.setLogin(operator.getLogin());
        operator1.setPassword(operator.getPassword());
        operator1.setIdentifyNumber(operator.getIdentifyNumber());


        for (int i = 0; i < operators.size(); i++) {

            if (operators.get(i).getId().equals(operator.getId())) {

                operators.set(i, operator1);
                break;
            }
        }

        return "";
    }

    private Operator searchOperator(Operator operator) {
        Operator operator1 = new Operator();
        boolean wasFiend = false;

        if (operator.getId() != null && operator.getId() != 0) {
            for (Operator operator2 : operators) {
                if (operator.getId().equals(operator2.getId())) {

                    operator1 = operator2;
                    wasFiend = true;
                    break;
                }
            }
        } else if (operator.getLogin() != null && operator.getLogin().equals("")) {
            for (Operator operator2 : operators) {
                if (operator.getLogin().equals(operator2.getLogin())) {

                    operator1 = operator2;
                    wasFiend = true;
                    break;
                }
            }
        } else if (operator.getIdentifyNumber() != 0) {
            for (Operator operator2 : operators) {
                if (operator.getIdentifyNumber() == operator2.getIdentifyNumber()) {

                    operator1 = operator2;
                    wasFiend = true;
                    break;
                }
            }
        } else if (operator.getLoginAnotherOperator() != null && !operator.getLoginAnotherOperator().equals("")) {
            for (Operator operator2 : operators) {
                if (operator.getLoginAnotherOperator().equals(operator2.getLoginAnotherOperator())) {

                    operator1 = operator2;
                    wasFiend = true;
                    break;
                }
            }
        } else if (operator.getPassword() != null && !operator.getPassword().equals("")) {
            for (Operator operator2 : operators) {
                if (operator.getPassword().equals(operator2.getPassword())) {

                    operator1 = operator2;
                    wasFiend = true;
                    break;
                }
            }
        }

        if (!wasFiend) {
            long id = 0;
            int i = 0;


            for (int j = 0; j < operators.size(); j++) {
                if (operators.get(j).getId() > id) {
                    id = operators.get(i).getId();
                    i = j;
                }
            }

            operator1 = operators.get(i);

        }

        return operator1;
    }

    private String operatorAdd(Operator operator) {

        if (operator.getId() != null && operator.getId() != 0) {


            for (Operator operator1 : operators) {

                if (operator.getId().equals(operator1.getId())) {

                    return "This id already use,pleas input another id";
                } else if (operator.getLogin().equals(operator1.getLogin())) {
                    return "This login already use,pleas input another login";
                } else if (operator.getIdentifyNumber() == operator1.getIdentifyNumber()) {
                    return "This identify number already use,pleas input another identify number";
                }
            }
        } else {
            return "Pleas input id!!!";
        }

        operators.add(operator);
        return "";
    }
}
