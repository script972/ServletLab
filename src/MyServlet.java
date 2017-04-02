import groovy.json.JsonBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Created by script972 on 12.02.2017.
 */
@WebServlet(value = "/MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        double valueA = Double.parseDouble(request.getParameter("valueA"));
        double valueB = Double.parseDouble(request.getParameter("valueB"));
        double valueC = Double.parseDouble(request.getParameter("valueC"));


        double valueFrom = Double.parseDouble(request.getParameter("valueFrom"));
        double valueTo = Double.parseDouble(request.getParameter("valueTo"));
        double valueStep = Double.parseDouble(request.getParameter("valueStep"));

        Count count = new Count(valueA, valueB, valueC);
        count.createArray(valueStep, valueFrom, valueTo);
        response.setContentType("text/html");
        response.getWriter().print("Количество табуляций " + count.tablH(valueStep, valueFrom, valueTo));
        response.getWriter().print("Масиви: ");
        response.getWriter().print("<div style=' width:500px; padding:20px; height:500px; overflow:scroll; margin:auto; border: 1px solid black; '>");
        for (int i = 0; i < count.tablH(valueStep, valueFrom, valueTo); i++) {
            response.getWriter().print("<p> Індекс: " + i + " X: " + roundDownScale2(count.getX(i)) + " Y: " + roundDownScale2(count.getY(i)) + "</p>");
        }
        response.getWriter().print("</div>");
        response.getWriter().print("<p> " + count.maxArrYOut() + " </p>");
        response.getWriter().print("<p> " + count.minArrYOut() + " </p>");
        response.getWriter().print("<p> " + count.midleSummArrYOut() + " </p>");
        response.getWriter().print("<p> " + count.summArrYOut() + " </p>");
        //response.getWriter().print(count.resultY(2));
        /*response.getWriter().print("<h1>valueA HERAK"+valueA+"</h1> ");*/

    }
    /*http://localhost:8080/serv_war_exploded/MyServlet?valueA=2.8&valueB=2&valueC=4&valueFrom=0&valueTo=2&valueStep=0.002*/

    public static double roundDownScale2(double aValue) {
        BigDecimal decimal = new BigDecimal(aValue);
//    decimal = decimal.setScale(10,BigDecimal.ROUND_UP);
        decimal = decimal.setScale(3, BigDecimal.ROUND_DOWN);
        double result = decimal.doubleValue();
        return result;
    }
}

