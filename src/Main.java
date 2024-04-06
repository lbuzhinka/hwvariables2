public class Main { ;

    public static void main(String[] args) {
        System.out.println("Task 1");
        byte a = 30;
        System.out.println("Значение переменной a с типом short равно " + a);
        short b = 23748;
        System.out.println("Значение переменной b с типом short равно " + 23748);
        int c = 500000;
        System.out.println("Значение переменной c с типом int равно " + 500_000);
        long d = 22232459L;
        System.out.println("Значение переменной d с типом int равно " + 22+232_459);
        float e = 1.2F;
        System.out.println("Значение переменной e с типом float равно " + 1.2);
        double f = 32554.256456481D;
        System.out.println("Значение переменной f с типом int равно " +  32_554.256_456_481);
        System.out.println("\nTask 2");
        float g = 27.12F;
        long h = 987_678_965_549L;
        float i = 2.786F;
        short j = 569;
        short k = -159;
        short l = 27897;
        byte m = 67;

        System.out.println("\nTask 3");
        byte studentsInFirstClass = 23;
        byte studentsInSecondClass = 27;
        byte studentsInThirdClass = 30;
        short boughtSheetsOfPaper = 480;
        short allStudentAmount = (short) (studentsInFirstClass +
                studentsInSecondClass + studentsInThirdClass);
        double paperPerStudentAmount = (double) boughtSheetsOfPaper / allStudentAmount;
        System.out.println("На каждого ученика рассчитано " + paperPerStudentAmount +
                " листов бумаги");
        System.out.println("\nTask 4");
        byte bottleProductionPerTwoMinutes = (byte) 16;
        int bottleProductionPerOneMinute = bottleProductionPerTwoMinutes / 2;
        int bottleProductionPerTwentyMinutes = bottleProductionPerOneMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottleProductionPerTwentyMinutes + " штук бутылок");
        int minutesInOneDay = 60 * 24;
        int productionPerOneDay = minutesInOneDay * bottleProductionPerOneMinute;
        System.out.println("За сутки машина произвела " + productionPerOneDay + " штук бутылок");
        int productionPerThreeDays = productionPerOneDay * 3;
        System.out.println("За 3 суток машина произвела " + productionPerThreeDays + " штук бутылок");
        int productionPerOneMonth = productionPerOneDay * 30;
        System.out.println("За месяц машина произвела " + productionPerOneMonth + " штук бутылок");
        System.out.println("\nTask 5");
        byte bothColourPaintAmount = 120;
        byte whiteColourPaintPerClassroom = 2;
        byte brownColourPaintPerClassroom = 4;
        int paintPerClassroomAmount = whiteColourPaintPerClassroom + brownColourPaintPerClassroom;
        int classroomAmount = bothColourPaintAmount / paintPerClassroomAmount ;
        int whiteColourPaintAmount = whiteColourPaintPerClassroom * classroomAmount;
        int brownColourPaintAmount = brownColourPaintPerClassroom * classroomAmount;
        System.out.println("В школе, где " + classroomAmount + " классов, нужно " + whiteColourPaintAmount + " банок белой краски и " + brownColourPaintAmount + " банки коричневой краски");
        System.out.println("\nTask 6");
        int bananasAmount = 5;
        int milkAmount = 200;
        int iceCreamAmount = 2;
        int eggsAmount = 4;
        int bananasWeight = bananasAmount * 80;
        int milkWeight = milkAmount / 100 * 105;
        int iceCreamWeight = iceCreamAmount * 100;
        int eggsWeight = eggsAmount * 70;
        int breakfastWeightAmount = bananasWeight + milkWeight + iceCreamWeight + eggsWeight;
        System.out.println("Вес завтрака " + breakfastWeightAmount + "грамм");
        double breakfastWeightAmountInKilo = (double) breakfastWeightAmount / 1000;
        System.out.println("\nTask 7");
        int needToLoseKilo = 7;
        int needToLoseWeightInGrams = needToLoseKilo * 1000;
        float loseWeightPerDayInKilo = (float) ( needToLoseWeightInGrams / 250f);
        float loseMoreWeightPerDayInKilo =  needToLoseWeightInGrams / 500f;
        float averageDays = (loseWeightPerDayInKilo + loseMoreWeightPerDayInKilo) / 2;
        System.out.println("Если боец будет терять 250 грамм в день, ему потребуется " + loseWeightPerDayInKilo + " дней");
        System.out.println("Если боец будет терять 500 грамм в день, ему потребуется " + loseMoreWeightPerDayInKilo + " дней");
        System.out.println("Если боец будет терять от 200 до 500 грамм в день, ему потребуется " + averageDays + " дней");
        System.out.println("\nTask 8");
        double mashasSalary = 67_760;
        double mashasSalaryBoostInPercent = mashasSalary / 100 * 10;
        double mashasBoostedSalary = mashasSalary +  mashasSalaryBoostInPercent;
        double mashasOldSalaryPerYear = mashasSalary * 12;
        double mashasNewSalaryPerYear = mashasBoostedSalary * 12;
        double mashasSalaryDifference = mashasNewSalaryPerYear - mashasOldSalaryPerYear;
        System.out.println("Маша теперь получает " + mashasBoostedSalary + " рублей. Годовой доход вырос на "
                + mashasSalaryDifference + " рублей");
        double denisSalary = 83_690;
        double denisSalaryBoostInPercent = denisSalary / 100 * 10;
        double denisBoostedSalary = denisSalary +  denisSalaryBoostInPercent;
        double denisOldSalaryPerYear = denisSalary * 12;
        double denisNewSalaryPerYear = denisBoostedSalary * 12;
        double denisSalaryDifference = denisNewSalaryPerYear - denisOldSalaryPerYear;
        System.out.println("Денис теперь получает " + denisBoostedSalary + " рублей. Годовой доход вырос на "
                + denisSalaryDifference + " рублей");
        double kristinaSalary = 76_230;
        double kristinaSalaryBoostInPercent = kristinaSalary / 100 * 10;
        double kristinaBoostedSalary = kristinaSalary +  kristinaSalaryBoostInPercent;
        double kristinaOldSalaryPerYear = kristinaSalary * 12;
        double kristinaNewSalaryPerYear = kristinaBoostedSalary * 12;
        double kristinaSalaryDifference = kristinaNewSalaryPerYear - kristinaOldSalaryPerYear;
        System.out.println("Кристина теперь получает " + kristinaBoostedSalary + " рублей. Годовой доход вырос на "
                + kristinaSalaryDifference + " рублей");







    }
}