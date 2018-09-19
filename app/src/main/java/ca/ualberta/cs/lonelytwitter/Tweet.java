package ca.ualberta.cs.lonelytwitter;
import java.util.Date;

public abstract class Tweet implements Tweetable{

    private Date date;
    private String message;
    private static final Integer MAX_CHARS = 140;

    Tweet() {
        this.date = new Date();
        this.message = "I am default message";
    }

    Tweet (String message)
    {
        this.date = new Date();
        this.message = message; //tweet myTweet = new tweet ('Blarenggh');
    }

    public Date getDate() {return this.date;}

    public String getMessage() {return this.message;}

    public void setMessage(String message) throws TweetToolLongException
    {
        if (message.length() <= this.MAX_CHARS)
        {
            this.message = message;
        }
        else
        {
            throw new TweetToolLongException();
        }
    }

    public abstract Boolean isImportant();

}
