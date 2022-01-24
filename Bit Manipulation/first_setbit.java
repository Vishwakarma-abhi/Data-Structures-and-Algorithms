public class first_setbit {
    public static void main(String[] args) {
        int i=1;
        int n=18,count=0;
        while(n != 0)
        {
            if((n & 1) != 1)
            {
                i++;
                n=n >> (i-1);
                
            }
            else
            {
                count++;
                
            }
        }
        System.out.println(count);
        
    }
    
}
