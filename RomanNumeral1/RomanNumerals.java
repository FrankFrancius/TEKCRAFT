package number.to.roman;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class RomanNumerals {


	
	@Test
	public void ReceiveNumberOneReturnStringOne() {
		assertThat(findRoman(1),is("I"));
	}
	
	@Test
	public void ReceiveNumberTwoReturnStringOne() {
		assertThat(findRoman(2),is("II"));
	}
	
	@Test
	public void ReceiveNumberThreeReturnStringThree() {
		assertThat(findRoman(3),is("III"));
	}
	
	
	@Test
	public void ReceiveNumberFourReturnStringFour() {
		assertThat(findRoman(4),is("IV"));
	}

	@Test
	public void ReceiveNumberFiveReturnStringFive() {
		assertThat(findRoman(5),is("V"));
	}
	@Test
	public void ReceiveNumberSixReturnStringSix() {
		assertThat(findRoman(6),is("VI"));
	}
	
	@Test
	public void ReceiveNumberSevenReturnStringSeven() {
		assertThat(findRoman(7),is("VII"));
	}
	
	@Test
	public void ReceiveNumberEightReturnStringEight() {
		assertThat(findRoman(8),is("VIII"));
	}
	
	@Test
	public void ReceiveNumberNineReturnStringNine() {
		assertThat(findRoman(9),is("IX"));
	}
	
	@Test
	public void ReceiveNumberTenReturnStringTen() {
		assertThat(findRoman(10),is("X"));
	}
	
	@Test
	public void ReceiveNumberElevenReturnStringEleven() {
		assertThat(findRoman(11),is("XI"));
	}
	
	@Test
	public void ReceiveNumberTwelveReturnStringTwelve() {
		assertThat(findRoman(12),is("XII"));
	}
	
	@Test
	public void ReceiveNumberThirteenReturnStringThirteen() {
		assertThat(findRoman(13),is("XIII"));
	}
	
	@Test
	public void ReceiveNumberFourteenReturnStringFourteen() {
		assertThat(findRoman(14),is("XIV"));
	}
	
	@Test
	public void ReceiveNumberFifteenReturnStringFifteen() {
		assertThat(findRoman(15),is("XV"));
	}
	
	@Test
	public void ReceiveNumberSixteenReturnStringSixteen() {
		assertThat(findRoman(16),is("XVI"));
	}
	
	@Test
	public void ReceiveNumberNinteenReturnStringNinteen() {
		assertThat(findRoman(19),is("XIX"));
	}
	
	@Test
	public void ReceiveNumberTwentyReturnStringTwenty() {
		assertThat(findRoman(20),is("XX"));
	}
	
	@Test
	public void ReceiveNumberTwentyOneReturnStringTwentyOne() {
		assertThat(findRoman(20),is("XX"));
	}
	
	@Test
	public void ReceiveNumberTwentyNineReturnStringTwentyNine() {
		assertThat(findRoman(29),is("XXIX"));
	}
	
	@Test
	public void ReceiveNumberThirtyFiveReturnStringThirtyFive() {
		assertThat(findRoman(35),is("XXXV"));
	}
	
	@Test
	public void ReceiveNumberFourtyEightReturnStringFourtyEight() {
		assertThat(findRoman(35),is("XXXV"));
	}
	
	@Test
	public void ReceiveNumberFiftyReturnStringFifty() {
		assertThat(findRoman(50),is("L"));
	}
	
	@Test
	public void ReceiveNumberEightyFiveReturnStringEightyFive() {
		assertThat(findRoman(85),is("LXXXV"));
	}
	
	@Test
	public void ReceiveNumberNinetyReturnStringNinety() {
		assertThat(findRoman(90),is("XC"));
	}
	
	@Test
	public void ReceiveNumberNinetyNineReturnStringNinetyNine() {
		assertThat(findRoman(99),is("XCIX"));
	}
	
	@Test
	public void ReceiveNumberHundredReturnStringHundred() {
		assertThat(findRoman(100),is("C"));
	}
	
	@Test
	public void ReceiveNumber399ReturnString399() {
		assertThat(findRoman(399),is("CCCXCIX"));
	}

	@Test
	public void ReceiveNumber400ReturnString400() {
		assertThat(findRoman(400),is("CD"));
	}
	
	@Test
	public void ReceiveNumber450ReturnString450() {
		assertThat(findRoman(450),is("CDL"));
	}
	
	@Test
	public void ReceiveNumber500ReturnString500() {
		assertThat(findRoman(500),is("D"));
	}
	
	
	@Test
	public void ReceiveNumber432ReturnString432() {
		assertThat(findRoman(432),is("CDXXXII"));
	}
	
	@Test
	public void ReceiveNumber1000ReturnString1000() {
		assertThat(findRoman(1000),is("M"));
	}
	
	@Test
	public void ReceiveNumber2012ReturnString2012() {
		assertThat(findRoman(2012),is("MMXII"));
	}
	
	
	private String findRoman(int i) {
		// TODO Auto-generated method stub
		String isRoman = "";	
		int x = 0;

		while(i >= 1000)
		{
			isRoman += "M";
			i = i - 1000;
		}
		while(i >= 500)
		{
			isRoman += "D";
			i = i - 500;
		}
		if(i >= 400)
		{
			isRoman += "CD";
			i = i - 400;
		}
		
		while(i >= 100)
		{
			isRoman += "C";
			i = i - 100;
		}
		if (i >= 90)
		{
			isRoman += "XC";
			i = i - 90;
		}
		
		while (i >= 50)
		{
			isRoman += "L";
			i = i - 50;
		}
		while(i >= 10)
		{
			isRoman +="X";
			i = i - 10;
		}
					
		if(i == 9)
		{
			isRoman += "IX";
			i = i - 9;
		}
		
		if(i >= 5)
		{		
			isRoman += "V";
			i = i - 5;
		}
		if (i == 4)
		{
			isRoman += "IV";
		}
		if(i < 4)
		{
			while (x < i)
			
			{
				isRoman += "I";
				x++;						
			}
		}
					
		return isRoman;
	}
	
	

}
