import java.util.*;
public class toPower {

	public static int[] toPower(int size, int power) {
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) Math.pow(i, power);
		}
		return arr;
		
	}
}


