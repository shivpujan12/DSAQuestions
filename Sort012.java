
class Solution
{
    public static void sort012(int a[], int n)
    {
        // code here 
        //calculate the count of 0,1,2
        int[] map = new int[3];
        for(int i=0; i<a.length;i++){
            map[a[i]] = map[a[i]]+1;
        }
        
        //insert 0;
        int i=0;
        while(map[0]--!=0){
            a[i++] = 0;
        }
        
        //insert 1;
        while(map[1]--!=0){
            a[i++] = 1;
        }
        
        //insert 2;
        while(map[2]--!=0){
            a[i++] = 2;
        }
        
    }
}
