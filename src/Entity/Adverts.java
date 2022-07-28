package Entity;

import java.util.Date;

public class Adverts {

    private String id;
    private Date createAdvertDate;
    private String title;
    private String body;
    private double price;

    public Adverts(String id, Date createAdvertDate, String title, String body, double price) {
        this.id = id;
        this.createAdvertDate = createAdvertDate;
        this.title = title;
        this.body = body;
        this.price = price;
    }

    public Adverts() {

    }


    public Date getCreateAdvertDate() {
        return createAdvertDate;
    }

    public void setCreateAdvertDate(Date createAdvertDate) {
        this.createAdvertDate = createAdvertDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
