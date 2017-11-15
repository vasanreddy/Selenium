package TestNG;

class Tryanglevalue{
	
	void getTry(int num){
		
		for(int i=1;i<num;i++){
			
			for(int j=0;j<i;j++){
				
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}


























public class TryAngle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tryanglevalue Tryanglevalue=new Tryanglevalue();
		Tryanglevalue.getTry(7);

	}

}
