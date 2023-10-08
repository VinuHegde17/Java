class p12{
    void add(){
        System.out.println("Addition");
    }
}
class p121 extends p12{
    void sub(){
                System.out.println("Substraction");

    }
}
class p122 extends p121{
    void mul(){
        System.out.println("Multiplication");
    }
}
class last{
    public static void main(String args[]){
        p122 p =new p122();
        p.add();
        p.sub();
        p.mul();
    }
}