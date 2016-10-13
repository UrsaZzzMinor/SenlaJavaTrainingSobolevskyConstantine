package clinicregistry;

public class HospitalRegistry {
	private String name;
	private Integer doctorIndex = 0;
	private Integer patientIndex = 0;
	private Integer regPatients = 0;
	private Patient [] patients = new Patient[5];
	private Doctor [] doctors = new Doctor[5];
	private Human[][] regPatientsToDoctor = new Human[5][5];
	public HospitalRegistry(String name){
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
	public void addPatient(Patient patient) {
		this.patients[patientIndex] = patient;
		patientIndex++;
	}
	public Doctor[] getDoctors() {
		return doctors;
	}
	public void addDoctor(Doctor doctor) {
		this.doctors[doctorIndex] = doctor;
		doctorIndex++;
	}
	
	public Integer countDoctors(){
		return doctorIndex;
	}
	
	public Integer countPatients(){
		return patientIndex;
	}
	
	public void registerPatient(Doctor doctor, Patient patient) {
		for (int i = 0; i< regPatientsToDoctor[0].length; i++){
			if (doctor.equals(regPatientsToDoctor[i][0])){
				for (int j = 0; j < regPatientsToDoctor.length; j++){
					if (regPatientsToDoctor[i][j] == null){
						regPatientsToDoctor[i][j] = patient;
						j = regPatientsToDoctor.length;
					}
					
				}
			}	
		} 
	}	
	
	public void removePatientFromReg(Patient patient){
		for (int i=0; i<regPatientsToDoctor.length;i++){
			for (int j=0; j< regPatientsToDoctor.length; j++){
				if (regPatientsToDoctor[i][j].equals(patient)){
					regPatientsToDoctor[i][j] = null;
				}
			}
		}
	}
	
	public Human[][] getRegPatToDoc(){
		return regPatientsToDoctor;
	}
	
	public Integer countRegisteredPatients(Doctor doctor){
		for(int i = 0; i < regPatientsToDoctor.length; i++){
			if (regPatientsToDoctor[i][0].equals(doctor)){
				for (int j = 1; j < regPatientsToDoctor.length; j++){
					if (regPatientsToDoctor[i][j] != null){
					regPatients++;
					}
				}
				i = regPatientsToDoctor.length;
			}
		}
		return regPatients;
	}
}
