package com.vladislavgolovkin.vtb.Lesson6_MultithreadingPartOne;
/*Практическое задание
Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив.
2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) *
Math.cos(0.4f + i / 2)).
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).
Примечание: Отличие первого метода от второго:
● Первый просто бежит по массиву и вычисляет значения.
● Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и
потом склеивает эти массивы обратно в один.
По замерам времени:
Для первого метода надо считать время только на цикл расчета.
Для второго метода замеряете время разбивки массива на 2, просчета каждого из двух массивов и
склейки.
*/
public class Main {
    public static void main(String[] args) {
       // MultithreadingTask.TimeCountingMethodWithoutMultithreading();
        MultithreadingTask.TimeCountingWithMultithreadingMethod();

    }
}
