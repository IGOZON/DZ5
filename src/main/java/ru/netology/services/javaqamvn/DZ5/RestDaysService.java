package ru.netology.services.javaqamvn.DZ5;

public class RestDaysService {


    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег
        for (int x = 1; x <= 12; x++) {
            if (money < threshold) { // можем ли отдыхать?
                money = money + income - expenses; // Если нет, то прибавляем доход и отнимаем расходы
            } else {
                count = count + 1; // Иначе прибавляем 1 месяц отдыха
                money = (money - income) / 3; // от общего колличества денег отнимаем доход и остаток делим на 3
            }
        }
        return count;
    }

}

