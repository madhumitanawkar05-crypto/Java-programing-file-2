class  ParameterisedConstructor
{
    int id;
    String name;

    ParameterisedConstructor(int i, String n)
    {
        id = i;
        name = n;
    }

    void display()
    {
        System.out.println(id + " " + name);
    }

    public static void main(String args[])
    {
        ParameterisedConstructor obj = new ParameterisedConstructor(310, "Ram");
        obj.display();
    }
}