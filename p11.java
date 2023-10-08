class p11{
    int a=10;
    int b=25;
    int c=a+b;
}

class pp11 extends p11{
    public static void main(String args[]){
        pp11 obj=new pp11();
        System.out.println("Value of b= "+obj.c);
    }
}