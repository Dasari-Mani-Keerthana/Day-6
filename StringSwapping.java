
public class StringSwapping {

	public static void main(String[] args) {
		String name1="mani";
		String name2="sai";
		System.out.println("before swapping....");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
		
		name2 = name2+name1;//SaiMani
		name1 = name2.substring(0,name2.length()-name1.length());//Sai
		name2 = name2.substring(name1.length());
		
		System.out.println("after swapping...");
		System.out.println("name1------"+name1);
		System.out.println("name2------"+name2);
	}

}
