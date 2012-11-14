package roman.calculator;

public class RomanEquivalence {

	private int occurrence;
	private String pattern;
	private String replacement;
		
	public RomanEquivalence(int occurrence, String pattern, String replacement) {
		this.occurrence = occurrence;
		this.pattern = pattern;
		this.replacement = replacement;		
	}
	
	 
	
	
	public String unCompactRomanValue(String s) {
		return s.replaceAll(pattern, replacement);
	}
	
	public int getOccurrence() {
		return occurrence;
	}




	public String CompactRomanValue(String s) {
		return s.replaceAll(replacement, pattern);
	}
	
	public int FindOccurrence(String s)
	{
	return nthOccurrence(s, pattern);
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
}
