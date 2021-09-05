package ru.evant.myapi.мат;

import ru.evant.myapi.рус.Число;

public class Мат {

    /* Сумма */
    // Возвращает сумму двух чисел
    public static final Число суммаЧисел(Число б, Число а){
        return new Число(а.целоеЧисло() + б.целоеЧисло());
    }

    // Возвращает сумму двух чисел
    public static final int сумма(Число а, Число б){
        return а.целоеЧисло() + б.целоеЧисло();
    }

    // Возвращает сумму двух чисел
    public static final int сумма(int а, int б){
        return а + б;
    }
}
