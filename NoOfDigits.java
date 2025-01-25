
public class NoOfDigits {

	public static void main(String[] args) {
		long num=7396980225l;
		int r;
		int[] count=new int[10];
		//count[0]---0
		//cut[1]----1
		//count[9]----9
		//0 1 2 3.....9
		//1--
		//2--
		//3--
		//4--
		//9--
		while(num!=0) {
			r=(int)(num % 10);//7396980225l---8
			count[r]++;
			num=num/10;
		}
		for(int i=0;i<=9;i++) {
			System.out.println(i+"------>"+ count[i]);
		}
	}

}
