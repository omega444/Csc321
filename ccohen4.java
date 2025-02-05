//Cameron Cohen
//lab 4
import java.util.Scanner;
public class ccohen4
{
	public static void main(String [] args)
	{
		int x = 0;

		System.out.println("welcome adventurer! Which class would you like to play as?");
		Scanner input = new Scanner(System.in);
		System.out.println("Option 1: Assassin");
		System.out.println("Option 2: Broke College Student");
		System.out.println("Option 3: rich college professor(hypothetical)");
		System.out.println("Option 4: Mage");
		System.out.println("You chose "+ input);
		x= input.nextInt();
		input.close();
	}
}
