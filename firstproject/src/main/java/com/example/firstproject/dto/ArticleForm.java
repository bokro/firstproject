package com.example.firstproject.dto;

public class ArticleForm {
    
    @Override
    public String toString() {
        return "ArticleForm [content=" + content + ", title=" + title + "]";
    }

    private String title;
    private String content;

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    
}
