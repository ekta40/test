package demo;

import java.util.HashMap;
import java.util.Map;

public class Demo {
//	 static final int[] arr;
//	static{
//		 arr = new int[]{1,2};
//	}
//	public static void main(String[] args) {
//      System.out.println(arr.length);
//	
//	}
	// This method would throw a NullPointerExceptiuon is the second
	   // parameter was null
	   public static String createMessage(String initMessage, String[] params) 
	   {
	      for ( int i = 0; i < params.length; i++ )
	      {
	         int index = initMessage.indexOf("{" + i + "}");
	         System.out.println(index+"----index---");
	         while ( index != -1 )
	         {
	            initMessage = (new StringBuffer(initMessage)).replace(index, index+3, params[i]).toString();
	            System.out.println(initMessage+"-----message--");
	            index = initMessage.indexOf("{" + i + "}");
	            System.out.println("-----------index--------->"+index);
	         }
	      }
	      return initMessage;
	   }
	  
	   public static void main(String[] args) throws Exception
	   {
	      String[] paramList1 = new String[1];
	      paramList1[0] = "World";
	      String[] paramList2 = new String[0];
	      System.out.println(createMessage("Hello {0}!", paramList1));
	      System.out.println(createMessage("Hello World!", paramList2));
	      int[]array={-6,1,2,9,4};
	      checkForSum(array,5,11);
	      printSumPairsWithOnComplexity(array, 11);
	      
	      final int arr1[]={1,2,3,4,5};
	      int arr2[]={10,20,30,40,50};
	      arr2= arr1;
	      //arr1=arr2;  can not change final variable value.
	   }
	   
	  static  int checkForSum (int arr[], int len, int sum) { //arr is sorted


	        int i;
	        for (i = 0; i < len ; i++) {
	                int left = i + 1;
	                int right = len - 1;

	                while (right > left) {
	                        if (arr[right] + arr[left] + arr[i] - sum == 0) {
	                        	 System.out.println ("final values"+ arr[i]+"left---"+arr[left]+"right--"+ arr[right]);
	                                return 1;
	                        }
	                        if (arr[right] + arr[left] + arr[i] - sum > 0)
	                                right--;
	                        else
	                                left++;

	                }

	        }
	        return -1;
	}
	  
	  static void printSumPairsWithOnComplexity(int []input, int k){
		  Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();

		    for(int i=0;i<input.length;i++){

		        if(pairs.containsKey(input[i]))
		            System.out.println(input[i] +", "+ pairs.get(input[i]));
		        else
		            pairs.put(k-input[i], input[i]);
		    }
	  }
}



   
