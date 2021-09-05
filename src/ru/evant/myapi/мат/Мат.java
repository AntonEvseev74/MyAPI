package ru.evant.myapi.мат;

import ru.evant.myapi.рус.Число;

public class Мат {

    /* Сумма */
    public static final int сумма(Число а, Число б){
        return а.целоеЧисло() + б.целоеЧисло();
    }

    public static final int сумма(int а, int б){
        return а+б;
    }
}
