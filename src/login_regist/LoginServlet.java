package login_regist;

import java.io.IOException;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import login_regist.UserDao;  
  
public class LoginServlet extends HttpServlet {  
  
    private static final long serialVersionUID = 1L;  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        request.setCharacterEncoding("utf-8");  
        response.setContentType("text/html;charset=utf-8");  
        
        String username = request.getParameter("username"); 
        String password = request.getParameter("password");
        String phone = request.getParameter("phone");
        String idnum = request.getParameter("idnum");
        
        String psw =new UserDao().findIdnum(idnum);

        if(psw ==null){  
            request.setAttribute("msg", "没有这个用户！");  
            request.getRequestDispatcher("/index.jsp").forward(request, response);  
            return;  
        }  
        if(psw!=null&&!psw.equals(password)){  
            request.setAttribute("msg", "密码错误请重新输入！"); 
            request.getRequestDispatcher("/index.jsp").forward(request, response);  
            return;  
        }  
        if(psw.equals(password)){  
            request.setAttribute("msg", "用户："+username+",欢迎访问");  
            //以下仿照上句代码
            request.setAttribute("username",  username);
            request.setAttribute("password",  password);
            request.setAttribute("phone",  phone);
            request.setAttribute("idnum",  idnum);
            
            request.getRequestDispatcher("/welcome.jsp").forward(request, response);    
        }
          
    }  
  
}  