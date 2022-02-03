public class Main {
    public static void main(String[] args) {

        int ticketPrice = 18;
        int bonusAmount = 20;

        int miles = ticketPrice / bonusAmount;

        System.out.println("Начисленно бонусных миль: " + miles);
    }
}