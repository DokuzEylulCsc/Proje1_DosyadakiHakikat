import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException; 
public class fileExample 
{
	Scanner fileInput;
	public static void main(String[] args) 
	{
		File file;
		if(args.length==0)
		{
			do
			{
			Scanner input=new Scanner(System.in);
			System.out.println("Please give file name for sorting:");
			String fileName = input.nextLine(); 
			file=new File(fileName);
			}while(!file.isFile());
		}
		else
		{
			System.out.printf("File name:%s\n",args[0]);
			file=new File(args[0]);
		}
		fileApp app=new fileApp(file);		
	}	
}
