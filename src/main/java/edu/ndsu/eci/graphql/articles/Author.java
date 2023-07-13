package edu.ndsu.eci.graphql.articles;

import java.util.Arrays;
import java.util.List;

public class Author {
    private String id;
    private String firstName;
    private String lastName;

    public Author(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static List<Author> authors = Arrays.asList(
            new Author("author-1", "Trevor", "Knutson"),
            new Author("author-2", "Michael", "Myers"));

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static Author getById(String authorId) {
        return authors.stream().filter(author -> author.getId().equals(authorId)).findFirst().orElse(null);
    }

}
