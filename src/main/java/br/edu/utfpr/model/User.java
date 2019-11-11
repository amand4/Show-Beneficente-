package br.edu.utfpr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
public class User {


	@Id
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;
        
    public User() {
        super();
    }
    
	public User(Long id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
//	public User(UserDTO user){
//		this.id = user.getId();
//		this.name = user.getName();
//		this.age = user.getAge();
//	}
	
	public User(Long id){
		this.id = id;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [agr=" + age + ", name=" + name + "]";
	}

}

