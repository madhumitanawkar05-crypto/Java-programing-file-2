class ClassMembers {

    static int i; // static variable declaration
    int p;  // non-static varible
    i=5;   // assinging value into variable 
    p=10; // assinging value into variable
    public static void main(String[] args) {
        System.out.println("Programs Start...");
        System.out.println("value of i=" + ClassMembers.i);
        ClassMembers ref= new ClassMembers(); //creating object as a class
        System.out.println("Value of p=" + ref.p); 
    }
}