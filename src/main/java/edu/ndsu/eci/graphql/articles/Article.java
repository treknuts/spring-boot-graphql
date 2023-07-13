package edu.ndsu.eci.graphql.articles;

import java.util.Arrays;
import java.util.List;

public class Article {
    private String id;
    private String title;
    private String content;
    private String authorId;
    private List<String> commentIds;

    public Article(String id, String title, String content, String authorId, List<String> commentIds) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.authorId = authorId;
        this.commentIds = commentIds;
    }

    public static List<Article> articles = Arrays.asList(
            new Article("article-1", "Java GraphQL", "blah blah blah", "author-1",
                    Arrays.asList("comment-1", "comment-2")),
            new Article("article-2", "Common Sense Finance", "blah blah blah", "author-2", Arrays.asList("comment-3")),
            new Article("article-3", "Java in 60 seconds", "blah blah blah", "author-1",
                    Arrays.asList("comment-4", "comment-5", "comment-6")));

    public static Article getById(String id) {
        return articles.stream().filter(article -> article.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public List<String> getCommentIds() {
        return commentIds;
    }

    public void setCommentIds(List<String> commentIds) {
        this.commentIds = commentIds;
    }

    public static List<Article> getArticles() {
        return articles;
    }

    public static void setArticles(List<Article> articles) {
        Article.articles = articles;
    }

}
