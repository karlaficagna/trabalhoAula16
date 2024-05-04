package com.fundatec.aula11.dominio;

import javax.persistence.*;


@Entity
@Table(name = "hobby")
public class Hobby {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "hobby")
    private String hobby;


    public Hobby() {
    }

    public Hobby(Long id, String hobby) {
        this.id = id;
        this.hobby = hobby;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


}
