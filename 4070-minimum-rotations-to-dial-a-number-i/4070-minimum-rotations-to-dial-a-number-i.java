class Solution {
    public int minRotations(String s) 
    {
        int sum=0; 
        for(int i=1;i<s.length();i++)
        {
                int ch=s.charAt(i)-'0';
                int ch1=s.charAt(i-1)-'0';
                 int n=Math.max(ch,ch1);
                 int n1=Math.min(ch,ch1);
                 int min1=n-n1;
                  
              int t=0;
                  while(n!=n1)
                  {
                      t++;
                       n++;
                       if(n==10)
                       {
                           n=0; 
                       } 
                  }
            int min=Math.min(t,min1); 
                sum +=min;   
             
        }
        int f=s.charAt(0)-'0';
        return sum+Math.min(f,10-f);
    }
}