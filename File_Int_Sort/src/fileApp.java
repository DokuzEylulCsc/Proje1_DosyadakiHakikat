import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fileApp 
{
	private Scanner fileInput;	
	Integer[] intArray;
	fileApp(File file)
	{
		openFile(file);
		readFile();
		IntSort intSort=new IntSort(intArray);
		for (Integer integer : intSort.sortedArray) 
		{
		
			System.out.printf("%d\n", integer);
		}
		
	}
	public  void openFile(File file) //Dosya açma
	{
		try
		{
			fileInput=new Scanner(file);			
		}
		catch(FileNotFoundException e) //Dosya bulunamadý.
		{
			System.out.println("No such file!");
			System.exit(-1);
		}
	}
	public void readFile() //Dosya okuma
	{
		try
		{
			ArrayList<Integer> intArrayList=new ArrayList<Integer>();	
			while(fileInput.hasNext())
			{
				try
				{
					intArrayList.add(fileInput.nextInt());
				}
				catch(InputMismatchException e) //Belirtilen tip dýþýnda deðer geldi.
				{
					fileInput.next();
				}
			}
			
			intArray=new Integer[intArrayList.size()]; //Arraylist uzunluðunda array açýldý.
			intArrayList.toArray(intArray); //Arraylist array'a geçirildi.
			
		}
		catch(IllegalStateException e)
		{
			System.out.println("Scanner is closed");
			System.exit(-1);
		}
		finally
		{
			if(fileInput!=null)
				fileInput.close(); //Scanner objesi kapatýldý.
			
		}
	}
	
}

	


