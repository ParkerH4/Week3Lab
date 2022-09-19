
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

  
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     String first = request.getParameter("first");
     String second = request.getParameter("second");
     
     request.setAttribute("first" , first);
     request.setAttribute("second" , second);
     
     if (first == null || first.equals("") || second == null || second.equals("")){
          getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
          return;
     }
    
    }

}