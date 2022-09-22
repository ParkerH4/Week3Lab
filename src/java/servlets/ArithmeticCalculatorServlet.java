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
        request.setAttribute("answer", "---");

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String op = request.getParameter("op");

        request.setAttribute("first", first);
        request.setAttribute("second", second);

        if (first == null || first.equals("") || second == null || second.equals("")) {
            request.setAttribute("answer", "invalid.");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        } else {
            try {
                int parsedFirst = Integer.parseInt(first);
                int parsedSecond = Integer.parseInt(second);

                switch (op) {
                    case "+":
                        request.setAttribute("answer", parsedFirst + parsedSecond);
                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
                        break;
                    case "-":
                        request.setAttribute("answer", parsedFirst - parsedSecond);

                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);

                        break;
                    case "*":
                        request.setAttribute("answer", parsedFirst * parsedSecond);

                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);

                        break;
                    case "%":
                        request.setAttribute("answer", parsedFirst % parsedSecond);

                        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);

                        break;
                }
            } catch (NumberFormatException e) {
                request.setAttribute("answer", "invalid.");
                getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);

            }
        }
    }
}
