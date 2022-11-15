public class Main {
    public static void main(String[] args) {
        int amountNow = 100;
        int addAmount = 1100;
        int bonusAdd = 100;
        int bonus = 0;

        if (addAmount > 1000) {
            bonus = addAmount / bonusAdd;
        }

        System.out.println(amountNow + addAmount + bonus);
    }
}