import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        House[] houses = new House[4];
                houses[0] = new House("Бекешская, 6", 3, 2, 40.00);
                houses[1] = new House("Пушкина, 173", 5, 3, 70.00);
                houses[2] = new House("Пр-т Победы, 111", 11, 4, 120.00);
                houses[3] = new House("Красноармейская, 15", 2, 2, 50.0);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество комнат: ");
        int n = in.nextInt();
        System.out.println("Введите этаж: ");
        int z = in.nextInt();
        System.out.println("Введите площадь: ");
        double y = in.nextDouble();

        System.out.println("Квартиры с заданным количеством комнат: ");
        for (House house : houses){
            if (house.numofrooms == n){
                System.out.println(house.Address);
            }
        }
        System.out.println("Квартиры на " + z + " этаже и с заданным количеством комнат: ");
        for (House house : houses){
            if (house.numofrooms == n && house.Floor == z){
                System.out.println(house.Address);
            }
        }
        System.out.println("Квартиры на " + z + " этаже, с заданным количеством комнат и требуемой площадью: ");
        for (House house : houses){
            if (house.numofrooms == n && house.Floor == z && house.square == y){
                System.out.println(house.Address);
            }
        }

}
static class House{
    public String Address;
    public int Floor;
    public int numofrooms;
    public double square;
    public  House(String Address, int Floor, int numofrooms, double square){
        this.Address = Address;
        this.Floor = Floor;
        this.numofrooms = numofrooms;
        this.square = square;
        }
    }
}

