package sec04.exam05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData=scanner.nextLine();
			System.out.println(inputData);
			if(inputData.equals("q")) {
				break;
			}
		}

	}

}
