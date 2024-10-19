public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 33745;
        byte b = 103;
        short c = 307;
        long d = 574L;
        float E = 3.5F;
        double X = 3.546;
        System.out.println ("Значение переменной 'a' с типом int равно " + a);
        System.out.println ("Значение переменной 'b' с типом byte равно " + b);
        System.out.println ("Значение переменной 'c' с типом short равно " + c);
        System.out.println ("Значение переменной 'd' с типом long равно " + d);
        System.out.println ("Значение переменной 'E' с типом float равно " + E);
        System.out.println ("Значение переменной 'X' с типом double равно " + X);
        float a1 = 27.12F;
        long b1 = 987678965549L;
        double c1 = 2.786;
        short d1 = 569;
        short e1 = -159;
        short x1 = 27897;
        byte y = 67;
        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        short sheets = 480;
        int totalChildren = classA + classB + classC;
        int sheetsOne = sheets/totalChildren;
        System.out.println ("На каждого ученика рассчитано " + sheetsOne + " листов бумаги." );
        byte bottles = 16;
        byte time = 2;
        byte time1 = 20;
        int performance1 = time1*bottles/time;
        int time2 = 24*60;
        int performance2 = time2*bottles/time;
        int time3 = 3*24*60;
        int performance3 = time3*bottles/time;
        int time4 = 30*24*60;
        int performance4 = time4*bottles/time;
        System.out.println ("За " + time1 + " минут машина произвела " + performance1 + " штук бутылок.");
        System.out.println ("За " + time2 + " минут машина произвела " + performance2 + " штук бутылок.");
        System.out.println ("За " + time3 + " минут машина произвела " + performance3 + " штук бутылок.");
        System.out.println ("За " + time4 + " минут машина произвела " + performance4 + " штук бутылок.");
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classes = totalPaint/(whitePaint+brownPaint);
        int totalWhite = classes*whitePaint;
        int totalBrown = classes*brownPaint;
        System.out.println ("В школе, где " + classes + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски.");
        byte banana = 5;
        byte weightBanana = 80;
        byte milk = 2;
        byte weightMilk = 105;
        byte eggs = 4;
        byte weightEggs = 70;
        byte iceCream = 2;
        byte weightIceCream = 100;
        int totalWeight = (banana*weightBanana)+(milk*weightMilk)+(eggs*weightEggs)+(iceCream*weightIceCream);
        float totalWeight2 = totalWeight/1000F;
        System.out.println ("Общий вес спортзавтрака " + totalWeight + " в граммах.");
        System.out.println ("Общий вес спортзавтрака " + totalWeight2 + " в килограммах.");

        int weightSport = 7000;
        int loss1 = 250;
        int loss2 = 500;
        int days1 = weightSport/loss1;
        int days2 = weightSport/loss2;
        double averageValue = 7000/((loss1+loss2)/2);
        System.out.println ("Если терять по 250 грамм спортсмену понадобится " + days1 + " дней.");
        System.out.println ("Если терять по 500 грамм спортсмену понадобится " + days2 + " дней.");
        System.out.println ("В среднем спортсмену понадобится " + averageValue + " дней.");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        double rise = 1.1;
        int riseMasha = (int) (salaryMasha*rise);
        int riseDenis = (int) (salaryDenis*rise);
        int riseChristina = (int) (salaryChristina*rise);
        byte period = 12;
        int salaryMashaYear = salaryMasha*period;
        int salaryDenisYear = salaryDenis*period;
        int salaryChristinaYear = salaryChristina*period;
        int salaryMashaYear2 = riseMasha*period;
        int salaryDenisYear2 = riseDenis*period;
        int salaryChristinaYear2 = riseChristina*period;
        int differenceMasha = salaryMashaYear2-salaryMashaYear;
        int differenceDenis = salaryDenisYear2-salaryDenisYear;
        int differenceChristina = salaryChristinaYear2-salaryChristinaYear;
        System.out.println ("Маша теперь получает " + riseMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");
        System.out.println ("Денис теперь получает " + riseDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");
        System.out.println ("Кристина теперь получает " + riseChristina + " рублей. Годовой доход вырос на " + differenceChristina + " рублей.");






    }
}