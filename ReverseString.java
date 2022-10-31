
//User function Template for Java


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
