package clinicregistry;

public class Patient extends Human{
	
	private static Integer patCount = 0;
	private String healingDoctor;
	
	public Patient(String name, String surname, Integer age){
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		this.patCount++;
		
	}
	
	public static Integer countPatients(){
		return patCount;
	}

	public String getHealingDoctor(){
		return this.healingDoctor;
	}
	
	public void setHealingDoctor(Doctor healingDoctor) {
		healingDoctor.setPatCount(1);
		StringBuilder sb = new StringBuilder();
		sb.append(healingDoctor.getName());
		sb.append(" ");
		sb.append(healingDoctor.getSurname());
		this.healingDoctor = sb.toString();
	}
	
	public void removeHealingDoctor(Doctor healingDoctor){
		healingDoctor.setPatCount(-1);
		this.healingDoctor = "";
	}
	

}
