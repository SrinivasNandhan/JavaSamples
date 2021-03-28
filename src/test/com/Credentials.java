package test.com;

public class Credentials {
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public Credentials(String name, int id, int num) {
		super();
		this.name = name;
		this.id = id;
		this.num = num;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	private int id;
	private int num;

}
