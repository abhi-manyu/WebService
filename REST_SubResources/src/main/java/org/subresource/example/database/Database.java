package org.subresource.example.database;

import java.util.HashMap;
import java.util.Map;

import org.subresource.example.beans.Post;

public class Database
{
   private static Map<Long,Post> posts=new HashMap<Long, Post>();
   
   public static void setPosts(Map<Long, Post> posts) {
	Database.posts = posts;
}
   public static Map<Long, Post> getPosts() {
	return posts;
}
}
