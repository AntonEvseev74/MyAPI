package ru.evant.myapi_test.мат_тест;

import ru.evant.myapi.мат.Мат;
import ru.evant.myapi.рус.Печать;
import ru.evant.myapi.рус.Число;

public class СуммаТест {
    public static void main(String[] args) {
        int сумма1 = Мат.сумма(5, 10);
        System.out.println(сумма1);
        Печать.печать();

        Число б = new Число(6);
        Число в = new Число(6);
        int сумма2 = Мат.сумма(б, в);
        System.out.println(сумма2);
        Печать.печать();

        Число г = Мат.суммаЧисел(б, в);
        Печать.печать(г);
    }
}
