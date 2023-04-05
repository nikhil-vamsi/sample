package synchronization;

public class mainclass {
	public static void main(String[] args) {
		table obj = new table();
		mythread1 t1 = new mythread1(obj);
		mythread2 t2 = new mythread2(obj);
		t1.start();
		t2.start();
		System.out.println((t1.isDaemon()));
	}
}
