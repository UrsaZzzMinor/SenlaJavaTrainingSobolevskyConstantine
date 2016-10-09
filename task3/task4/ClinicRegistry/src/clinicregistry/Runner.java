package clinicregistry;

public class Runner {

	public static void main(String[] args) {
		Hospital hospital = new Hospital("St. AnnaMaria");
		Doctor firstDoctor = new Doctor("John", "Reaper", 20);
		hospital.addDoctor(firstDoctor, Doctor.doctorQuantity());
		Doctor secondDoctor = new Doctor("Jessy", "Clyne", 30);
		hospital.addDoctor(secondDoctor, Doctor.doctorQuantity());
		Patient firstPatient = new Patient("Clark", "Kent", 50);
		hospital.addPatient(firstPatient, Patient.countPatients());
		Patient secondPatient = new Patient("John", "Snow", 67);
		hospital.addPatient(secondPatient, Patient.countPatients());
		Patient thirdPatient = new Patient("Lara", "Fabian", 35);
		hospital.addPatient(thirdPatient, Patient.countPatients());
		firstPatient.setHealingDoctor(firstDoctor);
		secondPatient.setHealingDoctor(firstDoctor);
		thirdPatient.setHealingDoctor(firstDoctor);
		//thirdPatient.removeHealingDoctor(firstDoctor);
		System.out.println("The second Patient is = " + hospital.getPatients()[1].getSurname());
		System.out.println("Quantity of Doctors = " + Doctor.doctorQuantity());
		System.out.println("Quantity of Patients = " + Patient.countPatients());
		System.out.println("Quantity of Patients that has a chosen Doctor =  " + firstDoctor.getPatCount());
		System.out.println("The healing Doctor of a chosen Patient is = " + thirdPatient.getHealingDoctor());
	}

}
