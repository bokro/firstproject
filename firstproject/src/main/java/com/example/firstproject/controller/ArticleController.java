package com.example.firstproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;

@Controller
public class ArticleController {

    @Autowired // 스프링부트가 객체 자동 연결해줌
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/view";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        //1.dto to entity
        Article article = form.toEntity();
        System.out.println(article.toString());
        //2. entity to repository 
        Article saved =articleRepository.save(article);
        System.out.println(saved.toString());

        return "articles/view";
    }
    
}
