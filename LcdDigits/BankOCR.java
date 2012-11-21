package bank.OCR;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class BankOCR {

	
	LCD c = new LCD();
	Numbers n = new Numbers();
		
	
	@Test
	public void StringEqualsSymbol() {
		for (int i = 0; i <= 9; i++) {
			assertThat(c.calcScan(i), is(n.FindNumbers(i)));
		}
	}
				
	
	@Test
	public void StringTenEqualNumberTenLCD() {
		assertThat(("...\n"+
	                "..|\n"+
				    "..|" ) + ("._.\n" +
							   "|.|\n" +
							   "|_|"), is(n.FindNumbers(1)+n.FindNumbers(0)));		
		
	}
}
