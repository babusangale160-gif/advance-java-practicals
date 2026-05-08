import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/Server")
public class Server extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String uname = request.getParameter("txtN1");
        String pwd = request.getParameter("txtN2");

        out.println("<html><body>");
        out.println("<h2>Uname: " + uname + "</h2>");
        out.println("<h2>Pwd: " + pwd + "</h2>");
        out.println("</body></html>");
    }
}