package Entity;

import java.util.Date;

public class Adverts {

    private int id;
    private Date createAdvertDate;

    public Adverts(int id, Date createAdvertDate) {
        this.id = id;
        this.createAdvertDate = createAdvertDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateAdvertDate() {
        return createAdvertDate;
    }

    public void setCreateAdvertDate(Date createAdvertDate) {
        this.createAdvertDate = createAdvertDate;
    }
}
