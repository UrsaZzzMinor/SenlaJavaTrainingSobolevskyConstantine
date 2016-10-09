package greatestnumber;

public class GreatNum {
	
	static int gn = (new java.util.Random()).nextInt(900)+100;
	static int max_value = 0;
	static int digit = 0;

	public void findMaxDigit() {
		System.out.println(gn);
		do {
			digit = gn % 10;
			if (digit>max_value) max_value = digit;
			gn = (gn - digit)/10;
		} while (gn>0);
		System.out.println(max_value);

	}

}
