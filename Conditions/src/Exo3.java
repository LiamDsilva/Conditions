import java.util.Scanner;

/*
* Author : Liam
*Date : 1 Feb, 2021
*There are radar signs to tell whether a person is speeding on the road. 
*There are different numbers to see how much you will get fined at the speed you are going at. 
*/
public class Exo3
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				System.out.println("Entrer la limite de vitesse: ");
				int vitesselimite = sc.nextInt();
				System.out.println("Entrer la limite de ton voiture: ");
				int vitessevoiture = sc.nextInt();


				
				if(vitessevoiture>vitesselimite)
					System.out.println("Ton fine est de 100$ ");
				else if(vitessevoiture>20)
					System.out.println("Ton fine est de 270$");
				else if(vitessevoiture>31)
					System.out.println("Ton fine est de 500$");
				else 
					System.out.println("Félicitations, vous êtes dans la limite de vitesse! ");
				
				sc.close();

			}

	}
