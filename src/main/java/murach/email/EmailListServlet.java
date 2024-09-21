package murach.email;

import java.io.*;
//import javax.servlet.*;
//import javax.servlet.http.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import murach.business.User;
//import murach.data.UserDB;

public class EmailListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String url = "/index.html";

        // get current action
        String action = req.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {
            // get parameters from the request
            String firstName = req.getParameter("firstName");
            String lastName = req.getParameter("lastName");
            String email = req.getParameter("email");

            String birth = req.getParameter("birth");

            String option = null;
            String optionS = req.getParameter("option");
            if (optionS != null) {
                switch (optionS) {
                    case "Search Engine":
                        option = "Search Engine";
                        break;
                    case "Word Of Mouth":
                        option = "Word Of Mouth";
                        break;
                    case "Social Media":
                        option = "Social Media";
                        break;
                    case "Other":
                        option = "Other";
                        break;
                    default:
                        break;
                }
            }
            String select1 = req.getParameter("select1");
            String select2 = req.getParameter("select2");
            String contacts = req.getParameter("contacts");
            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email,birth,option,select1,select2,contacts);
//            UserDB.insert(user);

            // set User object in request object and set URL
            req.setAttribute("user", user);
            url = "/survey.jsp";   // the "thanks" page
        }

        // forward request and response objects to specified URL
        getServletContext()
                .getRequestDispatcher(url)
                .forward(req, resp);
    }
}
