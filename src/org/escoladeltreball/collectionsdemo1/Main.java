/**
 * 
 */
package org.escoladeltreball.collectionsdemo1;

import java.util.List;
import java.util.Collections;
import java.util.LinkedList;

/**
 * @author iaw26540084
 *
 */
public class Main {
	
	public static List<String> subLlista(List<String> list, String str) {
		
		List<String> search = new LinkedList<>();
		
		for (String string: list) {
			if (str.equals(string)) {
				search.add(str);
				
			}
		}
		
		return search;
		//return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		
		
		list.add("Alpha");
		list.add("Charlie");
		list.add("Bravo");
		list.add("Echo");
		list.add("Delta");
		list.add("Zulu");
		list.add("Albacete");
		list.add("Alava");
		
		list.remove("Charlie");
		
		Collections.sort(list);
		
		
		for (String string: list) {
			System.out.println(string);
		}
		
		
		
	}

}
