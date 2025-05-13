/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author thuan
 */
public class colorFilter {
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        String color = req.getParameter("color");
        if (color != null && !color.matches("red|blue|green")) {
            request.getRequestDispatcher("color.jsp").forward(request, response);
            return;
        }
        chain.doFilter(request, response);
    }
    
    public void init(FilterConfig filterConfig) {}
    public void destroy() {}

    
}
