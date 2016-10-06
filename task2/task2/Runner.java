public class Runner {

	public static void main(String[] args) {
		
		Patient firstPatient = new Patient("Adam", "West");
		Patient secondPatient = new Patient("Adam", "Jensen");
		Room firstRoom = new Room(1);
		Hospital firstHospital = new Hospital("State Surgery Hospital");
		firstPatient.setRoom(firstRoom);
		secondPatient.setRoom(firstRoom);
		firstPatient.setHospital(firstHospital);
		secondPatient.setHospital(firstHospital);
		firstHospital.addPatient(firstPatient);
		firstHospital.addPatient(secondPatient);

	}

}