package roman.calculator;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class RomanCalculator {

	@Test
	public void calculateOnePlusOneEqualTwo() {
		assertThat(RomanCal("I","I"),is("II"));
	}

	@Test
	public void calculateOnePlusTwoEqualThree() {
		assertThat(RomanCal("I","II"),is("III"));
	}
	

	@Test
	public void calculateIIPlusTwoEqualII() {
		assertThat(RomanCal("II","II"),is("IV"));
	}

	@Test
	public void calculateOnePlusThreeEqualFour() {
		assertThat(RomanCal("I","III"),is("IV"));
	}
	
	@Test
	public void calculateTenPlusTwoEqualXXII() {
		assertThat(RomanCal("XX","II"),is("XXII"));
	}
	
	@Test
	public void calculateXXIIPlusIIEqualXXIV() {
		assertThat(RomanCal("XXII","II"),is("XXIV"));
	}
	
	@Test
	public void calculateXXPlusIIEqualXX() {
		assertThat(RomanCal("XX","XX"),is("XL"));
	}
	
	
	@Test
	public void calculateIIIPlusIIEqualII() {
		assertThat(RomanCal("III","II"),is("V"));
	}
	

	@Test
	public void calculateVPlusVEqualX() {
		assertThat(RomanCal("V","V"),is("X"));
	}
	
	@Test
	public void calculateLPlusLEqualC() {
		assertThat(RomanCal("L","L"),is("C"));
	}
	
	@Test
	public void calculateDPlusDEqualM() {
		assertThat(RomanCal("D","D"),is("M"));
	}
	
	@Test
	public void calculateCCCPlusCCCEqualDC() {
		assertThat(RomanCal("CCC","CCC"),is("DC"));
	}
	
	@Test
	public void calculateIPlusIVEqualV() {
		assertThat(RomanCal("I","IV"),is("V"));
	}
	
	@Test
	public void calculateCLXIXPlusCXLVEqualCCCXIV() {
		assertThat(RomanCal("CCCLXIX","DCCCXLV"),is("MCCXIV"));
	}

	final static RomanSubs[] table = {
		new RomanSubs("IV", "IIII"),
		new RomanSubs("IX", "VIIII"),
		new RomanSubs("XL", "XXXX"),
		new RomanSubs("XC", "LXXXX"),
		new RomanSubs("CD", "CCCC"),
		new RomanSubs("CM", "DCCCC"),							
	};
	
	final static RomanEquivalence[] tables =
		{		
		    new RomanEquivalence(5,"IIIII","V"),		    
			new RomanEquivalence(5,"XXXXX","L"),
			new RomanEquivalence(4,"IIII","IV"),			
			new RomanEquivalence(4,"XXXX","XL"),
			new RomanEquivalence(4,"CCCC","CD"),
			new RomanEquivalence(5,"CCCCC","D"),
			new RomanEquivalence(2,"VV","X"),
			new RomanEquivalence(2,"LL","C"),
			new RomanEquivalence(2,"DD","M"),					
		};
	
	final static RomanOrder[] tableOrdered = {
		new RomanOrder(1000, "M"),
		new RomanOrder(500, "D"),
		new RomanOrder(100, "C"),		
		new RomanOrder(50, "L"),		
		new RomanOrder(10, "X"),
		new RomanOrder(5, "V"),
		new RomanOrder(1, "I"),		
	};
	
	
	
	private String findSubstitutes(String romanNumber)
	{		
		String substractiveNumber = "";	
		substractiveNumber = romanNumber;
								
		for (RomanSubs substitution : table)
		{
			substractiveNumber = substitution.expandRoman(substractiveNumber);			
		}
								
		return substractiveNumber;
	}
	
	private String findEquivalence(String romanNumber)
	{
		String equivalenceNumber = "";
		int resultPattern = 0;	
		
		for (RomanEquivalence equi : tables)
		{								
			{
				resultPattern = equi.FindOccurrence(romanNumber);
		
				if (resultPattern != 0)
				{													
				    if (equi.getOccurrence() > 0)
					{					
						equivalenceNumber = equi.unCompactRomanValue(romanNumber);						
						romanNumber = equivalenceNumber;						
					}					
				}	
			}			
		}	
						
		return romanNumber;
	}
	
	private int nthOccurrence(String str, String c)
	{
		int index = 0; 
		
		for(int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == c.charAt(0))
			{
				index++;
			}							
		}		
		return index;
	}
		

	public String buildNumber(String romNumber)
	{
		int countNbrOfI = 0;
		int countNbrOfX = 0;
		int countNbrOfC = 0;
		
		String repConcat = "";
						
		countNbrOfI = nthOccurrence(romNumber,"I");
		countNbrOfX = nthOccurrence(romNumber,"X");
		countNbrOfC = nthOccurrence(romNumber,"C");
			
		if (countNbrOfI >= 5)
		{
			repConcat = romNumber.replaceAll("IIIII", "V");
		}
		
		if(countNbrOfX >= 5)
		{
			repConcat = romNumber.replaceAll("XXXXX", "L");
		}
		
		if(countNbrOfC >= 5)
		{
			repConcat = romNumber.replaceAll("CCCCC", "D");
		}
										
		return repConcat;
	}
	
	private String RomanSorting(String number)
	{			
		String isRoman = "";
		
		for (RomanOrder nval: tableOrdered )
		{						
			for (int i = 0; i < number.length();i++)
			{			
				if (nval.string.charAt(0) == number.charAt(i))
				{				
					isRoman+= number.charAt(i);
				}			
			}			
		}
					
		return isRoman;
	}
	
	
	private String RomanCal(String number1, String number2) {
		// TODO Auto-generated method stub
		String isResult = ""; 		
		 		
		isResult = RomanSorting(findSubstitutes(number1)+findSubstitutes(number2));
					
		if (!buildNumber(isResult).isEmpty())
		{			
			isResult = buildNumber(isResult);			
		}
				
		if (!findEquivalence(isResult).isEmpty())
		{			
			isResult = findEquivalence(isResult);			
		}
		
		return isResult;
	}
}
