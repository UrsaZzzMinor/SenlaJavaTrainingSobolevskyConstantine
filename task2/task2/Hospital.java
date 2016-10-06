import java.util.ArrayList;

public class Hospital {
	
	private String name;
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	
	public Hospital(String n){		
		setName(n);
		System.out.println("Hospital instance created successfully!");		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addPatient(Patient p){
		patients.add(p);
	}
	
	public void removePatient(Patient p){
		patients.remove(p);
	}
	
	public void getPatients(){		
		for (Patient thing: patients){			
			StringBuilder sb = new StringBuilder();
			sb.append(thing.getName());
			sb.append(" ");
			sb.append(thing.getSurname());
			System.out.println(sb);			
		}		
	}
	
}