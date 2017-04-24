package com.vincent.Entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Quiz {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @Column
    private Date date_start;

    @Column
    private Date date_end;

    @Column
    private boolean activate;

    @ManyToMany
    @JoinTable(
            name = "quiz_questions",
            joinColumns = @JoinColumn(name = "id_quiz", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "id_question", referencedColumnName = "id")
    )
    private List<Question> questions;

    @ManyToOne
    @JoinColumn(name = "id_teacher")
    private User teacher;


    public Quiz() {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }
}
