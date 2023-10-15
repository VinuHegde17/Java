public class p36 {
    private int age;
    private String course;

    public int getage(){
    return age;
    }

    public void setage(int age){
       this.age=age; 
    }

    public String getcourse(){
        return course;
    }
    public void setcourse(String course){
       this.course=course;

    }
    public static void main(String args[]){
        p36 p=new p36();
        p.setage(23);
        p.setcourse("Masters");
        p.getage();
        p.getcourse();
        System.out.println("Age is "+p.getage());
        System.out.println("Course is "+p.getcourse());

    } 
}
