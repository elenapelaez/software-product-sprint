package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Arrays;
import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

    private static final List<String> positiveMessages = Arrays.asList(
      "Keep your face to the sunshine and you cannot see a shadow", 
      "The only time you fail is when you fall down and stay down",
      "If opportunity doesn't knock, build a door", 
      "Live life to the fullest and focus on the positive");

    private static final String message_as_json = new Gson().toJson(positiveMessages);

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    response.setContentType("application/json;");
    response.getWriter().println(message_as_json);
  }
}
