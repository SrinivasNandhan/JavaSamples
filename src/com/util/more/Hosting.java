package com.util.more;

public class Hosting {
	private int Id;
    private String name;
    private long websites;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public Hosting(int id, String name, long websites) {
		super();
		Id = id;
		this.name = name;
		this.websites = websites;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getWebsites() {
		return websites;
	}
	public void setWebsites(long websites) {
		this.websites = websites;
	}
}
