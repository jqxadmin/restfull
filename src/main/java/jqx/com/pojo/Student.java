package jqx.com.pojo;

public class Student {

	private Long id;
	private String name;
	private String password;
	private String addre;
	private String role;
	
	public Student(Long id, String name, String password, String addre, String role) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.addre = addre;
		this.role = role;
	}
	public Student() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddre() {
		return addre;
	}
	public void setAddre(String addre) {
		this.addre = addre;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
