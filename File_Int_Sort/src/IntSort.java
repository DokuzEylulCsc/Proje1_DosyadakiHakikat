
public class IntSort 
{
	Integer[] sortedArray;
	IntSort()
	{
		
	}
	IntSort(Integer[] a) //S�ralama i�lemini direk yapan ve bir s�n�f i�indeki bir diziye atan constructor 
	{
		sortedArray=sort(a);
	}
	public Integer[] sort(Integer[] a) //D��ardan �a��ralabilen sort metotu
	{
		Integer[] sA=new Integer[a.length];
		sA=a.clone();
		quickSort(0,sA.length-1,sA);	
		return sA;
	}
	private void quickSort(int lowerIndex, int higherIndex, Integer[] array) //QuickSort
	{    
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        while (i <= j) 
        {
            while (array[i] < pivot) 
            {
                i++;
            }
            while (array[j] > pivot) 
            {
                j--;
            }
            if (i <= j) 
            {
                swap(i, j,array);
              
                i++;
                j--;
            }
        }
        if (lowerIndex < j)
            quickSort(lowerIndex, j,array);
        if (i < higherIndex)
            quickSort(i, higherIndex,array);
    }
    private void swap(int i, int j,Integer[] array) //Dizinin belirtilen iki eleman�n yer de�i�tirilmesi fonksiyonu
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
