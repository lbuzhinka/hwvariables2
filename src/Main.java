public class Main {
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
        byte bottleProductionPer2minute = 16;




    }
}