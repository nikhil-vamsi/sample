package simplethread;

public class mainclass {
	public static void main(String[] args) {
		mythread1 t1= new mythread1("nikhil");
		mythread2 t2 = new mythread2("vamsi");
		t1.start();
		t2.start();
		for(int i=0;i<3;i++) {
			System.out.println("hello");
		}
	
	}
		
}
