package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	private List<Comment> comment = new ArrayList<>();

	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Integer getLikes() {
		return likes;
	}

	public List<Comment> getComment() {
		return comment;
	}

	public void addComment(Comment comment) {
		this.comment.add(comment);
	}

	public void removeComment(Comment comment) {
		this.comment.remove(comment);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(sdf.format(getMoment()) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		for (Comment c : comment) {
			sb.append(c.getText() + "\n");
		}
		return sb.toString();

	}

}
