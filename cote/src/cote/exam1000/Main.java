package cote.exam1000;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scanner=new Scanner(System.in);
		String input= scanner.nextLine();
		String[] strs=input.split(" "); //"10 11"
		
		int n1 = Integer.parseInt(strs[0]);
		int n2 = Integer.parseInt(strs[1]);
		
		System.out.println(n1+n2);
		
	}

}
