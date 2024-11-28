package org.example;

public class Post {
    public Integer userId, id, comment_count;
    public String title, body, link;
    public void print()
    {
        System.out.println("userId: " + this.userId + "\nid: " +  this.id
                + "\ntitle: " + this.title + "\nbody: " + this.body
                + "\nlink: " + this.link + "\ncomment_count: " + this.comment_count + "\n");
    }
}
