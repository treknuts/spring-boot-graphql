package edu.ndsu.eci.graphql.articles;

import java.util.List;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ArticleController {

    @QueryMapping
    public Article articleById(@Argument String id) {
        return Article.getById(id);
    }

    @QueryMapping
    public List<Article> articles() {
        return Article.articles;
    }

    @SchemaMapping
    public Author author(Article article) {
        return Author.getById(article.getAuthorId());
    }

    @SchemaMapping
    public List<Comment> comments(Article article) {
        return Comment.comments.stream().filter(comment -> article.getCommentIds().contains(comment.getId())).toList();
    }

    @SchemaMapping
    public User user(Comment comment) {
        return User.getById(comment.getUserId());
    }
}