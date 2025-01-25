
public class PrimeNoV4 {

	public static void main(String[] args) {
		for(int i=50,m=0,k=0;i<=230;i++) {
			int num=i;
			int counter=0;
			for(int p=1;p<=num;p++) {
				if(num%p==0)counter++;
			}
			if(counter==2) {
				System.out.println(num+"");
				if(++k%8==0) {
					System.out.println();
				}
				if(counter==2) {
					m++;
					if(m==22) {
						System.out.println("this is 22 prime no....."+num+"\n");
					}
				}
					System.out.println(num+"");
				}
		}
		
		}
	}
		


