package ru.evant.myapi.рус;

public class Число {
    int целое;

    /* Целые числа */
    public int целоеЧисло(Число целое){
        Число а = new Число(целое);
        return а.целоеЧисло();
    }

    public int целоеЧисло(int целое){
        return целое;
    }

    public int целоеЧисло(){
        return целое;
    }

    /* Конструкторы */
    public Число(String целое){
        this.целое = Integer.parseInt(целое);
    }

    public Число(Число целое){
        Число а = new Число(целое);
        this.целое = а.целоеЧисло();
    }

    public Число(int целое){
        this.целое = целое;
    }

    public Число(){
        this.целое = 0;
    }
}
