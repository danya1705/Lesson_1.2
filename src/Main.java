public class Main {
    public static void main(String[] args) {

        //Задача 1
        byte varByte = 100;
        short varShort = 130;
        int varInt = 33000;
        long varLong = 3_000_000_000L;

        float varFloat = 17.05f;
        double varDouble = 81.5;

        boolean varBoolean = true;
        char varChar = 64;


        //Задача 2
        float firstBoxerWeight = 78.2f;
        float secondBoxerWeight = 82.7f;
        float weightSumm = firstBoxerWeight + secondBoxerWeight;
        float weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println("Общий вес боксёров: " + weightSumm + " кг");
        System.out.println("Разница в весе: " + weightDifference + " кг");


        //Задача 3
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;

        float totalWeightG = 5 * bananaWeight + 2 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
        float totalWeightKg = totalWeightG / 1000;
        System.out.println("Общий вес завтрака: " + totalWeightKg + " кг");


        //Задача 4
        int daysForWeightLoss250 = 7000 / 250;
        int daysForWeightLoss500 = 7000 / 500;
        int daysAverage = (daysForWeightLoss250 + daysForWeightLoss500) / 2;

        System.out.println("Дней на похудение при 250 г в день: " + daysForWeightLoss250);
        System.out.println("Дней на похудение при 500 г в день: " + daysForWeightLoss500);
        System.out.println("Дней на похудение в среднем: " + daysAverage);


        //Задача 5
        float mashaWageBefore = 67760f;
        float denisWageBefore = 83690f;
        float kristinaWageBefore = 76230f;

        float mashaWageAfter = mashaWageBefore * 1.1f;
        float denisWageAfter = denisWageBefore * 1.1f;
        float kristinaWageAfter = kristinaWageBefore * 1.1f;

        float mashaYearWageIncrease = (mashaWageAfter - mashaWageBefore) * 12;
        float denisYearWageIncrease = (denisWageAfter - denisWageBefore) * 12;
        float kristinaYearWageIncrease = (kristinaWageAfter - kristinaWageBefore) * 12;

        System.out.println("Маша теперь получает " + mashaWageAfter + " рублей. Годовой доход вырос на " + mashaYearWageIncrease + " рублей");
        System.out.println("Денис теперь получает " + denisWageAfter + " рублей. Годовой доход вырос на " + denisYearWageIncrease + " рублей");
        System.out.println("Кристина теперь получает " + kristinaWageAfter + " рублей. Годовой доход вырос на " + kristinaYearWageIncrease + " рублей");
    }
}