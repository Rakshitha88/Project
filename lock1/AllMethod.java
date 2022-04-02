
package lock1;
   
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AllMethod {
	private File file,file2;
	private String foldername,filename,newpath;
	private static String path="C:\\Users\\Admin\\Lockers";

	Scanner sc=new Scanner(System.in);
	public void addFiles11()
	{
	
		System.out.println("Enter name");
		foldername=sc.nextLine();
		System.out.println("Enter filename");
	    filename=sc.nextLine();
		newpath=path+foldername;
		File file=new File(newpath);
		boolean b=file.mkdir();
		File file2=new File(newpath+"\\"+filename);
		if(b)
		{
			try {
				file2.createNewFile();
				System.out.println("File created Successfully in  "+foldername+ " directory");
			} 
			catch (IOException e) {
				System.out.println("file is not created");
			}
			
		}
		else {
			System.out.println("folder not created or it is  exist");
			try {
				file2.createNewFile();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
	public void deleteFiles11()
	{
		System.out.println("Enter  name");
		 foldername=sc.nextLine();
	     newpath=path+foldername;
		 file=new File(newpath);
		if(file.isDirectory())
		{
			System.out.println("Enter File name");
			filename=sc.nextLine();
		     file2=new File(newpath+"\\"+filename);
			
			if(file2.delete())
			{
				System.out.println("File deleted Successfully");
			}
			else {
				System.out.println("File not Found");
			}
		}
		else {
				System.out.println("No such directory found");
			}
		
		
		|\

	}
	public void searchFiles11()
	{
		System.out.println("Enter  name:");
		foldername=sc.nextLine();
		System.out.println("Enter file name ");
		filename=sc.nextLine();
		file=new File(path+foldername+"\\"+filename);
		if(file.exists())
		{
			System.out.println("File is present in directory: "+foldername);
		}
		else {
			System.out.println("file is not found in "+foldername+" directory");
		}
		}
	public void getAllFiles1()
	{
		file=new File(path);
		ArrayList<String> arraylist = new ArrayList<String>();
		for(File file2 : file.listFiles())
		{
			String fileNames = file2+"";
			String[] ss = fileNames.split(filename);
			arraylist.add(ss[ss.length-1]);
		}
		Collections.sort(arraylist);
		for(int i = 0; i< arraylist.size();
				i++) {
			System.out.println(arraylist.get(i));
		}
		
	}
			
		


				
	
	



	public void addFiles1() {
		// TODO Auto-generated method stub
		
	}



	public void deleteFiles1() {
		// TODO Auto-generated method stub
		
	}



	public void searchFiles1() {
		// TODO Auto-generated method stub
		
	}

}
