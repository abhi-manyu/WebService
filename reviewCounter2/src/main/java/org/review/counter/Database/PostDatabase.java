package org.review.counter.Database;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.review.counter.beans.Post;

public class PostDatabase
{
	static List<Post> li;
	
	public PostDatabase() {
		li=new ArrayList<Post>();
		li.add(new Post(123,"King","Hello world",new Date()));
		li.add(new Post(456,"Queen","Hii everyone",new Date()));
		li.add(new Post(789,"The General","Goodmorning",new Date()));
		li.add(new Post(258,"The great Prince","My lord",new Date()));
	}
	public List<Post> returnAllPosts()
	{
		System.out.println(li.size());
		System.out.println("li from the all list : "+li);
		return li;
	}
	
	public Post getSinglePost(int id)
	{
		Iterator<Post> itr=li.iterator();
		while(itr.hasNext())
		{
			Post po=itr.next();
			if(po.getPostID()==id)
			{
				System.out.println(po);
				return po;
			}
		}
		return null;
	}
	
	public void addPost(Post po)
	{
		System.out.println(li.size());
		li.add(po);
		System.out.println(li.size());
		System.out.println("li from adding : "+li);
	}
}
