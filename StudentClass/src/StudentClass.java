
public class StudentClass {
	public String name;
	public int age;
	public float engScore;
	public float mathScore;
	public float average;
		
	StudentClass(String n, int a, float engS, float mathS){
		name = n;
		age = a;
		engScore = engS;
		mathScore = mathS;
		average = (engS + mathS)/2;
	}
	
	   public void bubbleSort(int arr[]){
	        int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    // swap arr[j+1] and arr[j]
	                    int temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
	    		}
	}
