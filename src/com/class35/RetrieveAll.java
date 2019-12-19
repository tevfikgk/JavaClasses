package com.class35;



import java.util.*;
import java.util.Map.Entry;

public class RetrieveAll {

	public static void main(String[] args) {
	

	Map<String,Integer> classRoom=new HashMap<>(); //key+value=entry
	
	classRoom.put("Instructor",3);
	classRoom.put("Students",80);
	classRoom.put("Tables",20);
	classRoom.put("Chairs",80);  // values can be dublicate that is why we made  Collection when we call
	System.out.println(classRoom);
	
	Set<Entry<String, Integer>> eSet=classRoom.entrySet();
			for(Entry<String, Integer> entry:eSet) {
				System.out.println(entry.getKey()+":"+entry.getValue()); //System.out.println(entry); de olur.
			}
;	Iterator<Entry<String, Integer>> entryIterator=eSet.iterator();
		while (entryIterator.hasNext()) {
			//String a=entryIterator.next().getKey();
			//int b=entryIterator.next().getValue();
			//System.out.println(a+" "+b);
			Entry<String, Integer> ent=entryIterator.next();
			String entry=ent.getKey()+" " +ent.getValue();
			System.out.println(entry);
		}
}

}
