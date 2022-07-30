package entity;

import java.util.Date;

public class Seller {
    private int id;
    private String firstName;
    private String lastName;
    private Date since;

    public Seller(int id, String firstName, String lastName, Date since) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.since = since;
    }

    public Seller() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getSince() {
        return since;
    }

    public void setSince(Date since) {
        this.since = since;
    }


    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", since=" + since +
                '}';
    }
}
