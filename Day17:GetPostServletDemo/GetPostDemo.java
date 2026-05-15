import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class GetPostDemo extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>GET Method Example</h2>");
        out.println("<h3>Hello " + name + "</h3>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("name");

        out.println("<html><body>");
        out.println("<h2>POST Method Example</h2>");
        out.println("<h3>Welcome " + name + "</h3>");
        out.println("</body></html>");
    }
}
