package threadcallable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class mainclass {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		mythread1 mt1 = new mythread1(4);
		mythread1 mt2 = new mythread1(6);
		ExecutorService obj = Executors.newCachedThreadPool();
		Future<Integer> n = obj.submit(mt1);
		System.out.println(n.get());
		Future<Integer> n1 = obj.submit(mt2);
		System.out.println(n1.get());
		
		
	}

}
