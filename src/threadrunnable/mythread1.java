package threadrunnable;

public class mythread1 implements Runnable {
	String name;
	mythread1(String name){
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println(name+Thread.currentThread().getName());
		}

	}

}
