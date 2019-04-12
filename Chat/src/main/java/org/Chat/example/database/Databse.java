package org.Chat.example.database;

import java.util.ArrayList;
import java.util.List;

import org.Chat.example.beans.Post;

public class Databse
{
    private static List<Post> posts=new ArrayList<>();
    
    
    public static List<Post> getPosts() {
		return posts;
	}
    public static void setPosts(List<Post> posts) {
		Databse.posts = posts;
	}
}
