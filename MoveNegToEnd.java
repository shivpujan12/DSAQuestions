
//User function Template for Java
//https://practice.geeksforgeeks.org/problems/move-all-negative-elements-to-end1813/1
//solved for the above link similar question in geeks for geeks practice

class Solution {
    
    public void segregateElements(int arr[], int n)
    {
        // Your code goes here
    
        //find the count of positive nos
        int posCount = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posCount++;
            }
        }
        
        int i = 0;//index for postive
        int j = posCount;//index for negative no
        int newArr[] = new int[n];
        for(int k=0;k<n;k++){
            if(arr[k]<0){
                newArr[j++] = arr[k];
            } else {
                newArr[i++] = arr[k];
            }
        }
        
        //copy the new arry to arry
        for(int k=0; k<newArr.length;k++){
            arr[k] = newArr[k];
        }
    }
}
