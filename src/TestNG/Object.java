package TestNG;

class A{
	
	void test1(){
		int x=10;
	}

void test2(A a){

	a.test1();
	
	int y=20;
	
	System.out.println(y+"  "+a);
}

}





















public class Object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		a.test2(a);
	}

}
