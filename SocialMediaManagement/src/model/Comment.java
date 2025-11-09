/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author grace
 */
public class Comment {
    private int id;
    private int userId;
    private int postId;
    private String text;
    private int likes;

    public Comment(int id, int userId, int postId, String text, int likes) {
        this.id = id;
        this.userId = userId;
        this.postId = postId;
        this.text = text;
        this.likes = likes;
    }

    public int getLikes() {
        return likes;
    }

    public int getId() {
        return id;
    }

    public int getPostId() {
        return postId;
    }

    public int getUserId() {
        return userId;
    }

    public String getText() {
        return text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Comment{" + "id = " + id + ", userId = " + userId + ", postId = " + postId + ", text = " + text + ", likes = " + likes + '}';
    }
}
