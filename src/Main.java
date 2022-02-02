public class Main {
    public static void main(String[] args) {

        int ticket_price = 18;
        int bonus_amount = 20;

        int miles = ticket_price / bonus_amount;

        System.out.println("Начисленно бонусных миль: " + miles);
    }
}