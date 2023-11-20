public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуй, ДОРОГОЙ КЛИЕНТ НАШЕЙ МОБИЛЬНОЙ КОМПАНИИ!");
        int initial = 100;
        int replenishment = 1499;
        int bonus;

        if (replenishment >= 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }

        System.out.println("Сумма на Вашем счете:" + (initial + replenishment) + "рублей");
        System.out.println("Ваш бонус:" + bonus + "рублей");
        System.out.println("Сумма на Вашем счете с учетом бонуса:" + (initial + replenishment + bonus) + "рублей");
        System.out.println("Спасибо что Вы с нами!");
    }
}