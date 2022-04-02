package lock1;

import java.util.Scanner;

public class MainMenu {
	private int fi;
	
	
	public void displayMenu()
	{
		Scanner sc=new Scanner(System.in);
		do
		{
		System.out.print("\n\nEnter your Choice ");
		System.out.print("\n \n1.list the no. of Files"+"\n"+"2.User Interface"+"\n"+"3.Close");
		fi=Integer.parseInt(sc.nextLine());
		AllMethod allM=new AllMethod();

		switch(fi)
		{
			case 1: allM.getAllFiles1();
			break;
			case 2:int fi1;
			do
				{		
					System.out.println("welcome");
					System.out.println("Choose From following option "+"\n"+"1.Add File11"+"\n"+"2.Delete File11"+"\n"+"3.Search File11"+"\n"+"4.Back");
					
					//obj=new Scanner(System.in);
					fi1=Integer.parseInt(sc.nextLine());
					switch(fi1)
					{
					case 1:allM.addFiles11();
					break;
					case 2:allM.deleteFiles11();
					break;
					case 3:allM.searchFiles11();
					break;
					case 4: displayMenu();
					break;
					default: System.out.println("Enter Correct Choice:");
					}
				}while(fi1>0);
			break;
			case 3:System.exit(0);
			break;
			default:System.out.println("Enter Correct Choice");
		}		
		}while(fi>=0);
		sc.close();

}
}

