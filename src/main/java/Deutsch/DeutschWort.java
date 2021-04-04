package Deutsch;

import org.hibernate.boot.model.relational.Sequence;

import javax.persistence.*;

@Entity
@Table(name = "deutsche_woerte")
public class DeutschWort {
    @Id
    @GeneratedValue
    private int id;
    private String deutsch_text;
    private String russisch_text;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeutsch_text() {
        return deutsch_text;
    }

    public void setDeutsch_text(String deutsch_text) {
        this.deutsch_text = deutsch_text;
    }

    public String getRussisch_text() {
        return russisch_text;
    }

    public void setRussisch_text(String russisch_text) {
        this.russisch_text = russisch_text;
    }


}
