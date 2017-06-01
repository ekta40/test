package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class TwoMissingNumberInSeqOfConsecutiveNUmber {

	public static void main(String[] args) {
		int []array={1,4,2};
		missingNumber(array,5);
		segregateEvenAndOddNumber();
		int [] toSortArray= {2,3,4,1,9,7,8};
		eventOddSort(toSortArray);
		findMissingAndRepeatingNumberFromConsecutiveArray();
		maxDiffernceBetweenTwoElementInArray();
		isArraySorted();
	}
	
	public static void missingNumber(int[]array ,int range){
		int a,b;
		int sum=0;
		int n=array.length;
		for(int i=0;i<array.length;i++){
			sum+=array[i];
		}
		int sumN=(range*(range+1))/2;
		int sumOfMissingNum= sumN-sum;
		int prodNum=1;
		for(int i=0;i<n;i++){
			prodNum*=array[i];
		}
		int prodN=1;
		for(int i=1;i<=range;i++){
			prodN*=i;
		}
		int prodOfMissingNum=prodN/prodNum;
		int diffSqrOfNumber = (int)Math.sqrt((sumOfMissingNum*sumOfMissingNum)-4*prodOfMissingNum);
		a=(sumOfMissingNum+diffSqrOfNumber)/2;
		b=sumOfMissingNum-a;
		System.out.println("first num----"+a+"--second number---"+b);
	}
	
	public static void segregateEvenAndOddNumber(){
		int [] array={2,3,4,1,9,7,8};
		List<Integer> evenList = new ArrayList<Integer>();
		List<Integer> oddList = new ArrayList<Integer>();
		for(int i:array){
			System.out.println(i&1);
			if((i&1)==0){  // or can use i%2==0
				evenList.add(i);
			}else{
				oddList.add(i);
			}
		}
		Collections.sort(evenList);
		Collections.sort(oddList);
		evenList.addAll(oddList);
		System.out.println("segregated even odd array list with sorting order maintained first asc even number then asc odd number--->"+evenList);
		
	}
	
	public static void eventOddSort(int[] arr) { //7,6,5,8,3,9,10,13
	    int i =0;
	    int j =arr.length-1;
	    while(i<j) {
	        if(isEven(arr[i]) && isOdd(arr[j])) {
	            i++;
	            j--;
	        } else if(!isEven(arr[i]) && !isOdd(arr[j])) {
	            swap(i,j,arr);
	        } else if(isEven(arr[i])){
	            i++;
	        } else{
	            j--;
	        }

	    }   
	    List<Integer> list = new ArrayList<Integer>();
	   for(Integer value:arr){
		   list.add(value);
	   }
	   
	    display(arr);
	   
	    // even number sorting
	    Arrays.sort(arr,0,i);
	    Arrays.sort(arr, i, arr.length);
//	    insertionSort(arr,i,arr.length);
	    // odd number sorting
	    display(arr);

	}

	/**
	 * Instead of insertion sort, you can use merge or quick sort.
	 * @param arr
	 * @param firstIndex
	 * @param lastIndex
	 */
	public static void insertionSort(int[] arr, int firstIndex, int lastIndex){
	    for(int i=firstIndex+1;i<lastIndex;i++){
	        int key =arr[i];
	        int j=i-1;
	        while(j>=firstIndex  && key > arr[j]) {
	            arr[j+1] = arr[j];
	            arr[j] =key;
	            j=j-1;
	        }
	        System.out.println("\nAfter "+(i+1) +"  Iteration : ");
	        display(arr);
	    }
	}

	public static void display(int[] arr) {
	    System.out.println("\n");
	    for(int val:arr){
	        System.out.print(val +"  ");
	    }
	    System.out.println("\n");
	}

	private static void swap(int pos1, int pos2, int[] arr) {
	    int temp = arr[pos1];
	    arr[pos1]= arr[pos2];
	    arr[pos2]= temp;
	}

	public static boolean isOdd(int i) {
	    return (i & 1) != 0;
	}
	public static boolean isEven(int i) {
	    return (i & 1) == 0;
	}
	
	 public static void findMissingAndRepeatingNumberFromConsecutiveArray(){
		 int[] array ={1,2,5};   
		 int n=array.length;
		 int range=5;
		 /*
		  * This can be done in O(n) time and O(1) space.

			(The algorithm only works because the numbers are consecutive integers in a known range):

			In a single pass through the vector, compute the sum of all the numbers, and the sum of the squares of all the numbers.

			Subtract the sum of all the numbers from N(N-1)/2. Call this A.  if number starts from 0 then - instead of +

			Subtract the sum of the squares from N(N-1)(2N-1)/6. Divide this by A. Call the result B.

			The number which was removed is (B + A)/2 and the number it was replaced with is (B - A)/2.
		  */
		 int sum=0;
		 int sumOfSquare=0;
		 for(int i=0;i<n;i++){
			 sum+=array[i];
			 sumOfSquare+=(array[i]*array[i]);
		 }
		 int sumN=(range*(range+1))/2;
		 int sumOfSquareN= (range*(range+1)*(2*range+1))/6;
		 int diffOfNum=sumN-sum;
		 int diffOFSquraNUm= sumOfSquareN-sumOfSquare;
		 int num=diffOFSquraNUm/diffOfNum;
		  int removedNum= (num+diffOfNum)/2;
		  int repeatedNUm= (num-diffOfNum)/2;
		  System.out.println(" removed number---"+removedNum +"---repeated element--"+repeatedNUm);
		 
		  
	 }
	 
	 
	 public static void maxDiffernceBetweenTwoElementInArray(){
		 int []array ={10,7,8,1,11,5};
		 int minElement= array[0];
		 int maxDiff=array[1]-array[0];
		 
		 for(int i=1;i<array.length;i++){
			 if(array[i]-minElement>maxDiff)
				 maxDiff=array[i]-minElement;
			 if(array[i]<minElement)
				 minElement=array[i];
		 }
		 System.out.println("max differnce is--------"+maxDiff);
	 }
	 
	 public static void isArraySorted(){
		 int []arr={2,4,-6,89,97};
		 boolean arraySorted=false;
		
		 for(int i=0;i<arr.length-1;i++){
			 if(arr[i]<arr[i+1])
				 arraySorted=true;
			 else if(arr[i]>arr[i+1])
				 arraySorted=false;
		 }
		 System.out.println("array is sorted or not---"+arraySorted);
	 }
	 

}
