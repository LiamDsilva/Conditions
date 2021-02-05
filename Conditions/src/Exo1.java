import java.util.Scanner;
/*
* Author : Liam
*Date : 1 Feb, 2021
*Description: The properties of the last four digits to be a telemarketer are: first or last number is 8 or 9 and numbers 2 and 3 must be the same. 
* If it is a telemarketer, output is ignore, if those numbers do not match, it is not a telemarketer. 
*/
public class Exo1
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);  
				System.out.println("C'est quoi la première chiffre des derenière 4 numéros? ");
				int  ch1= sc.nextInt();
				System.out.println("C'est quoi la deuxième chiffre des derenière 4 numéros? ");
				int  ch2= sc.nextInt();
				System.out.println("C'est quoi la troisième chiffre des derenière 4 numéros? ");
				int  ch3 = sc.nextInt();
				System.out.println("C'est quoi la quatrième chiffre des derenière 4 numéros? ");
				int  ch4 = sc.nextInt();
				
				if(ch1==8-9)
					System.out.println("ignore");
				else if(ch2==0-9)
					System.out.println("ignore");
				else if(ch3==0-9)
					System.out.println("ignore");
				else if(ch4==8-9)
					System.out.println("ignore");
				
				
				sc.close();
				
			}

	}
