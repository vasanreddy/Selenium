package TestNG;

import java.util.Arrays;


class Maxnumber{
	
	void getMaxnumber(){
		
		int arr[]=new int[]{4,9,1,6,3};
		
		System.out.println(arr.length);
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		System.out.println(arr[arr.length-2]);
		
		
	}
}



















public class Maxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Maxnumber Maxnumber=new Maxnumber();
		Maxnumber.getMaxnumber();

	}

}
