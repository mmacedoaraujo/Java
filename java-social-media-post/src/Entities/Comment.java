package Entities;

public class Comment {
	
	private String text;
	
	public Comment() {
		
	}
	
	public Comment(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	@Override
	public String toString() {
		return text;
	}
	
	
}
