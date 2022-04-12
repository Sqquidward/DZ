package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class Point{
    private int x;

    public int getY() {
        return y;
    }

    private int y;

    public int getX() {
        return x;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Solution do_smt = new Solution();
        System.out.println("Максимальное X: "+do_smt.X_Max()+"\n");
        System.out.println("Растояние от точки, до начала координат.");
        do_smt.Rast();
//        do_smt.Get();
    }


}

class Solution{
    public List<Point> X_Y(){
        List<Point> List_xy = new ArrayList<>();
        //Добавляем координаты x и y
        List_xy.add(new Point(1, 3));
        List_xy.add(new Point(5, 2));
        List_xy.add(new Point(9, 7));
        List_xy.add(new Point(6, 1));
        List_xy.add(new Point(5, 8));
        List_xy.add(new Point(2, 7));

        return List_xy;

    }
    public int X_Max(){
            return X_Y().stream().max(comparing(Point::getX)).get().getX();
    }

    public void Rast(){
        X_Y().stream()
                .map(h->Math.sqrt(Math.pow(h.getX(), 2)+Math.pow(h.getY(), 2)))
                .forEach(System.out::println);
    }

    public void new_Potok(){
        //Создает новый поток, расттояних которых до начала координат больше 5
        List<Point> List_xy = new ArrayList<>();
        //Добавляем координаты x и y
        List_xy.add(new Point(4, 6));
        List_xy.add(new Point(5, 2));
        List_xy.add(new Point(9, 7));
        List_xy.add(new Point(6, 1));
        List_xy.add(new Point(5, 8));
        List_xy.add(new Point(2, 7));

        Comparator<Point> comparator = Comparator.comparingInt(h -> (int) Math.sqrt(Math.pow(h.getX(), 2)+Math.pow(h.getY(), 2)) );


        int way = (Math.sqrt(Math.pow(getX(), 2)+Math.pow(getY(), 2)))

        List_xy.stream()
                .sorted(comparator)
                .forEach(String);


        List sortedList = users.stream()
                .sorted(Comparator.comparingInt(User::getAge))
                .collect(Collectors.toList());


        //Как сделать эту функция я вообще не понимаю

    }
}
