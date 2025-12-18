package q1linkedlist;

public class Students {
	int id;
	String name;
	String favsubject;
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
	public String getFavsubject() {
		return favsubject;
	}
	public void setFavsubject(String favsubject) {
		this.favsubject = favsubject;
	}
	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", favsubject=" + favsubject + "]";
	}
	public Students(int id, String name, String favsubject) {
		super();
		this.id = id;
		this.name = name;
		this.favsubject = favsubject;
	}
	
	
	
	

}
