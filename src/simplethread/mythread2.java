package simplethread;

public class mythread2 extends Thread {
	String name;
	mythread2(String name){
		this.name = name;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name);
		}
	}

}
