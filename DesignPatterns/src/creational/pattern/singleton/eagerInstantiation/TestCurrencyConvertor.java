package creational.pattern.singleton.eagerInstantiation;

public class TestCurrencyConvertor {

	public static void main(String[] args) {
		CurrencyConvertor cc1 = CurrencyConvertor.getInstance();
		CurrencyConvertor cc2 = CurrencyConvertor.getInstance();
		System.out.println("cc1==cc2 :?" +(cc1==cc2));
	}

}
