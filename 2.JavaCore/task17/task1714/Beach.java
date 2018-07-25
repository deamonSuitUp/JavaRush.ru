package com.javarush.task.task17.task1714;

/* 
Comparable
*/

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {

        Beach a = new Beach("ss", 89, 3);
        Beach b = new Beach("sss", 90, 3);
        System.out.println(a.compareTo(b));
    }

    @Override
    public synchronized int compareTo(Beach o) {
        float d1,d2; int q1,q2;
        d2 = o.distance;
        d1 = this.distance;
        q2 = o.quality;
        q1 = this.quality;
        if (q1 > q2)
            return 1;
        else if (q2 > q1)
            return -1;
        else{
            if (d1 > d2)
                return -1;
            else if (d2 > d1)
                return 1;
            else return 0;
        }
    }
}
