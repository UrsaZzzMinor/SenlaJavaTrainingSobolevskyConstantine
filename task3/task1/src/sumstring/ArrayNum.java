package sumstring;

public class ArrayNum {
	private String[] numbers = new String[5];
	private Integer sum = 0;
	
	public Integer sumArrayNum(){
		System.out.println("Strings of numbers in recently created array:");
		for (int i=0; i < numbers.length; i++){
			Integer a = (new java.util.Random()).nextInt(20);
			numbers[i] = a.toString();
			System.out.print(numbers[i] + " ");
			sum += a; 
		}
		return this.sum;
	}
}
