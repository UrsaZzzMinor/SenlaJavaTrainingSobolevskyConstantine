package clinicregistry;

public class Doctor extends Human{
	private static Integer docCount=0;
	
	private Integer patCount=0;

	public Doctor(String name, String surname, Integer age) {
		super();
		this.setName(name);
		this.setSurname(surname);
		this.setAge(age);
		docCount++;
	}
	
	public Integer getPatCount() {
		return this.patCount;
	}

	public void setPatCount(Integer a) {
		this.patCount += a;
	}
	
	public static Integer doctorQuantity(){
		return docCount;
	}
	
}
