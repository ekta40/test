package demo;

public class MaxThreeProduct {
	public static void main(String[] args) {
		int [] arr={10,3,2,8,1};
		System.out.println(maxThreeProduct(arr));
	}
    
	public static int maxThreeProduct(int[] arr){
		int maxOne=Integer.MIN_VALUE;
		int maxTwo=Integer.MIN_VALUE;
		int maxThree= Integer.MIN_VALUE;
		int minOne=Integer.MAX_VALUE;
		int minTwo=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=maxOne){
				maxThree=maxTwo;
				maxTwo=maxOne;
				maxOne=arr[i];
			}else if(arr[i]>=maxTwo){
				maxThree=maxTwo;
				maxTwo=arr[i];
			}
			else if(arr[i]>=maxThree){
				maxThree=arr[i];
			}
			if(arr[i]<=minOne){
				minTwo=minOne;
				minOne=arr[i];
			}else if(arr[i]<=minTwo){
				minTwo=arr[i];
			}
		}
		System.out.println("maxOne--"+maxOne+"<---->Maxtwo---->"+maxTwo+"Max<-->"+maxThree+"minOne---"+minOne+"minTwo----->"+minTwo);
		System.out.println(maxOne*maxTwo*maxThree);
		return Math.max(maxOne*maxTwo*maxThree, maxOne*minOne*minTwo);
	}
}
