package threadrunnable;

public class mainclass {

	public static void main(String[] args) {
		mythread1 obj = new mythread1("nikhil");
		Thread t = new Thread(obj);
		t.setPriority(10);
		t.start();
		
		for(int i=0;i<3;i++) {
			System.out.println(("hii"+Thread.currentThread().getName()));
		}
	}

}
