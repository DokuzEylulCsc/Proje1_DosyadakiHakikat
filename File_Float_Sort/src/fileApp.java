import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class fileApp 
{
	private Scanner fileInput;	
	Float[] Array;
	fileApp(File file)
	{
		openFile(file);
		readFile();
		FloatSort Sorted=new FloatSort(Array);
		for (Float f : Sorted.sortedArray) 
		{
		
			System.out.printf("%f\n", f);
		}
		
	}
	public  void openFile(File file) //Dosya a�ma
	{
		try
		{
			fileInput=new Scanner(file);			
		}
		catch(FileNotFoundException e) //Dosya bulunamad�.
		{
			System.out.println("No such file!");
			System.exit(-1);
		}
	}
	public void readFile() //Dosya okuma
	{
		try
		{
			ArrayList<Float> ArrayList=new ArrayList<Float>();	
			while(fileInput.hasNext())
			{
				try
				{
					ArrayList.add(fileInput.nextFloat());
				}
				catch(InputMismatchException e) //Belirtilen tip d���nda de�er geldi.
				{ 
					fileInput.next();
				}
			}
			
			Array=new Float[ArrayList.size()];//Arraylist uzunlu�unda array a��ld�.
			ArrayList.toArray(Array);//Arraylist array'a ge�irildi.
			
		}
		catch(IllegalStateException e)
		{
			System.out.println("Scanner is closed");
			System.exit(-1);
		}
		finally
		{
			if(fileInput!=null) //Scanner objesi kapat�ld�.
				fileInput.close();
		}
	}
	
}

	


