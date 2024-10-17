class leapyear
{
    public static void main(String ard[]){
        int num=2000;
        if (num %400==0) System.out.println("leap year");
        else if(num%4==0){
            if(num%100!=0){
                System.out.println("leap year");}}
        else{
            System.out.println("not a leap yera");}
    }
}
