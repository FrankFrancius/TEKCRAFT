package infix.postfix;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Stack;

import org.hamcrest.Matcher;
import org.junit.Test;

public class InfixPostfix3Test {

	@Test
	public void sendEmptyStringReceiveEmptyString() {
		assertThat(getInfixToPostfix(""), is(""));
	}

	@Test
	public void sendConstantStringReceiveSameConstantString() {
		assertThat(getInfixToPostfix("3"), is("3"));
	}
	
	@Test
	public void tranformBinaryExpressionToInfixExpression() 
	{			
		assertThat(getInfixToPostfix("1+5"), is("1 5 +"));
		assertThat(getInfixToPostfix("1+6"), is("1 6 +"));
	}
	
	@Test
	public void tranformMultipleDigitExpressionToInfixExpression() 
	{
		assertThat(getInfixToPostfix("20+150"), is("20 150 +"));
	}
	
	@Test
	public void tranformMultipleDigitAndMultipleOperatorExpressionToInfixExpression() {
		assertThat(getInfixToPostfix("3+15*45"), is("3 15 45 * +"));
	}	
	
	@Test
	public void tranformBinaryExpressionToInfixExpression2() {
		assertThat(getInfixToPostfix("2+3*4-5"), is("2 3 4 * + 5 -"));
	}
	
	@Test
	public void tranformBinaryExpressionToInfixExpression3() {
		assertThat(getInfixToPostfix("2*3-4/5"), is("2 3 * 4 5 / -"));
	}
	
	public int compareOperator(String c)
	{
		int cst = 0;
		if (c.equals("+")  || c.equals("-"))
		{
			cst = 1;
		}
		if (c.equals("*") || c.equals("/"))
		{
			cst = 2;
		}
		return cst;
	}
	
	private String getInfixToPostfix(String strInput) {
		// TODO Auto-generated method stub
		Stack<String> st = new Stack<String>();
		String isNumber = "";
		String isOperator = "";
		String isResult = "";
		String isPeek = "";
		
		for(int i = 0;strInput.length() > i; i++)
		{
			if(Character.isDigit(strInput.charAt(i)))
			{
				isNumber += Character.toString(strInput.charAt(i));
			}
			else
			{				
				if (st.empty())
				{
					st.push(Character.toString(strInput.charAt(i)));
					isNumber += " ";
				}
				else
				{
					isPeek = st.peek();
					while (compareOperator(isPeek) >= compareOperator(Character.toString(strInput.charAt(i))) && (!st.isEmpty()))  				    
					{	
						isNumber += " " + st.pop();
						
						if(!st.isEmpty())
						{
							isPeek = st.peek();
						}							
					}																	
							st.push(Character.toString(strInput.charAt(i)));							
							isNumber += " ";										
				}
			}
		}
		
		while (!st.isEmpty())
		{
			isOperator += " " + st.pop();
		}
		
		isResult = isNumber + isOperator;
		
		return  isResult.trim();
	}
}
