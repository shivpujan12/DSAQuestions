
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	
		for(int j=0;j<t;j++){
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
    		for(int i=0;i<n;i++){
    		    //create the array
    		    arr[i] = sc.nextInt();
    		}
    		
    		//Reversing the array
    		n = n-1;
            for(int i=0;i<=n/2 ;i++){
                int temp = arr[i];
                arr[i] = arr[n-i];
                arr[n-i] = temp;
           }
           
           //printing the array
           for(int i=0;i<arr.length;i++){
               System.out.print(arr[i] + " ");
           }
           System.out.println();
	    }

	}
}
