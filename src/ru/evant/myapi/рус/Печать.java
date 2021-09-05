package ru.evant.myapi.рус;

public class Печать {

    public static final void печать(Число число){
        System.out.println(число.целоеЧисло()+"");
    }

    public static final void печать(int строка){
        System.out.println(строка + "");
    }

    public static final void печать(String строка){
        System.out.println(строка);
    }

    public static final void печать(){
        System.out.println();
    }
}
