import java.util.Scanner;

public class Main {
	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch)) {
			System.out.println("Character "+ch+" is a digit");
		}
		else if(!Character.isLetter(ch)) {
			System.out.println("Entered character "+ch+" is Digit....");
		}
		else {
			switch(Character.toLowerCase(ch)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered character "+ch+" is lower-case Vowel");
				}
				else {
					System.out.println("Entered character "+ch+" is Upper-case Vowel");
				}
				break;
			default:
				if(Character.isLowerCase(ch)) {
					System.out.println("Entered character "+ch+" is lower-case Consonent");
				}
				else {
					System.out.println("Entered character "+ch+" is Upper-case Consonent");
				}
			}
		}
		
		
		
		
//		if(ch>=97 && ch<=123) {
//			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				System.out.println("character is lower-case vowel");
//			}else {
//				System.out.println("character is lower-case consonent");
//			}
//		}
//		else if(ch>=65 && ch<=91) {
//			if(ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='U') {
//				System.out.println("character is upper-case vowel");
//			}
//			else {
//				System.out.println("character is upper-case consonent");
//			}
//		}
//		else if(ch>=0 && ch<=9) {
//			System.out.println("character is digit");
//		}
//		else {
//			System.out.println("character is special character");
//		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character");
		char ch= sc.next().charAt(0);
		identifyCharacter(ch);

	}

}
