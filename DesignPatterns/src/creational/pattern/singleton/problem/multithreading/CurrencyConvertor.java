package creational.pattern.singleton.problem.multithreading;

public class CurrencyConvertor {

	private static CurrencyConvertor instance;
	
	private CurrencyConvertor() {
		
	}
	
	public static CurrencyConvertor getInstance() {
		if(instance == null) {
			instance = new CurrencyConvertor();
		}
		return instance;
	}
}
