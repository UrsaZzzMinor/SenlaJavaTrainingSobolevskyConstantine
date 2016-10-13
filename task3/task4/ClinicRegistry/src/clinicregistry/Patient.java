package clinicregistry;

public class Patient extends Human{
	
	private String disease;
	

	public Patient(String name, String surname, Integer age){
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
	}
	
	public Patient(){}
	
	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}
	
}
