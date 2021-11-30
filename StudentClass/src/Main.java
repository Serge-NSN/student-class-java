
import java.util.*;
import java.util.Arrays;
public class Main {
	
	//Bubble sort function
	public static Float[] bubbleSort(Float arr[]) {
		 int n = arr.length;
	        for (int i = 0; i < n-1; i++)
	            for (int j = 0; j < n-i-1; j++)
	                if (arr[j] > arr[j+1])
	                {
	                    Float temp = arr[j];
	                    arr[j] = arr[j+1];
	                    arr[j+1] = temp;
	                }
			return arr; 
	}
	
	//main method
	public static void main(String[] args) {
	
		//new array to store students as objects
		StudentClass[] student = new StudentClass[10];
		
		//initializing 10 students' name, age, Mathematics score and English score 
		student[0] = new StudentClass("Serge", 12, 10, 11);
		student[1] = new StudentClass("Peter", 19, 10, 12);
		student[2] = new StudentClass("John", 16, 20, 19);
		student[3] = new StudentClass("Mary", 18, 12, 9);
		student[4] = new StudentClass("Chelsea", 19, 18, 15);
		student[5] = new StudentClass("Tantoh", 20, 17.5f, 14);
		student[6] = new StudentClass("Njong", 12, 18, 17.5f);
		student[7] = new StudentClass("Faithful", 12, 11, 12);
		student[8] = new StudentClass("Barca", 19, 8.5f, 12.5f);
		student[9] = new StudentClass("Favour", 19, 13, 16);
		
		// An ArrayList to store just the averages of the students for ranking
		ArrayList<Float> averages = new ArrayList<>();
 		
		for(int i=0; i< student.length; i++) {
			averages.add(student[i].average);
		}
		System.out.println(averages);
		
		// converting ArrayList of averages to array of averages
		Float[] arrOfAverages= new Float[averages.size()];
		averages.toArray(arrOfAverages);

		Float[] sortedArray = bubbleSort(arrOfAverages);
		//printArray(bubbleSort(arrOfAverages));
		System.out.println(Arrays.toString(sortedArray));
		System.out.println(sortedArray[0]);
		
		List<Float> sortedList = Arrays.asList(sortedArray);
		for(float average: sortedArray) {
			int pos = Collections.binarySearch(sortedList, average);
			System.out.println("Position " + " " + (pos) + "-------" + average);
		}
	
	}


}
		   
		
