public class Patient extends Human{
	
	private Room room;
	private Hospital hospital;
	
	public Patient(String n, String s){
		setName(n);
		setSurname(s);
		System.out.println("Patient instance created successfully!");		
	}
	
	public Room getRoom() {
		return room;
	}
	
	public void setRoom(Room room) {
		this.room = room;
	}
	
	public Hospital getHospital() {
		return hospital;
	}
	
	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	} 
	
}