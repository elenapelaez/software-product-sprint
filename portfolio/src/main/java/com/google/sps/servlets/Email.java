package main.java.com.google.sps.servlets;

/**
 * Defines a class to describe an email and it's components
 */

 public class Email{
//       Email new_email = new Email(id, title, timestamp);

    public long id;
    public String title;
    public long timestamp;

    public Email(long id, String title, long timestamp) {
        this.id = id;
        this.title = title;
        this.timestamp = timestamp;
    }
 }