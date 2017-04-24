package com.vincent.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Question {

    @Id
    @GeneratedValue
    @Column
    private int id;

    @Column
    private String name;

    @ManyToMany(mappedBy = "questions")
    private List<Quiz> quizs;

    @OneToMany(mappedBy = "question")
    private List<Answer> answers;

    @Column
    private boolean has_commentary;


    public Question() {}


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

    public List<Quiz> getQuizs() {
        return quizs;
    }

    public void setQuizs(List<Quiz> quizs) {
        this.quizs = quizs;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public boolean isHas_commentary() {
        return has_commentary;
    }

    public void setHas_commentary(boolean has_commentary) {
        this.has_commentary = has_commentary;
    }
}
