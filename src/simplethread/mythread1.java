package simplethread;

public class mythread1 extends Thread {
	String name;
	mythread1(String name){
		this.name = name;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name);
		}
	}

}
