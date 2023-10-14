public class p33 {
    public void strop() {
        String s0 = "Car,Bus,Bike";
        String s1 = "   ABCDE";
        String s2 = "vwxyz";  
        String s3 = s1.concat(s2);
        String s4 = s1.substring(4);
        int s5 = s2.length();
        boolean s6 = s1.equals(s2);
        String s7 = s2.toUpperCase();
        String s8 = s1.toLowerCase();
        String s9 = s1.trim();
        String s10 = s0.replace("Bike", "Train");
        System.out.println("Concationation of 2 Strings are " + s3);
        System.out.println("Substring of a String " + s4);
        System.out.println("Length of a String " + s5);
        System.out.println("Comparing of 2 Strings " + s6);
        System.out.println("Result is " + s7);
        System.out.println("Result is " + s8);
        System.out.println("Result is " + s9);
        System.out.println("Result is " + s10);
    }

    public static void main(String args[]) {
        p33 p = new p33();
        p.strop();
    }
}
