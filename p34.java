public class p34 {
    private String name;
    private int rno;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getRno(){
        return rno;
    }
    public void setRno(int rno){
        this.rno=rno;
    }
    public static void main(String args[]){
    p34 p= new p34();
    p.setName("Akash");
    p.setRno(20);
    System.out.println("Value is "+p.getName());
    System.out.println("Value is "+p.getRno());
}
}
 

