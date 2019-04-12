package org.review.counter.Database;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.review.counter.beans.Post;

public class PostDatabase
{
	static List<Post> li;
	static
	{
		li=new ArrayList<Post>();
		li.add(new Post(123,"King","Hello world",new Date()));
		li.add(new Post(456,"Queen","Hii everyone",new Date()));
		li.add(new Post(789,"The General","Goodmorning",new Date()));
		li.add(new Post(258,"The great Prince","My lord",new Date()));
	}
	
	public List<Post> returnAllPosts()
	{
		return li;
	}
	
	public Post getSinglePost(int id)
	{
		Iterator<Post> itr=li.iterator();
		while(itr.hasNext())
		{
			Post pos=itr.next();
			if(pos.getPostID()==id)
			{
				return pos;
			}
		}
		System.out.println("post not found");
		return null;
	}
}
