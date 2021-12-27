//uNSOLVED QUESTION 
import java.io.*;
public class Conact_array {
    int nums={1,2,1};
    int ans[]=new int[2*nums.length];
    int j=0;
    for(int i=0;i<2*nums.length;i++)
    {
        if(i>nums.length)
        {
            j=0;
        }
        ans[i]=nums[j];
        j++;        
    }
    for(int i=0;i<ans.length;i++)
    {
        System.out.println(ans[i]);
    }
    
}
