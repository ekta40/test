package demo;

import java.util.Arrays;
import java.util.Comparator;

public class largestNumber {
	public static void main(String[] args) {
		int [] num= {134,21,389,43};   
		String largeNumber=largestNumber(num);
		System.out.println("largest number is---"+largeNumber);
		method2();
		reArrangeArray();
		
	}
	public static String largestNumber(int[] nums) {
	    String[] strs = new String[nums.length];
	    for(int i=0; i<nums.length; i++){
	        strs[i] = String.valueOf(nums[i]);
	       
	    }
	    Arrays.sort(strs, new Comparator<String>(){
	        public int compare(String s1, String s2){
	        	System.out.println("s1--"+s1+"---s2--"+s2);
	        	return -s1.compareTo(s2);
//	            String leftRight = s1+s2;
//	            String rightLeft = s2+s1;
//	            System.out.println("leftright---"+leftRight+"---rightleft---"+rightLeft);
//	            System.out.println("compare value"+leftRight.compareTo(rightLeft));
//	            return -leftRight.compareTo(rightLeft);
	        }
	    });
	    System.out.println(strs.length);
	    StringBuilder sb = new StringBuilder();
	    for(String s: strs){
	        sb.append(s+",");
	    }
	 
	    while(sb.charAt(0)=='0' && sb.length()>1){
	    	System.out.println("66666666666");
	        sb.deleteCharAt(0);
	    }
	 
	    return sb.toString();
	}
	
	
	public static void method2(){
		String[] ar= new String[]{"267","256","997","45"};
	//	Arrays.sort(ar);
		Arrays.sort(ar, new Comparator<String>() {
			public int compare(String s1, String s2){
				return s1.compareTo(s2);
			}
		});
	
	StringBuilder sb = new StringBuilder();
    for(String s: ar){
        sb.append(s+",");
    }
    System.out.println(sb+"string");

	}
	
	public static void reArrangeArray(){
		int [] arr={4,0,2,1,3};
		int [] arr2= new int[5];
		for(int i=0;i<arr.length;i++){
			int index=arr[i];
			arr2[i]=arr[index];
		}
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr2[i]);
		}
	}
}
