package roman.calculator;

public class RomanSubs {

	private String pattern;
	private String replacement;

	public RomanSubs(String pattern, String replacement) {
		this.pattern = pattern;
		this.replacement = replacement;
	}

	public String expandRoman(String s) {
		return s.replaceAll(pattern, replacement);
	}
}
