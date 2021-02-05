import java.util.Scanner;

/*
* Author : Liam
*Date : 4 Feb, 2021
*There is a alien on the planet earth and a person has witnessed it. 
*There are three different possibilities of alien species. 
*With the number of antennas and eyes, we will be able to identify which alien we have encountered
*/
public class Exo2
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				
				System.out.println("How many antennas? ");
			
				System.out.println("How many eyes? ");
				
				int antenna = sc.nextInt();
				int eyes = sc.nextInt();
				
				if(antenna>=3 || eyes<=4)
					System.out.println("TroyMartian ");
				else if(antenna<=6 || eyes>=2)
					System.out.println("VladSaturnian");
				else if(antenna>=2 || eyes>=3)
					System.out.println("GraemeMercurian");
				else
					System.out.println("There is no output");
				
				
				
				sc.close();

			}

	}
