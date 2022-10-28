public class GetPeakIndex   
{    
public static int findPeakIndex(int[] array)   
{  
int low = 0;  
int high = array.length - 1;  
int mid;  
while (low<high)   
{  
mid = low + (high - low) / 2;   
if (array[mid] >= array[mid + 1])   
{       
high = mid;  
}   
 
else   
{  
low = mid + 1;  
}  
}  
return low;  
}  
//driver code  
public static void main(String args[])   
{  
int mountainArray[] = {4, 2, 7, 9, 8, 3, 1};  
  
int peakindex = findPeakIndex(mountainArray);  

System.out.println("The peak index of the mountain array is: " + peakindex);  
}  
}  
