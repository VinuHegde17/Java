public class p26{
    int x;
    String y;
    public void display(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String args[]){
        p26 p = new p26();
        p.x=5;
        p.y="Welcome";
        p.display();
    }
}