class Opretores
{
    public static void main(String args[])
    {
        int no1 = Integer.parseInt(args[0]);
        int no2 = Integer.parseInt(args[1]);

        int sum = no1 + no2;
        int sub = no1 - no2;
        float div = no1 / no2;
        float multi = no1 * no2;

        System.out.println("no1 is:" + no1);
        System.out.println("no2 is:" + no2);
        System.out.println("----------------------------");
        System.out.println("sum of no1 and no2 is :" + sum);
        System.out.println("sub of no1 and no2 is :" + sub);
        System.out.println("div of no1 and no2 is :" + div);
        System.out.println("multi of no1 and no2 is:" + multi);
    }
}