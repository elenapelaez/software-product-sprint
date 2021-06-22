package main.java.com.google.sps.servlets;

/**
 * Defines a class to describe an email and it's components
 */
 public class Email{
    // Unique identifier for each email
    public long id;

    // The name of the email address
    public String title;

    // The time that an email was submitted by the user
    public long timestamp;

    public Email(long id, String title, long timestamp) {
        this.id = id;
        this.title = title;
        this.timestamp = timestamp;
    }
 }
