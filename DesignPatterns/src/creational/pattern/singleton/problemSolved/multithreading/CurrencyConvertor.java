package creational.pattern.singleton.problemSolved.multithreading;

public class CurrencyConvertor {

	private static CurrencyConvertor instance;
	
	private CurrencyConvertor() {
		
	}
	
	public static synchronized CurrencyConvertor getInstance() {
		if(instance == null) {
			instance = new CurrencyConvertor();
		}
		return instance;
	}
}
