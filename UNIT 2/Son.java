class Father
{
    void house()
    {
        System.out.println("Father House");
    }
}
class Son extends Father
{
    void bike()
    {
        System.out.println("It's my bike");
    }
    public static void main(String args[])
    {
        Son ob=new Son();
        ob.bike();
        ob.house();
    }
}