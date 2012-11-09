package fizz.buzz;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class Fizzbuzz {

	@Test
	public void fizzbuzzTestEmptyStingOutputEmptySting() {
		assertThat(CalcFizzBuzz(""),is(""));
	}

	@Test
	public void fizzbuzzTestInput1Output1() {
		assertThat(CalcFizzBuzz("1"),is("1"));
	}
	
	@Test
	public void fizzbuzzTestInput2Output2() {
		assertThat(CalcFizzBuzz("2"),is("2"));
	}
	
	@Test
	public void fizzbuzzTestInput3OutputFizz() {
		assertThat(CalcFizzBuzz("3"),is("Fizz"));
	}
	
	@Test
	public void fizzbuzzTestInput5OuptputBuzz() {
		assertThat(CalcFizzBuzz("5"),is("Buzz"));
	}
	
	@Test
	public void fizzbuzzTestInput15OuptputBuzz() {
		assertThat(CalcFizzBuzz("15"),is("FizzBuzz"));	
	}
		
	public static String CalcFizzBuzz(String number) {
		// TODO Auto-generated method stub		
		String outputRep = "";		

		if (number != "")
		{
			if ((Integer.parseInt(number) % 3)== 0)
			{
				outputRep = "Fizz";
			}
			if ((Integer.parseInt(number) % 5)== 0)
			{
				outputRep += "Buzz";
			}
		}		
		return outputRep.isEmpty() ? (number) : outputRep;
	}
}
