package bank.OCR;

public class LCD {
				
	
		public String calcScan(int numberInput) {
			String numberStr = ""; 										
		
			if (numberInput >= 0)
			{
				if (numberInput == 1)
				{
					numberStr = "...\n" +
								"..|\n" +
								"..|";
				}
				else if (numberInput == 2)
				{
					numberStr = "._.\n" +
							 	"._|\n" +
							 	"|_.";
				}
				else if (numberInput == 3)
				{
					numberStr = "._.\n" +
							 	"._|\n" +
							 	"._|";
				}			
				else if (numberInput == 4)
					numberStr = "...\n" +
								"|_|\n" +
								"..|";
				else if (numberInput == 5)
					numberStr = "._.\n" +
								"|_.\n" +
								"._|";
				
				else if (numberInput == 6)
					numberStr = "._.\n" +
								"|_.\n" +
								"|_|";
				
				
				else if (numberInput == 7)
					numberStr = "._.\n" +
								"..|\n" +
								"..|";
				
				
				else if (numberInput == 8)
					numberStr = "._.\n" +
								"|_|\n" +
								"|_|";

				
				else if (numberInput == 9)
					numberStr = "._.\n" +
								"|_|\n" +
								"..|";

				else if (numberInput == 0)
					numberStr = "._.\n" +
								"|.|\n" +
								"|_|";
				

			}							
			return numberStr;			
		}
}
