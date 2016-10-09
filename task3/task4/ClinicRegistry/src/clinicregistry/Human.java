package clinicregistry;

public class Human {
	private String name;
	private String surname;
	private Integer age;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	public String getSurname(){
		return this.surname;
	}
	
	public void setAge(Integer age){
		this.age = age;
	}
	
	public Integer getAge(){
		return this.age;
	}
}
