import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.io.*;

@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // Read form data
        double n1 = Double.parseDouble(request.getParameter("txtN1"));
        double n2 = Double.parseDouble(request.getParameter("txtN2"));
        String opr = request.getParameter("opr");

        double result = 0;
        String operation = "";

        // Perform calculation
        switch(opr) {
            case "+":
                result = n1 + n2;
                operation = "Addition";
                break;
            case "-":
                result = n1 - n2;
                operation = "Subtraction";
                break;
            case "*":
                result = n1 * n2;
                operation = "Multiplication";
                break;
            case "/":
                if(n2 != 0)
                    result = n1 / n2;
                else {
                    out.println("<h3>Error: Division by zero!</h3>");
                    return;
                }
                operation = "Division";
                break;
        }

        // Display result
        out.println("<html><body>");
        out.println("<h2>Calculator Result</h2>");
        out.println("<p>First Number: " + n1 + "</p>");
        out.println("<p>Second Number: " + n2 + "</p>");
        out.println("<p>Operation: " + operation + "</p>");
        out.println("<h3>Result = " + result + "</h3>");
        out.println("<a href='calc.html'>Go Back</a>");
        out.println("</body></html>");
    }
}