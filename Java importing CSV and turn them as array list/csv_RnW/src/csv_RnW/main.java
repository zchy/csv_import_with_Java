package csv_RnW;

import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;



public class main {

	public static void main(String[] args) {
		
		ArrayList<String> postCode = new ArrayList<String>();
		ArrayList<String> salesRepID = new ArrayList<String>();
		ArrayList<String> salesRepName = new ArrayList<String>();
		ArrayList<String> year = new ArrayList<String>();
		ArrayList<String> saleValue = new ArrayList<String>();
		
		
		String fileName = "data/Sample_Sales_Data.csv";
		File file = new File(fileName);
		
		try {
			Scanner inputStream = new Scanner(file);
			//inputStream.next();
			while (inputStream.hasNext()) {
				String data = inputStream.nextLine();
				String[] values = data.split(",");
				//System.out.println(data);
				//System.out.println(values[3]);
				postCode.add(values[0]);
				salesRepID.add(values[1]);
				salesRepName.add(values[2]);
				year.add(values[3]);
				saleValue.add(values[4]);
	
			}
			inputStream.close();
			
		} catch(FileNotFoundException e){
			e.printStackTrace();
		}
		
		System.out.println(postCode +"\n" + salesRepID +"\n" + salesRepName +"\n"+ year +"\n" + saleValue);

	}

}
