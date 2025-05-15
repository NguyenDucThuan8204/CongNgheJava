package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class LoginController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Kiểm tra username và password (ví dụ tạm thời)
        if ("admin".equals(username) && "123456".equals(password)) {
            // Nếu đúng, chuyển đến trang success.jsp
            return new ModelAndView("success");
        } else {
            // Nếu sai, chuyển đến trang error.jsp
            return new ModelAndView("error");
        }
    }
}
