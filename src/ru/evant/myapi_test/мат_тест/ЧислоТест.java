package ru.evant.myapi_test.мат_тест;

import ru.evant.myapi.рус.Печать;
import ru.evant.myapi.рус.Число;

public class ЧислоТест {

    public static void main(String[] args) {
        Число а1 = new Число();
        Печать.печать(а1);

        Число а2 = new Число(6);
        Печать.печать(а2);

        Число а3 = new Число("6");
        Печать.печать(а3);
    }
}
