class armstrong{
    public static void main(String arg[]){
        int x=4,len;
        len=order(x);
        if(x == armstro(x,len)) System.out.println("this is armstrong");
        else
            System.out.println("not a armstrong");
    }

    static int order(int a){
        int len=0;
        while(a!=0){
            len++;
            a=a/10;
        }
        return len;
    }
    static int  armstro(int num,int le){
        if(num==0) return 0;
        int digit =num%10;
        return (int) Math.pow(digit,le)+armstro(num/10,le);

    }
}
