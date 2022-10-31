
//User function Template for Java

class Solution{
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        //Your code here
        
        //Aproach 1
        
        //Arrays.sort(arr);
        //return arr[k-1];
        
        //Approach 2
        
        //calculate max
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        
        //create a map
        int map[] = new int[max+1];
        for(int i=0; i<arr.length;i++){
            map[arr[i]] = 1;
        }
        
        //get the kth smallest
        int i=0;
        while(k!=0){
            if(map[i]==1){
                k--;
                i++;
            } else {
                i++;
            }
        }
    
        return i-1;
        
    } 
    } 
}
