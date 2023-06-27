import java.util.*;
public class ArrayListDemo1 {
	public static void main(String args[]){
	ArrayList<String> aa = new ArrayList<>();
		aa.add("Ram");
		aa.add("Nandu");
		aa.add("Rudra");
		aa.add("Peju");
		aa.add("Raju");
		int size = aa.size();
		for(int i = 0; i<size; i++){
			String s = aa.get(i);
			System.out.println(s+"\t");
			}
		System.out.println("\nRetrive the element of ArrayList.\n");
		for(String ss : aa) {
			System.out.println(ss);
			}
		}
	}