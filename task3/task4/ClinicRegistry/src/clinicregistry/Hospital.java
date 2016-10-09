package clinicregistry;

public class Hospital {
	private String name;
	private Patient [] patients = new Patient[5];
	private Doctor [] doctors = new Doctor[5];
	public Hospital(String name){
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Patient[] getPatients() {
		return patients;
	}
	public void addPatient(Patient patient, Integer count) {
		this.patients[count] = patient;
	}
	public Doctor[] getDoctors() {
		return doctors;
	}
	public void addDoctor(Doctor doctor, Integer count) {
		this.doctors[count] = doctor;
	}
}
