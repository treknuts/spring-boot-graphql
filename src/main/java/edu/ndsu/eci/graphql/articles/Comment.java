package edu.ndsu.eci.graphql.articles;

import java.util.Arrays;
import java.util.List;

public class Comment {
    public String id;
    public String userId;
    public String content;

    public Comment(String id, String userId, String content) {
        this.id = id;
        this.userId = userId;
        this.content = content;
    }

    public static List<Comment> comments = Arrays.asList(
            new Comment("comment-1", "user-1", "Very cool!"),
            new Comment("comment-2", "user-1", "Epic!"),
            new Comment("comment-3", "user-2", "Good stuff"),
            new Comment("comment-4", "user-1", "Trash"),
            new Comment("comment-5", "user-2", "Dogwater"),
            new Comment("comment-6", "user-2", "foobar"));

    public static Comment getById(String id) {
        return comments.stream().filter(comment -> comment.getId().equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
