
public class FloatSort 
{
	Float[] sortedArray;
	FloatSort()
	{
		
	}
	FloatSort(Float[] a)//S�ralama i�lemini direk yapan ve bir s�n�f i�indeki bir diziye atan constructor 
	{
		sortedArray=sort(a);
	}
	public Float[] sort(Float[] a) //D��ardan �a��ralabilen sort metotu
	{
		Float[] sA=new Float[a.length];
		sA=a.clone();
		quickSort(0,sA.length-1,sA);	
		return sA;
	}
	private void quickSort(int lowerIndex, int higherIndex, Float[] array) //QuickSort
	{    
        int i = lowerIndex;
        int j = higherIndex;
        float pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
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
    private void swap(int i, int j,Float[] array) //Dizinin belirtilen iki eleman�n yer de�i�tirilmesi fonksiyonu
    {
        float temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
