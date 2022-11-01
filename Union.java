
//User function Template for Java

class Solution{
    public static int doUnion(int a[], int n, int b[], int m) 
    {
        //Your code here
        // Set<Integer> mp = new HashSet();
        // for(int i=0;i<n;i++){
        //     mp.add(a[i]);
        // }
        // for(int i=0;i<m;i++){
        //     mp.add(b[i]);
        // }
        // return mp.size();
        
        //Approach 2
        //find max()
        int max = -1,count=0;
        for(int i=0;i<m;i++){
            if(max<b[i]){
                max = b[i];
            }
        }
        for(int i=0;i<n;i++){
            if(max<a[i]){
                max = a[i];
            }
        }
        
        int map[] = new int[max+1];
        for(int i=0;i<n;i++){
            if(map[a[i]]==0){
                map[a[i]] = 1;
                count++;
            }
        }
        for(int i=0;i<m;i++){
            if(map[b[i]]==0){
                map[b[i]] = 1;
                count++;
            }
        }
        
        return count;
    }
    
}
