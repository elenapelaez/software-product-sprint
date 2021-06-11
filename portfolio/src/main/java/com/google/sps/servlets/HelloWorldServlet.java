package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import com.google.gson.Gson;

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    ArrayList<String> positiveMessages = new ArrayList<String>();
    positiveMessages.add("Keep your face to the sunshine and you cannot see a shadow");
    positiveMessages.add("The only time you fail is when you fall down and stay down");
    positiveMessages.add("If opportunity doesn't knock, build a door");
    positiveMessages.add("Live life to the fullest and focus on the positive");

    Gson gson = new Gson();
    String json = gson.toJson(positiveMessages);

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
}
