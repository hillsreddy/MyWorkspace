/**
 * 
 */
package sort.array;

import java.util.Arrays;
import java.util.*;

/**
 * @author Home
 *
 */
public class SortArray {

	/**
	 * @param args
	 */
	public static void sortArray() {
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
		 
		Arrays.sort(fruits);
	 
		int i=0;
		for(String temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp);
		}
		
		List<String> fruitList = new ArrayList<String>();
		 
		fruitList.add("Pineapple");
		fruitList.add("Apple");
		fruitList.add("Orange");
		fruitList.add("Banana");
	 
		Collections.sort(fruitList);
		System.out.println("sorting arraylist..........");
		int j=0;
		for(String temp: fruitList){
			System.out.println("fruitsList " + ++j + " : " + temp);
		}
		
	}

}
