package number.to.roman;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class RomanNumerals2 {

	@Test
	public void convertNumber2000ToRomanString2000() {
		assertThat(converting(2000),is("MM"));
	}

	@Test
	public void convertNumber1000ToRomanString1000() {
		assertThat(converting(1000),is("M"));
	}

	@Test
	public void convertNumber1500ToRomanString1500() {
		assertThat(converting(1500),is("MD"));
	}
	
	@Test
	public void ReceiveNumberOneReturnStringOne() {
		assertThat(converting(1),is("I"));
	}
	
	@Test
	public void ReceiveNumberTwoReturnStringOne() {
		assertThat(converting(2),is("II"));
	}
	
	@Test
	public void ReceiveNumberThreeReturnStringThree() {
		assertThat(converting(3),is("III"));
	}
	
	
	@Test
	public void ReceiveNumberFourReturnStringFour() {
		assertThat(converting(4),is("IV"));
	}

	@Test
	public void ReceiveNumberFiveReturnStringFive() {
		assertThat(converting(5),is("V"));
	}
	@Test
	public void ReceiveNumberSixReturnStringSix() {
		assertThat(converting(6),is("VI"));
	}
	
	@Test
	public void ReceiveNumberSevenReturnStringSeven() {
		assertThat(converting(7),is("VII"));
	}
	
	@Test
	public void ReceiveNumberEightReturnStringEight() {
		assertThat(converting(8),is("VIII"));
	}
	
	@Test
	public void ReceiveNumberNineReturnStringNine() {
		assertThat(converting(9),is("IX"));
	}
	
	@Test
	public void ReceiveNumberTenReturnStringTen() {
		assertThat(converting(10),is("X"));
	}
	
	@Test
	public void ReceiveNumberElevenReturnStringEleven() {
		assertThat(converting(11),is("XI"));
	}
	
	@Test
	public void ReceiveNumberTwelveReturnStringTwelve() {
		assertThat(converting(12),is("XII"));
	}
	
	@Test
	public void ReceiveNumberThirteenReturnStringThirteen() {
		assertThat(converting(13),is("XIII"));
	}
	
	@Test
	public void ReceiveNumberFourteenReturnStringFourteen() {
		assertThat(converting(14),is("XIV"));
	}
	
	@Test
	public void ReceiveNumberFifteenReturnStringFifteen() {
		assertThat(converting(15),is("XV"));
	}
	
	@Test
	public void ReceiveNumberSixteenReturnStringSixteen() {
		assertThat(converting(16),is("XVI"));
	}
	
	@Test
	public void ReceiveNumberNinteenReturnStringNinteen() {
		assertThat(converting(19),is("XIX"));
	}
	
	@Test
	public void ReceiveNumberTwentyReturnStringTwenty() {
		assertThat(converting(20),is("XX"));
	}
	
	@Test
	public void ReceiveNumberTwentyOneReturnStringTwentyOne() {
		assertThat(converting(20),is("XX"));
	}
	
	@Test
	public void ReceiveNumberTwentyNineReturnStringTwentyNine() {
		assertThat(converting(29),is("XXIX"));
	}
	
	@Test
	public void ReceiveNumberThirtyFiveReturnStringThirtyFive() {
		assertThat(converting(35),is("XXXV"));
	}
	
	@Test
	public void ReceiveNumberFourtyEightReturnStringFourtyEight() {
		assertThat(converting(35),is("XXXV"));
	}
	
	@Test
	public void ReceiveNumberFiftyReturnStringFifty() {
		assertThat(converting(50),is("L"));
	}
	
	@Test
	public void ReceiveNumberEightyFiveReturnStringEightyFive() {
		assertThat(converting(85),is("LXXXV"));
	}
	
	@Test
	public void ReceiveNumberNinetyReturnStringNinety() {
		assertThat(converting(90),is("XC"));
	}
	
	@Test
	public void ReceiveNumberNinetyNineReturnStringNinetyNine() {
		assertThat(converting(99),is("XCIX"));
	}
	
	@Test
	public void ReceiveNumberHundredReturnStringHundred() {
		assertThat(converting(100),is("C"));
	}
	
	@Test
	public void ReceiveNumber399ReturnString399() {
		assertThat(converting(399),is("CCCXCIX"));
	}

	@Test
	public void ReceiveNumber400ReturnString400() {
		assertThat(converting(400),is("CD"));
	}
	
	@Test
	public void ReceiveNumber450ReturnString450() {
		assertThat(converting(450),is("CDL"));
	}
	
	@Test
	public void ReceiveNumber500ReturnString500() {
		assertThat(converting(500),is("D"));
	}
	
	
	@Test
	public void ReceiveNumber432ReturnString432() {
		assertThat(converting(432),is("CDXXXII"));
	}
	
	@Test
	public void ReceiveNumber1000ReturnString1000() {
		assertThat(converting(1000),is("M"));
	}
	
	@Test
	public void ReceiveNumber2012ReturnString2012() {
		assertThat(converting(2012),is("MMXII"));
	}
	
	final static Roman[] table = {
		new Roman(1000, "M"),
		new Roman(900, "CM"),
		new Roman(500, "D"),
		new Roman(400, "CD"),
		new Roman(100, "C"),
		new Roman(90, "XC"),
		new Roman(50, "L"),
		new Roman(40, "XL"),
		new Roman(10, "X"),
		new Roman(9, "IX"),
		new Roman(5, "V"),
		new Roman(4, "IV"),
		new Roman(1, "I"),
		
	};
	
	
	private String converting(int i) {
		// TODO Auto-generated method stub
		 
		
		String isRoman = "";
		
		for(Roman nvalue : table)
		{
			while (i >= nvalue.number)
			{
				i -= nvalue.number;
				isRoman += nvalue.romanNumber;
			}
		}
		
		return isRoman;
	}

	
}
