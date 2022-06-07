package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity  //db가 인식 가능하게 해주는 어노테이션
public class Article {


    @Id //키값
    @GeneratedValue//자동생성
    private Long id;


    @Column
    private String title;

    @Column
    private String content;
    
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "Article [content=" + content + ", id=" + id + ", title=" + title + "]";
    }


}
