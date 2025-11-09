/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author grace
 */
public class Post {
    private int postId;
    private int userId;
    private List<Comment> comments;

    public Post(int postId, int userId) {
        this.postId = postId;
        this.userId = userId;
        this.comments = new ArrayList<>();
    }

    public int getPostId() {
        return postId;
    }

    public int getUserId() {
        return userId;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }
}
