package com.company.Homeworks.Homework3;

import com.company.Homeworks.Homework2.Point;

public class MyList {
    private Point[] points;
    private int index = 0;


    //пользователь не вводит свой размер списка соответственно у списка будет дефолтный размер (10)
    public MyList() {
        points = new Point[10];
    }

    //пользователь вводит свой размер списка
    public MyList(int length) {
        points = new Point[length];
    }


    //получение элемента
    public Point get(int i) {
        checkExistsIndex(i);
        return points[i];
    }

    // добавить в конец списка
    public void add(Point p) {
        if (index == points.length) {
            changeSize();
        }
        points[index++] = p;
    }


    // установка элемента в указанное место
    public void set(Point p, int index) {
        checkExistsIndex(index);
        if (index == points.length) {
            changeSize();
        }
        for (int i = this.index; i > index; i--) {
            points[i] = points[i - 1];
        }
        points[index] = p;
        this.index++;

    }

    //удаление элемента по индексу
    public void remove(int index) {
        checkExistsIndex(index);
        Point[] buffer = new Point[points.length - 1];
        for (int i = 0; i < buffer.length; i++) {
            buffer[i] = points[i < index ? i : i + 1];
        }
        points = buffer;
        this.index--;

    }

    //увеличение в 1.5 раза размер массива
    private void changeSize() {
        Point[] buffer = new Point[(int) (points.length * 1.5)];
        for (int i = 0; i < points.length; i++) {
            buffer[i] = points[i];
        }
        points = buffer;
    }

    //проверка на валидность индекса
    private void checkExistsIndex(int index) {
        if (index >= this.index || index < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public int size() {
        return index;
    }

    public int capacity() {
        return points.length;
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public void clear() {
        for (int i = 0; i < index; i++) {
            points[i] = null;
        }
        index = 0;
    }


    // для красоты
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size(); i++) {
            if (i == size() - 1) {
                result += points[i]+"]";
            } else {
                result += points[i] + ", ";
            }
        }
        return result;
    }
}
