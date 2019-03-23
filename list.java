package collection;
import java.util.*;
public class list {
	
	public static void main(String [] args){
	List<String> n=new  ArrayList();
	// to add elements
	n.add("Kamlesh");
	n.add("Rahul");
	n.add("Barry");
	n.add("flash");
	n.add("zoom");
	n.add("Naruto");
	n.add("ironman");
	System.out.println(n);

	//to remove elements from the list
	n.remove(4);
	n.remove("Barry");
	n.remove(2);

	// iterate using for each loop


	//iterate using list iterator 


	System.out.println("The size of list is:" + n.size());

	List<String> l2=new ArrayList<String>();
	l2.add("Marvel");
	l2.add("Ambani");
	l2.add("Modi");
	l2.add("Krishna Murthy");
	l2.add("VennuGopal ");
	n.addAll(l2);

	n.add(3,"faady");
	n.set(6,"Jaady");
	System.out.println(n);
	System.out.println(l2);
	}}