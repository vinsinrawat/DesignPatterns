package creational.pattern.singleton.problemSolved.multithreading;

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		CurrencyConvertor cc1 = CurrencyConvertor.getInstance();
		System.out.println(cc1.hashCode()+"\t"+Thread.currentThread().getName());
	}

}
