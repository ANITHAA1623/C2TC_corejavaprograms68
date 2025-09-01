package Com.tnsif.dayEighteen.map;


//Program to demonstrate LinkedHashMap

import java.util.LinkedHashMap;

public class LinkedHashMapDemp {

	public static void main(String[] args) {
		//ordered, unsorted map - allows null key and null values
		LinkedHashMap<String, Integer> lhmap = new LinkedHashMap<String, Integer>();
		lhmap.put("Adithiyaa", 56000);
		lhmap.put("Raja", 76000);
		lhmap.put("vanitha", 88200);
		lhmap.put("Ankush", 45000);
		lhmap.put("Raistar", 76000);
		System.out.println("Employee Details "+lhmap);
		lhmap.put("Shashwat", 80000); //allows unique key, so value replaced by 80000
		System.out.println("Employee Details after adding new employee "+lhmap);
		
		lhmap.put("Manoj",null);
		System.out.println("Employee Details "+lhmap);
		
		lhmap.put(null,null);
		System.out.println("Employee Details "+lhmap);
		
	}

}