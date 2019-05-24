package es.vuejsazure.workshop.demo.entities;

import org.springframework.data.jpa.domain.AbstractPersistable;
import javax.persistence.Entity;

@Entity
public class Todo extends AbstractPersistable<Long> {

    private String text;
    private boolean done;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean getDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}