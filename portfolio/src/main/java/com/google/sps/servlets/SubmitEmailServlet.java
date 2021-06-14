package main.java.com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Responds to a request consisting of a user's email
 * @param request a POST request containing a user's data
 * @param response a response to the POST request that will be sent back to the caller
 */

@WebServlet("/submit-email")
public class SubmitEmailServlet extends HttpServlet {

  @Override
  public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Get the value entered in the form.
    String email = request.getParameter("email-address");

    // Print the value so you can see it in the server logs.
    System.out.println("User's email: " + email);

    // Write the value to the response so the user can see it.
    response.getWriter().println("Thank you for your response! I will be reaching out to you soon");
  }
}