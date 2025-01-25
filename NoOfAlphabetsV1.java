
public class NoOfAlphabetsV1 {

	public static void main(String[] args) {
		String data="ngyurgvkgiubjhSWDRGJMnbjhj";
		data=data.toLowerCase();
		
		//a-z---26
		int[] count=new int[26];
		for(int i=0;i<data.length();i++) {
			char ch=data.charAt(i);
			if(ch=='a') {
				count[0]++;
			}
			if(ch=='b') {
				count[1]++;
		}
			if(ch=='c') {
				count[2]++;
	}
			if(ch=='d') {
				count[3]++;
}
			if(ch=='e') {
				count[4]++;
			}
			if(ch=='f') {
				count[5]++;
			}
			if(ch=='g') {
				count[6]++;
			}
			if(ch=='h') {
				count[7]++;
			}
			if(ch=='i') {
				count[8]++;
			}
			if(ch=='j') {
				count[9]++;
			}
			if(ch=='k') {
				count[10]++;
			}
			if(ch=='l') {
				count[11]++;
			}
			if(ch=='m') {
				count[12]++;
			}
			if(ch=='n') {
				count[13]++;
			}
			if(ch=='o') {
				count[14]++;
			}
			if(ch=='p') {
				count[15]++;
			}
			if(ch=='q') {
				count[16]++;
			}
			if(ch=='r') {
				count[17]++;
			}
			if(ch=='s') {
				count[18]++;
			}
			if(ch=='t') {
				count[19]++;
			}
			if(ch=='u') {
				count[20]++;
			}
			if(ch=='v') {
				count[21]++;
			}
			if(ch=='w') {
				count[22]++;
			}
			if(ch=='x') {
				count[23]++;
			}
			if(ch=='y') {
				count[24]++;
			}
			if(ch=='z') {
				count[25]++;
			}
		}
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+97)+"--->"+count[i]);
		}
	}
}

