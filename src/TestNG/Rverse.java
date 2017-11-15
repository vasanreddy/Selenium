package TestNG;


class Reversechar{
	
	void getValueRever(String s){

		System.out.println(s);
		
		char []arr=s.toCharArray();
		
		for (int i=arr.length-1;i>=0;i--){
			
			System.out.print(arr[i]);
		}
	System.out.println();
	}
	
}


























public class Rverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reversechar Reversechar=new Reversechar();
		Reversechar.getValueRever("SRINI");

	}

}
