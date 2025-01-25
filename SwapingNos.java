
public class SwapingNos {

	public static void main(String[] args) {
		int a=100,b=200;
		System.out.println("before swapping.....");
		System.out.println("a---->"+a);
		System.out.println("b----->"+b);
		a=a+b;
		b=a-b;//a+b -b
		a=a-b;//a+b -a
		System.out.println("after swapping.....");
		System.out.println("a------>"+a);
		System.out.println("b------->"+b);
	}

}
