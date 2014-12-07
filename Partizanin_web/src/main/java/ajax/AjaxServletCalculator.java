package ajax;


import org.json.JSONException;
import org.json.JSONObject;

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
@WebServlet(name = "AjaxServletCalculator", urlPatterns = "/AjaxServletCalculator")
public class AjaxServletCalculator extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
/*response.setContentType("application/json;charset=utf-8");

        JSONObject json = new JSONObject();
        JSONArray array = new JSONArray();
        JSONObject member =  new JSONObject();

        member.put("arrayData", sampleData);
        array.add(member);

        json.put("jsonArray", array);

        PrintWriter pw = response.getWriter();
        pw.print(json.toString());
        pw.close();*/

        /*
        JSONObject jObj = new JSONObject(request.getParameter("mydata")); // this parses the json
Iterator it = jObj.keys(); //gets all the keys

while(it.hasNext())
{
    String key = it.next(); // get key
    Object o = jObj.get(key); // get value
    session.putValue(key, o); // store in session
}*/

        JSONObject newObj = new JSONObject();
        try {
            newObj = new JSONObject(request.getParameter("jsonData"));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        int val2 = 0;
        int val1 = 0;
        try {
            val2 = Integer.parseInt(newObj.getJSONObject("mydata").getString("number2"));
            val1 = Integer.parseInt(newObj.getJSONObject("mydata").getString("number1"));

        } catch (JSONException e) {
            e.printStackTrace();
        }


        System.out.println(val2 + val1);
        Double d = Math.pow(val1, 2);
        PrintWriter writer = response.getWriter();
        JSONObject obj = new JSONObject();
        try {
            obj.put("results", d);
            obj.put("resultText", "foo");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        writer.println(obj);
        writer.flush();
        System.out.println(obj);

    }
}
