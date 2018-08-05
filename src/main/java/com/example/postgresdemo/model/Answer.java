package com.example.postgresdemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "answers")

public class Answer extends AuditModel{
	
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "answer_generator")
    @SequenceGenerator(
            name = "answer_generator",
            sequenceName = "answer_sequence"
    )
    private Long id;

    @Column(name = "text")
    private String text;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "question_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Question question;

    // Getters and setters
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}  

}
