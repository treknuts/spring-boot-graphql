package edu.ndsu.eci.graphql.articles;

import java.util.Arrays;
import java.util.List;

public class User {
    private String id;
    private String username;

    public User(String id, String username) {
        this.id = id;
        this.username = username;
    }

    public static List<User> users = Arrays.asList(
            new User("user-1", "treknuts"),
            new User("user-2", "mrk1bb1es"));

    public static User getById(String id) {
        return users.stream().filter(user -> user.id.equals(id)).findFirst().orElse(null);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static List<User> getUsers() {
        return users;
    }

    public static void setUsers(List<User> users) {
        User.users = users;
    }

}
