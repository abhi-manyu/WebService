package org.subresource.example.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.subresource.example.beans.Post;
import org.subresource.example.database.Database;
import org.subresource.example.exception.DataNotFoundException;

public class Post_Resources
{
   public Map<Long,Post> posts=Database.getPosts();
   
   public Post_Resources()
    {
	    posts.put(1l,new Post(1,"Hello World","Abhimanyu"));
    }
   
   
   public List<Post> getAllPosts()
   {
	   System.out.println(posts.size());
	   return new ArrayList<Post>(posts.values());
   }
   
   
   public Post getPost(Long postID)
   {
	   Post post= posts.get(postID);
	   if(post==null)
		   throw new DataNotFoundException("message of id : "+postID+" not found");
	   return post;
   }
   
   public Post addPost(Post post)
   {
	   post.setPostId(posts.size()+1);
	   posts.put(post.getPostId(),post);
	   return post;
   }
   
   
}
