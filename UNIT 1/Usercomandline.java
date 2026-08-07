class Usercomandline
{
    public static void main(String hiren[])
    {
        int no1 = Integer.parseInt(hiren[0]);
        int no2 = Integer.parseInt(hiren[1]);

        if(no1 >= no2){
            System.out.println("the big number is :" + no1);
        }
        else{
            System.out.println("the big number is :" + no2);
        }        
    }
}