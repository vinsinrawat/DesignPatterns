package creational.pattern.singleton.eagerInstantiation;

public class CurrencyConvertor {

	private static CurrencyConvertor instance = new CurrencyConvertor();
	
	private CurrencyConvertor() {
		
	}
	
	public static CurrencyConvertor getInstance() {
		return instance;
	}
}
