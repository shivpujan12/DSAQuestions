
//User function Template for Java

//Iteration

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        int n = str.length()-1;
        char c[] = str.toCharArray();
        for(int i=0; i<=n/2 ;i++ ){
            char temp = c[i];
            c[i] = c[n-i];
            c[n-i] = temp;
       }
       
       return String.valueOf(c);
        
    }
    
}


//Recursion

//User function Template for Java


class Reverse
{
    // Complete the function
    // str: input string
    public String reverseWord(String str)
    {
        char[] chars = str.toCharArray();
        reverse(chars,0,str.length()-1);
        return String.valueOf(chars);
    }

    private void reverse(char[] c,int i,int n) {
        if(i<=n/2){
            char temp = c[i];
            c[i] = c[n-i];
            c[n-i] = temp;
            reverse(c,i+1,n);
        }
    }
}
