public class Room {
	
	private Integer number;
	
	public Room(Integer n){		
		this.number = n;
		System.out.println("Room instance created successfully!");		
	}

	public Integer getNumber() {		
		return number;		
	}

	public void setNumber(Integer number) {		
		this.number = number;		
	}
}