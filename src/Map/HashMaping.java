package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMaping {

	public static void main(String[] args) {
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		System.out.println("All Hashmap  keys and values ");
		hashmap.put(1,"Parvez");
		hashmap.put(2,"Faizan");
		hashmap.put(null,"Hello");
		hashmap.put(3,"Imran");
		hashmap.put(4,"Aqsa");
		hashmap.put(5,"Ganesh");
		hashmap.put(6,"Rahul");

		System.out.println(hashmap);
		for(Map.Entry m:hashmap.entrySet()) {
			
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
		System.out.println("\nDisplying only keys present: ");
		System.out.println(hashmap.keySet());
		System.out.println("\nDisplying Only Values from the map:");
		System.out.println(hashmap.values());

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter key to search value: ");

		int searchKey = sc.nextInt();
		System.out.println(hashmap.get(searchKey));

		System.out.println("\nReplacing the value from given key:");
		System.out.println(hashmap.replace(3, "Anmol"));
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\nAdding new Records into the map: ");
		hashmap.putIfAbsent(4, "Atul");
		hashmap.putIfAbsent(8, "Amar");
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\nDeleting Record by Key:");
		hashmap.remove(1);
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		System.out.println("\nDeleting the Record by its Key and value");
		hashmap.remove(2, "Saurabh");
		for(Map.Entry m:hashmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}
