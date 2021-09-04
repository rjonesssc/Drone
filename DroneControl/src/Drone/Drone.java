//Author Robert Jones
//08/29/21
//Program Name: Drone Movement
//Purpose: Simulation using button, drone movement in x, y, z location.

package Drone;
import java.util.Scanner;
public class Drone {

	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		int menu = 0;  //used to store menu selection
		
		//sets initial x,y,z coordinates
		int x = 0;
		int y = 0;
		int z = 0;
		
		while (menu != 8) {
			 System.out.println("Move Drone which way?");
			 System.out.println("1. Right"); //increase x
			 System.out.println("2. Left"); //decrease x
			 System.out.println("3. Forward"); //increase y
			 System.out.println("4. Backward"); //decrease y
			 System.out.println("5. Up"); //increase z
			 System.out.println("6. Down"); //decrease z
			 System.out.println("7. Display Drone Coordinates");
			 System.out.println("8. Exit");
			  
			 System.out.println("Enter Selection:");
			 menu = console.nextInt();
			 
			 if (menu >= 1 && menu <= 8) {
				//performs menu selection operations
				switch(menu) {
					case 1: 
						x += 1; 
						System.out.println("Drone moved Right."); 
						break;
					case 2: 
						x -= 1; 
						System.out.println("Drone moved Left."); 
						break;
					case 3: 
						y += 1; 
						System.out.println("Drone moved Forward."); 
						break;
					case 4: 
						y -= 1; 
						System.out.println("Drone moved Backward."); 
						break;
					case 5: 
						z += 1; 
						System.out.println("Drone moved Up."); 
						break;
					case 6: 
						z -= 1; 
						System.out.println("Drone moved Down."); 
						break;
					case 7: 
						System.out.println("Current coordinates are: "+ x + ", " + y +", " + z + "."); 
						break;
					}
			} else System.out.println("Please input value 1-8 from the menu.");
		}

System.out.println("Fly safe out there!");	
console.close();

	}
}
