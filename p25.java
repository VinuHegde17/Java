public class p25 {
    public static void main(String args[]){
        p25 p =new p25();
        p.finalize();
        p=null;
        System.gc();
        System.out.println("Inside the main");
    }
    protected void finalize(){
        System.out.println("Object wil be destoryed");
    }
}
