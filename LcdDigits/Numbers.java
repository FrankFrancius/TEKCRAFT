package bank.OCR;

public class Numbers {
	
	
	String FindNumbers(int Number)
		{					
			String numberFormat [] = 
				{
					"._.\n" +
					"|.|\n" +
					"|_|",
					
					"...\n" +
					"..|\n" +
					"..|",
					
					"._.\n" +
		 			"._|\n" +
		 			"|_.",
					
		 			"._.\n" +
		 			"._|\n" +
		 			"._|",
					
		 			"...\n" +
					"|_|\n" +
					"..|",
					
					"._.\n" +
					"|_.\n" +
					"._|",
					
					"._.\n" +
					"|_.\n" +
					"|_|",
					
					"._.\n" +
					"..|\n" +
					"..|",
					
					"._.\n" +
					"|_|\n" +
					"|_|",
					
					"._.\n" +
					"|_|\n" +
					"..|"
				};
									
		
	return numberFormat[Number];

	}
}
	

