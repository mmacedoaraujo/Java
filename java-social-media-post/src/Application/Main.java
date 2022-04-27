package Application;

import java.text.ParseException;
import java.util.Calendar;

import Entities.Comment;
import Entities.Post;

public class Main {

	public static void main(String[] args) throws ParseException {

		Calendar c = Calendar.getInstance();
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		Post p1 = new Post(c.getTime(), "Tavelling to new Zealand",
				"I'm going to visit this wonderful country", 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1 + "\n");
		c.set(Calendar.HOUR, 11);
		Comment c3 = new Comment("Good night");
		Comment c4 = new Comment("May the Force be with you!!");
		Post p2 = new Post(c.getTime(), "Good night guys", "See you tomorrow", 5);
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p2);
		
	}

}
