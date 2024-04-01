public class Main {
    public static void main(String[] args) {

        int a = 2312312;
        byte b = 100;
        short c = 32000;
        long d = 92837498127394801L;
        float e = 5.6f;
        double f = 3.16283123;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        double g = 27.12;
        long h  = 987678965549L;
        float i = 2.786f;
        short j = 569;
        short k = -159;
        int l = 27897;
        byte m = 67;
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);


        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short paperSum = 480;
        int studentsSum = firstTeacher + secondTeacher + thirdTeacher;
        int studentPaper = paperSum / studentsSum;
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги.");

        byte prodByMinute = 8;
        int prodByTwentyMinutes = prodByMinute * 20;
        System.out.println("За 20 минут машина произвела " + prodByTwentyMinutes + " штук бутылок.");
        int prodByDay = prodByMinute * 1440;
        System.out.println("За сутки машина произвела " + prodByDay + " штук бутылок.");
        int prodByThreeDays = prodByDay * 3;
        System.out.println("За три дня машина произвела " + prodByThreeDays + " штук бутылок.");
        int prodByMonth = prodByDay * 31;
        System.out.println("За 1 месяц машина произвела " + prodByMonth + " штук бутылок.");

        byte paintSum = 120;
        int classSum = paintSum / 6;
        int whitePaint = classSum * 2;
        int brownPaint = classSum * 4;
        System.out.println("В школе, где " + classSum + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        int weightGr = 5 * 80 + 2 * 105 + 2 * 100 + 4 * 70;
        System.out.println("Количесто граммов спортзавтрака: " + weightGr);
        float weightKg = (float)weightGr / 1000;
        System.out.println("Количесто килограммов спортзавтрака: " + weightKg);

        int firstTry = 7000 / 250;
        System.out.println("На похудение при потере 250 грамм в день уйдет " + firstTry + " дней.");
        int secondTry = 7000 / 500;
        System.out.println("На похудение при потере 500 грамм в день уйдет " + secondTry + " дней.");
        int averageValue = (firstTry + secondTry)/2;
        System.out.println("На похудение в среднем уйдет " + averageValue + " дней.");

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int chrisSalary = 76230;
        int newMashaSalary = (int) ((mashaSalary * 0.1) + mashaSalary);
        int mashaAnnual = mashaSalary * 12;
        int newMashaAnnual = newMashaSalary * 12;
        int mashaAnnualDif = newMashaAnnual - mashaAnnual;
        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + mashaAnnualDif + " рублей.");
        int newDenisSalary = (int) ((denisSalary * 0.1) + denisSalary);
        int denisAnnual = denisSalary * 12;
        int newDenisAnnual = newDenisSalary * 12;
        int denisAnnualDif = newDenisAnnual - denisAnnual;
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisAnnualDif + " рублей.");
        int newChrisSalary = (int) ((chrisSalary * 0.1) + chrisSalary);
        int chrisAnnual = chrisSalary * 12;
        int newChrisAnnual = newChrisSalary * 12;
        int chrisAnnualDif = newChrisAnnual - chrisAnnual;
        System.out.println("Кристина теперь получает " + newChrisSalary + " рублей. Годовой доход вырос на " + chrisAnnualDif + " рублей.");
    }
}