class Car
{
    void CarModel(){
        System.out.println("car: supra");    
    }
}
class Price extends Car
{
    void Price(){
        System.out.println("price: 2000");
    }
}
class Reveal extends Price
{
    void displayReveal()
    {
        System.out.println("this was toy car");
    }
    public static void main(String args[])
    {
            Reveal no = new Reveal();
            no.CarModel();
            no.Price();
            no.displayReveal();
    }
}