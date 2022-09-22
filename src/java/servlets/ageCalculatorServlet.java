package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ageCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String age = request.getParameter("age");

        if (age == null || age.equals("")) {
            request.setAttribute("answer", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

        } else {
            try {
                int newAge = Integer.parseInt(age);

                request.setAttribute("answer", "Your age next birthday will be " + (newAge + 1));
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

            } catch (NumberFormatException e) {
                request.setAttribute("answer", "You must enter a number.");
                getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

            }
        }

    }

}
