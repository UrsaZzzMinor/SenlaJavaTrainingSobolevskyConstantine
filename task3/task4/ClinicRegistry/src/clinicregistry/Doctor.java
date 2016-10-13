package clinicregistry;

public class Doctor extends Human{
	
	private String experience;

	public Doctor(String name, String surname, Integer age) {
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}
	
}
