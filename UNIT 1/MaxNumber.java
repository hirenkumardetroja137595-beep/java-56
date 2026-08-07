class MaxNumber
{
    public static void main(String args[])
    {
        int no1 = Integer.parseInt(args[0]);
        int no2 = Integer.parseInt(args[1]);
        int no3 = Integer.parseInt(args[2]);

        if(no1 >= no2){
            if(no2 >= no3){
                System.out.println("number 1 is big");
            }
        }
        else if(no2 >= no1){
            if(no2 >= no3){
                System.out.println("number 2 is big");
            }
        }
        else{
            System.out.println("number 3 is big");
        }
    }
}