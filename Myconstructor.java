class Myconstructor {
    int Books;
    String Title;

    Myconstructor() {
        Books= 15;
        Title= "MY constructors";    }

    public static void main(String[] args) {
        Myconstructor myObj = new Myconstructor();
        System.out.println(myObj.Books);
        System.out.println(myObj.Title);
    }
}