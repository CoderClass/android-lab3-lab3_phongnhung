package vn.com.phongnguyen93.week3fbdemo.model;

/**
 * Created by hongnhung on 02/03/2017.
 */

public class Message {


    public String message;
    public String id;
    public long time;

    public Long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
