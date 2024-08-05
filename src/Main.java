public class Main {
    public static void main(String[] args){
        //Task 1
        System.out.println("Task 1");
        byte a = 0;
        short b = 130;
        int c = 330;
        long d = 450L;
        float e = 13.3f;
        double f = 212.12;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

        System.out.println("   ");
        //Task 2
        System.out.println("Task 2");
        float qw = 27.12f;
        long wq = 987678965549L;
        double we = 2.786;
        short ew = 569;
        short as = -159;
        int sa = 27897;
        byte sd = 67;
        System.out.println("   ");

        //Task 3
        System.out.println("Task 3");
        byte lp = 23;
        byte ac = 27;
        byte ea = 30;
        short totalPaper = 480;
        int totalStudent = lp+ac+ea;
        int paperStudent = totalPaper/totalStudent;
        System.out.println("На каждого ученика рассчитано " +paperStudent + " листов бумаги");

        System.out.println("   ");
        //Task 4
        System.out.println("Task 4");
        byte productivityMinute = 16/2;
        int productivite20Minute = productivityMinute * 20;
        int productiviteDay = (productivite20Minute*3)*24;
        int productivite3Day = productiviteDay * 3;
        int productiviteMonth = productiviteDay * 31; // допустим, что в этом месяце 31 день

        System.out.println("За 20 минут машина произвела " + productivite20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + productiviteDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + productivite3Day + " штук бутылок");
        System.out.println("За месяц машина произвела " + productiviteMonth + " штук бутылок");

        System.out.println("    ");
        //Task 5
        System.out.println("Task 5");
        byte totalColor = 120;
        int totalClassRoom = totalColor/6;
        int totalWhiteColor = totalClassRoom*2;
        int totalBrownColor = totalClassRoom*4;
        System.out.println("В школе, где " + totalClassRoom + " классов, нужно "+totalWhiteColor + " банок белой краски и "+totalBrownColor + " банок коричневой краски");

        System.out.println("    ");
        //Task 6
        System.out.println("Task 6");
        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int recipeGrams = (banana*5)+(milk*2)+(iceCream*2)+(egg*4);
        float recipeKilograms = recipeGrams/1000f;

        System.out.println("Завтрак составляет " + recipeGrams + " грамм" );
        System.out.println("Завтрак составляет " + recipeKilograms + " килограмм" );


        System.out.println("    ");
        //Task 7
        System.out.println("Task 7");
        short weightGrams = 7*1000;
        int weightLoss250 = weightGrams/250;
        int weightLoss500 = weightGrams/500;
        int arifMean = (weightLoss250+weightLoss500)/2;
        System.out.println(weightLoss250 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(weightLoss500 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println("В среднем потребуется "+arifMean+" день, чтобы добиться результата похудения.");

        System.out.println("    ");
        //Task 8
        System.out.println("Task 8");
        int salaryMasha = 67760;
        float salaryMashaNew = salaryMasha + ((salaryMasha/100f)*10f);
        float diffYearSalaryMasha = (salaryMashaNew*12)-(salaryMasha*12);
        System.out.println("Маша теперь получает "+salaryMashaNew+ " рублей. Годовой доход вырос на "+diffYearSalaryMasha+ " рублей");

        int salaryDenis = 83690;
        float salaryDenisNew = salaryDenis + ((salaryDenis/100f)*10f);
        float diffYearSalaryDenis = (salaryDenisNew*12)-(salaryDenis*12);
        System.out.println("Денис теперь получает "+salaryDenisNew+ " рублей. Годовой доход вырос на "+diffYearSalaryDenis+ " рублей");

        int salaryKristina = 76230;
        float salaryKristinaNew = salaryKristina + ((salaryKristina/100f)*10f);
        float diffYearSalaryKristina = (salaryKristinaNew*12)-(salaryKristina*12);
        System.out.println("Кристина теперь получает "+salaryKristinaNew+ " рублей. Годовой доход вырос на "+diffYearSalaryKristina+ " рублей");


    }

}