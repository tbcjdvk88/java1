package sec01.exam01;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strVar1="신민철";
		String strVar2="신민철";
		
		if(strVar1==strVar2) {
			System.out.println("strVar1=strVar2");
		}
		else {
			System.out.println("strVar1!=strVar2");
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1=strVar2문자열");
		}
		
		String strVar3=new String("신민철");	
		String strVar4=new String("신민철");
		
		if(strVar3==strVar4) {
			System.out.println("strVar3=strVar4");
		}
		else {
			System.out.println("strVar31=strVar4");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3=strVar4문자열");
		}
	}

}
