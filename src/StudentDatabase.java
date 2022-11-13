import java.util.*;
public class StudentDatabase {

	public static void main(String[] args) {
		Scanner scnr = new Scanner (System.in);
		
		String[] name = {"Robert Brown", "Linda Davis", "Jennifer Garcia", "Elizabeth Harris", "James Johnson", "Patricia Jones", "Michael Miller", "John Smith", "Mary Williams", "David Wilson"};
		String[] hometown = {"Rochester Hills, MI", "Rochester, MI", "Troy, MI", "Auburn Hills, MI", "Rochester Hills, MI", "Troy, MI", "Rochester, MI", "Rochester, MI", "Rochester Hills, MI", "Pontiac, MI"};
		String[] food = {"Pizza", "Hamburgers", "Spaghetti", "Brownies", "Popcorn", "Hot dogs", "Cookies", "Pizza", "Macaroni and cheese", "Burgers"};

		System.out.print("Welcome to our Java class. Which student would you like to learn more about? (enter a number 1-10): ");
		
//		boolean flag = false;
//		
//		do
//		{
			//put all code under this do inside these brackets

			int student = scnr.nextInt();
			System.out.println();

			try
			{
				System.out.println("Student is " + name[student] + ". What would you like to know about them? (enter \"hometown\" or \"favorite food\"): ");
//				if (name[11].equals("Robert Brown"))
//				{
////					System.out.println();
//					System.out.print("Student " + student + " is " + name[student] + ". What would you like to know about them? (enter \"hometown\" or \"favorite food\"): ");
////					String info = scnr.next();
////					System.out.println();
//				}
//				flag = false;
			}
			catch (IndexOutOfBoundsException e)
			{
				System.out.print("That student does not exist. Please try again. (enter a number 1-10): ");
				
//				flag = true;
//				main(null);
			}
			
//			System.out.println();
			//System.out.print("Student " + student + " is " + name[student] + ". What would you like to know about them? (enter \"hometown\" or \"favorite food\"): ");
			String info = scnr.next();
			System.out.println();
			
			if (info.equalsIgnoreCase("hometown"))
			{
				System.out.println(name[student] + " is from " + hometown[student]);
			}
			else if (info.equalsIgnoreCase("favorite food"))
			{
				System.out.println(name[student] + "'s favorite food is " + food[student]);
			}
			else
			{
				System.out.println("That data does not exist. Please try again. (enter \"hometown\" or \"favorite food\"): ");
			}
			
//		}while(flag == true);
		
		
	}

}
