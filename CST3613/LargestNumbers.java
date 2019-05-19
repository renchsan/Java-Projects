import java.math.*;
import java.util.ArrayList;

public class LargestNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> list = new ArrayList<>();
		list.add(45);
		list.add(3445.52);  // Add a double
		// Add a BigInteger
		list.add(new BigInteger("34333343234123423"));
		// Add a BigDecimal
		list.add(new BigDecimal("2.09090902930492304"));
		
		System.out.println("The largest number is " + getLargestNumber(list));
	}

	public static Number getLargestNumber(ArrayList<Number> list) {
		if (list == null || list.size() == 0)
			return null;
		
		Number number = list.get(0);
		for (int i = 1; i < list.size(); i++)
			if (number.doubleValue() < list.get(i).doubleValue())
				number = list.get(i);
		return number;
	}
}
