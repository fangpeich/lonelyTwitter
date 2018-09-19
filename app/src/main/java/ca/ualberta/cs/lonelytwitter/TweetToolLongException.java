package ca.ualberta.cs.lonelytwitter;

public class TweetToolLongException extends Exception {

    TweetToolLongException() {
        super("The message is too long! please keep your tweets within 140 characters." );
    }
}
