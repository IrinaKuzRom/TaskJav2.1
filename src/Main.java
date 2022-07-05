public class Main {
    public static void main(String[] args) {

        int bonusPerMile = 20;   // количество рублей для одной бонусной милли
        int ticketPrice = 2345;  // стоимость билета
        int bonus;
        bonus = ticketPrice / bonusPerMile; // Рассчёт количества бонусных милль
        System.out.println("За купленный билет вам начислено: " + bonus + " бесплатные мили за перелёты");
    }
}

