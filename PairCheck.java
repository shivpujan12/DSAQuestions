//Print index of those 2 numbers whose sum is equal to the given input number.

import java.util.*;
class Main
{
    boolean pairCheck(int a[]){
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	    int x = 18;
	    
	    for (int i=0 ; i<a.length ; i++) {
	        if(map.containsKey(a[i])) {
	            System.out.println(map.get(a[i]) + " " + i);
	            return true;
	        }
	        map.put(x - a[i], i);
	    }
	    
	    return false;
    }
    
	public static void main(String[] args) throws Exception{
	    int a[] = {7,9,11,13,15,17,21,27,29};
        int b[] = {11,9,7,5,3,1,-3,-9,-11};
        
        Main m  = new Main();
        System.out.println(m.pairCheck(a));
        System.out.println(m.pairCheck(b));
	}
}