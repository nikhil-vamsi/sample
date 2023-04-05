package threadcallable;

import java.util.concurrent.Callable;

public class mythread1 implements Callable<Integer> {

	int num;
	mythread1(int num){
		this.num=num;
	}
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		return sum;
	}
	

}
