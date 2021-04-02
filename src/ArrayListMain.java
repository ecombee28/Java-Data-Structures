
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;



public class ArrayListMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		
		
		list.add(34);
		list.add(14);
		list.add(55);
		list.add(65);
		list.add(90);
		
		Iterator iterator = list.iterator();
		
		while(iterator.hasNext()) {
			 
			if((int)iterator.next() == 55) {
				System.out.println("yes");
			}
			
			
		}
		
		
		
		


	}

}
