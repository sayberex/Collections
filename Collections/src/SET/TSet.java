package SET;

import java.util.*;

//все обекты уникальны
//нельзя получать обекты по индексу
//Set - interface
//    	HashSet
//		TreeSet
//		LinkedSet
//		EnumSet

public class TSet {
	Set<Integer> HSet;
	Set<Integer> TSet;
	Set<Integer> LHSet;
	Set<Integer> ESet;
	
	public void bildHashSet() {
		HSet = new HashSet<Integer>();
		HSet.add(3);
		HSet.add(7);
		HSet.add(5);
		HSet.add(1);
		HSet.add(9);
		HSet.add(2);
		HSet.add(1);
	}
	
	public void bildTreeSet() {
		TSet = new TreeSet<Integer>();
		TSet.add(33);
		TSet.add(77);
		TSet.add(55);
		TSet.add(11);
		TSet.add(99);
		TSet.add(22);
		TSet.add(11);
	}
	
	public void bildLinkedHashSet() {
		LHSet = new LinkedHashSet<Integer>();
		LHSet.add(3);
		LHSet.add(7);
		LHSet.add(5);
		LHSet.add(1);
		LHSet.add(9);
		LHSet.add(2);
		LHSet.add(1);
	}
	
	/*public void bildEnumSet() {
		HSet = new EnumSet<Integer>();
		HSet.add(3);
		HSet.add(7);
		HSet.add(5);
		HSet.add(1);
		HSet.add(9);
		HSet.add(2);
		HSet.add(1);
	}*/

	public void Print(Set set) {
		for(int i = 0; i < set.size(); i++)
			//set.toArray()[i];
		System.out.println(set.toArray().);
	}
}
