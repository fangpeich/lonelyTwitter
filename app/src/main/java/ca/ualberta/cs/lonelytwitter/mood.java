package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public abstract class mood
{
    private Date date;
    private String message;

    mood() {
        this.date = new Date();
        this.message = "I am default message";
    }

    mood (String message)
    {
        this.date = new Date();
        this.message = message;
    }
}
