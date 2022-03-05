package week3.day1;

public class Fibcls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range =8 ,firstNum=0, secNum=1,sum;
		
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1; i<=range; i++) {
			//System.out.println("Print i:" +i);
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}

	}

}

