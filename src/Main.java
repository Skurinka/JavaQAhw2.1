public class Main {

    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной милли

        // Рассчитываете количество бонусных милль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
            int price = 12000;

            int mile = 20;

            int bonusMiles = price / mile;

                System.out.println ("Бонусные мили: " + bonusMiles);

    }
}