package TestNG;



class Revese{
	
	void getReverse(){
		String name="CTCs";
		String Reversename="";
		
		System.out.println(name);
		for(int i=name.length()-1;i>=0;i--){
		
		Reversename+=name.charAt(i);
		}
	System.out.println(Reversename);
	
	}
}

















public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Revese Revese=new Revese();
		Revese.getReverse();

	}

}
