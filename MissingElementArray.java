package week3.day1;

import java.util.Arrays;

public class MissingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arry = {1,2,3,4,7,6,8};
		Arrays.sort(arry);
		for(int i = 0;i<=arry.length;i++) {
			if(arry[i] != arry[i+1]) {
				System.out.println(arry[i]);
				break;
			}
		}

	}

}
