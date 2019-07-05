package com.santg.springboot.thymeleafdemo.model;

public class Movie {

	private int id;
	private String name;
	private String author;
	private String genre;
	
	public Movie() {}

	public Movie(int id, String name, String author, String genre) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.genre = genre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", author=" + author + ", genre=" + genre + "]";
	}
}
