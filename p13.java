class p13{  
void read(){
    System.out.println("Reading...");
}  
}  
class p131 extends p13{  
void listen(){
    System.out.println("Listening...");
}  
}  
class p132 extends p13{  
void watch(){
    System.out.println("Watching...");
}
public static void main(String args[]){  
p132 c=new p132(); 
p131 cc= new p131(); 
c.read();  
c.watch();  
cc.listen();
}  
}  
