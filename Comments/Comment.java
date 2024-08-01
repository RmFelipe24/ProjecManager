/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comments;

import Users.User;

/**
 *
 * @author Luisk
 */
public class Comment {
private int id;
private User User;
private String comment;        

    public int getId() {
        return id;
    }

    public User getUser() {
        return User;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Comment(int id, User User, String comment) {
        this.id = id;
        this.User = User;
        this.comment = comment;
    }

    public Comment() {
    }
}
