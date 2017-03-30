package login_regist;

import java.io.IOException;  

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  

import login_regist.UserDao;
  
public class RegistServlet extends HttpServlet {  
  
    private static final long serialVersionUID = 1L;  
  
    public void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        request.setCharacterEncoding("utf-8");  
        response.setContentType("text/html;charset=utf-8");  
        String username = request.getParameter("username");  
        String password = request.getParameter("password");  
        String rpsw = request.getParameter("rpsw");
        String phone = request.getParameter("phone");
        String idnum = request.getParameter("idnum"); //�õ�������������� 
        
        if(idnum==null||idnum.trim().isEmpty()){  
            request.setAttribute("msg", "�ʺŲ���Ϊ��");  
            request.getRequestDispatcher("/regist.jsp").forward(request, response);  
            return;  
        }  
        if(password==null||password.trim().isEmpty()){  
            request.setAttribute("msg", "���벻��Ϊ��");  
            request.getRequestDispatcher("/regist.jsp").forward(request, response);  
            return;  
        }  
        if(!password.equals(rpsw)){  
            request.setAttribute("msg", "������������벻ͬ");  
            request.getRequestDispatcher("/regist.jsp").forward(request, response);  
            return;  
        }  
        UserDao u = new UserDao();  
        u.addUser(username, password, idnum, phone);//����addUser��������  
        request.setAttribute("msg", "��ϲ��"+username+"��ע��ɹ�");
        request.getRequestDispatcher("/index.jsp").forward(request, response);  
  
    }  
  
}  