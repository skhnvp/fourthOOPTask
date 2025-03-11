package ru.stepup.oop;

/*
Данное задание не является обязательным для решения. Вы можете выполнить его для дополнительной тренировки навыка по данной теме

Создайте класс Город (City), которая будет представлять собой точку на карте со следующими характеристиками:

+1. Название Города: строка
+2. Набор путей к следующим городам, где путь представляет собой сочетание Города и стоимости поездки в него
+3. При создании Город требует указать название и можно (но не обязательно) указывать набор путей
+4. Город может возвращать текстовое представление, в виде названия Города и списка связанных с ним Городов (в виде пары: “название: стоимость”)
+5. Городу в любой момент можно добавить новый путь в другой город, указав либо сам путь, либо пару Город-цена
+6. Город должен иметь метод путешествия (travelBy). Такой метод принимает число n, который обозначает количество переходов.
Проще говоря, в текущем списке путей берется первый город, из его списка путей так же берется первый город,
из списка путей которого в свою очередь берется город и так далее до тех пор, пока либо количество городов не станет равным n,
либо у текущего города не окажется путей. Метод возвращает последний Город пути или null если мы попали в тупик

Далее необходимо методу путешествия объекта B передать некоторое число и вывести возвращенный город на экран:

1. Если передано число 1, результат должен быть либо A, либо С
2. Если передано число 2, результат должен быть либо B, либо D, либо F
3. Если передано число 3, результат может быть любом городом в зависимости от порядка следования путей в списках таковых у городов
4. Настройте объекты городов так, чтобы при передаче числа 3 последним городом оказался город A

*/

public class Main {
    public static void main(String[] args) {
        City a = new City("A");
        City b = new City("B");
        City c = new City("C");
        City d = new City("D");
        City e = new City("E");
        City f = new City("F",new Road(b,120),new Road(e,110));

        a.addRoad(new Road(b,100));
        a.addRoad(new Road(d,110));
        a.addRoad(new Road(f,120));

        b.addRoad(new Road(a));
        b.addRoad(new Road(c,120));

        c.addRoad(new Road(b,110));
        c.addRoad(new Road(d,110));

        d.addRoad(new Road(a,100));
        d.addRoad(new Road(e,110));
        d.addRoad(new Road(c,120));

        e.addRoad(new Road(f,100));

        System.out.println("Начальный город: B");
        b.travelBy(1);

        System.out.println("\nНачальный город: B");
        b.travelBy(2);

        System.out.println("\nНачальный город: B");
        b.travelBy(3);

        System.out.println("\nНачальный город: B\nПоследний город: A");
        b.travelToA(3);
    }
}