package creational.pattern.singleton.staticblock;

public class CurrencyConvertor {

	private static CurrencyConvertor instance;
	
	static {
		instance = new CurrencyConvertor();
	}
	
	private CurrencyConvertor() {
		
	}
	
	public static CurrencyConvertor getInstance() {
		return instance;
	}
}
