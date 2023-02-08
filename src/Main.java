public class Main {
    public static void main(String[] args) {
        int account = 323;
        int income = 1400;
        int coefficient = 100;
        boolean threshold = income > 1000;
        int bonus = threshold ? income / coefficient : 0;
        System.out.println("Сумма на счете " + (account + income) + " Бонусных рублей " + bonus);
    }
}