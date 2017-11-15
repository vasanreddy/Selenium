package TestNG;


class FactorialNum{
	void getFact(int factnum){
		
		int fact=1;
		
		for(int i=1;i<=factnum;i++){
			
			fact=fact*i;
			
		}
	System.out.println("fact value"+fact+"is i"+fact);
	
	}
}





















public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactorialNum FactorialNum=new FactorialNum();
		FactorialNum.getFact(5);

	}

}
