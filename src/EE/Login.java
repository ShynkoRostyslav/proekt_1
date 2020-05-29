package EE;

import JDBC.Person;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;

public class Login extends HttpServlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher;

        String uri = req.getRequestURI();
        String values = getParameter(req);
        ArrayList<Person> person = new ArrayList<>();
        int age = 0;
        String name = "";
        String Password = "";
        for (Map.Entry<String, String[]> map : req.getParameterMap().entrySet()) {

            if (map.getKey().equals("Username")) {
                name = String.join("and", map.getValue());

            }
            if (map.getKey().equals("Password")) {
                Password = String.join("and", map.getValue());

            }

        }


        requestDispatcher = req.getRequestDispatcher("/output.jsp");
        requestDispatcher.forward(req, resp);

    }

    /* визначаємо метод який буде обробляти параметри в   тип String   */
    private String getParameter(HttpServletRequest req) {
        return req.getParameterMap().entrySet().stream().map(
                stringEntry -> {
                    String param = String.join(" and ", stringEntry.getValue());
                    param = stringEntry.getKey() + " param====>" + param;
                    return param;

                }).collect(Collectors.joining("\n"));


    }


}
