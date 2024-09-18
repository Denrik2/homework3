public class Main {
    public static void main(String[] args) {
        //Задание №1
        int cat = 123123;
        byte dog = 123;
        short shark = 1231;
        long frog = 12312312;
        float box = 123.1231f;
        double one = 123.123123123123f;
        System.out.println("Задача №1");
        System.out.println("Значение переменной cat с типом int равно " + cat);
        System.out.println("Значение переменной dog с типом byte равно " + dog);
        System.out.println("Значение переменной shark с типом short равно " + shark);
        System.out.println("Значение переменной frog с типом long равно " + frog);
        System.out.println("Значение переменной box с типом float равно " + box);
        System.out.println("Значение переменной one с типом double равно " + one);

        //Задание №2
        float catDog = 27.12f;
        long dogCat = 987678965549L;
        String numberCat = "2,786";
        short numberDog = 569;
        short numberShark = -159;
        short dtps = 27897;
        byte dps = 67;

        //Задание №3
        byte students = 60;
        int paperStudents = 480 / students;
        System.out.println("Задача №3");
        System.out.println("На каждого ученика рассчитано " + paperStudents + " листов бумаги");

        //Задание №4
        short bottles = 8;
        System.out.println("Задача №4");
        System.out.println("За 20 минут машина произвела " + bottles * 20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottles * (24 * 60) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottles * (24 * 60 * 3) + " штук бутылок");
        System.out.println("За месяц машина произвела " + bottles * (24 * 60 * 30) + " штук бутылок");

        //Задание №5
        byte whitePaint = 2 * (120 / 6);
        byte brownPaint = 4 * (120 / 6);
        byte classes = 120 / 6;
        System.out.println("Задача №5");
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaint +
                " банок белой краски и " + brownPaint + " банок коричневой краски");

        //Задание №6
        System.out.println("Задача №6");
        short breakfast = 5 * 80 + 2 * 105 + 2 * 100 + 4 * 70;
        System.out.println("В граммах: " + breakfast);
        float breakfastT = breakfast;
        float breakfastKg = breakfastT / 1000;
        System.out.println("В килограммах: " + breakfastKg);
        
        //Задание №7
        float diet1 = 7 / 0.250f;
        float diet2 = 7 / 0.500f;
        float days = (diet1 + diet2) / 2;
        System.out.println("Задача №7");
        System.out.println("На первой диете спортсмену понадобиться " + diet1 + " дней.");
        System.out.println("На второй диете спортсмену понадобиться " + diet2 + " дней.");
        System.out.println("В среднем спортсмену понядобиться " + days + " дней");

        //Задание №8
        float salaryMasha = 67760.0f;
        float salaryDenis = 83690.0f;
        float salaryChristina = 76230.0f;
        float salaryMashaUP = salaryMasha * 1.10f;
        float salaryDenisUP = salaryDenis * 1.10f;
        float salaryChristinaUP = salaryChristina * 1.10f;
        System.out.println("Задача №8");
        System.out.println("Маша теперь получает " + salaryMashaUP + " рублей. Годовой доход вырос на "
                + (salaryMashaUP - salaryMasha) + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisUP + " рублей. Годовой доход вырос на " +
                (salaryDenisUP - salaryDenis) + " рублей");
        System.out.println("Кристина теперь получает " + salaryChristinaUP + " рублей. Годовой доход вырос" +
                " на " + (salaryChristinaUP - salaryChristina) + " рублей");
    }
}