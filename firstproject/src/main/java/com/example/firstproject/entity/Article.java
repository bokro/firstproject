package com.example.firstproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.ToString;

@Entity  //db가 인식 가능하게 해주는 어노테이션
@AllArgsConstructor //롬복
@ToString //롬복
public class Article {

    @Id //키값
    @GeneratedValue//자동생성
    private Long id;

    @Column
    private String title;

    @Column
    private String content;

}
