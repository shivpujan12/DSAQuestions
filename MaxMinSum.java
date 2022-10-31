
//User function Template for Java

class Solution
{ 
    public static int findSum(int a[],int n) 
    {
        //code here
        int min = a[0];
        int max = a[0];
        for(int i=1; i<a.length;i++){
            if(min>a[i]) min = a[i];
            else if(max<a[i]) max = a[i];
        }
        
        return max+min;
           
    }
}
