package clinicregistry;

public class Runner {

	public static void main(String[] args) {
		//Creating instances of classes we'll use very soon
		HospitalRegistry hospital = new HospitalRegistry("St. AnnaMaria");
		Doctor firstDoctor = new Doctor("John", "Reaper", 20);		
		Doctor secondDoctor = new Doctor("Jessy", "Clyne", 30);		
		Patient firstPatient = new Patient("Clark", "Kent", 50);		
		Patient secondPatient = new Patient("John", "Snow", 67);		
		Patient thirdPatient = new Patient("Lara", "Fabian", 35);
		Patient fourthPatient = new Patient("Lara", "Croft", 35);
		Patient fifthPatient = new Patient("Will", "Smith", 35);
		//Adding doctors & patients to the hospital registry
		hospital.addDoctor(firstDoctor);
		hospital.addDoctor(secondDoctor);
		hospital.addPatient(firstPatient);
		hospital.addPatient(secondPatient);
		hospital.addPatient(thirdPatient);
		hospital.addPatient(fourthPatient);
		hospital.addPatient(fifthPatient);
		//assigning Doctor instances into two-dimensional array(for observing of which patients does the selected doctor take care)
		for(int i = 0; i< hospital.getDoctors().length; i++){
			hospital.getRegPatToDoc()[i][0] = hospital.getDoctors()[i];
		}
		System.out.printf("The second Patient is = %s%n", hospital.getPatients()[1].getSurname());
		System.out.printf("Quantity of Doctors = %d%n", hospital.countDoctors());
		System.out.printf("Quantity of Patients = %d%n", hospital.countPatients());
		hospital.registerPatient(firstDoctor, firstPatient);
		hospital.registerPatient(firstDoctor, thirdPatient);
		hospital.registerPatient(secondDoctor, secondPatient);	
		hospital.registerPatient(firstDoctor, fifthPatient);
		try{
			System.out.println(hospital.getRegPatToDoc()[1][1].getSurname());
			hospital.removePatientFromReg(thirdPatient); // Removing Patient from the register
		} catch (NullPointerException exc){
			System.out.println("The chosen Patient has been removed successfully!");
		}
		System.out.printf("Quantity of registered patients to the first Doctor = %d%n", hospital.countRegisteredPatients(firstDoctor));		
	}

}
