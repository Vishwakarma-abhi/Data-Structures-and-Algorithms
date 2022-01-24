class min_coinss
{
    int arr[]={1,2,3};
    public static void main(String[] args) {
       min_coinss OBJ=new min_coinss();
       OBJ.f() 
    
    }

    int f(i,amt)
    {
        if(amt == 0)return 1;
        if(amt < 0)return 0;
        if(i < 0)return 0;

        return f(i-1,amt) + f(i,amt-arr[i]); //leave and take transition 
    }
}