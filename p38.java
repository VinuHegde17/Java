public class p38 {
private int a;
private int b;
private int c;

public int geta(){
    return a;
}
public void seta(int a){
    this.a=a;
}
 public int getb(){
    return b;
}
public void setb(int b){
    this.b=b;
}
public int getc(){
    return c;
}
public void setc(int c){
    this.c=c;
}   
public static void main(String args[]){
    p38 p=new p38();
    p.seta(5);
    p.setb(10);
    p.setc(15);
    System.out.println("Value is "+p.geta());
    System.out.println("Value is "+p.getb());
    System.out.println("Value is "+p.getc());


}
}
