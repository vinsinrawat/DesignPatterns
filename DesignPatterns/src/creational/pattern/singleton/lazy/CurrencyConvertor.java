package creational.pattern.singleton.lazy;

public class CurrencyConvertor {

	private static CurrencyConvertor instance;
	
	private CurrencyConvertor() {
		
	}
	
	public static CurrencyConvertor getInstance() {
		if(instance==null) {
			instance = new CurrencyConvertor();
		}
		return instance;
	}
}
