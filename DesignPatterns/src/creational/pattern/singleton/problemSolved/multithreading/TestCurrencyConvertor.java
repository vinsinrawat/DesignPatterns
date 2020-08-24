package creational.pattern.singleton.problemSolved.multithreading;

public class TestCurrencyConvertor {

	public static void main(String[] args) {
		MyRunnable myRun = new MyRunnable();
		for(int i = 1; i<50; i++) {
			Thread t1 = new Thread(myRun);
			Thread t2 = new Thread(myRun);
			t1.start();
			t2.start();
		}
	}

}
