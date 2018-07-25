package com.javarush.task.task17.task1713;

import java.util.*;
import java.util.function.UnaryOperator;

/* 
Общий список
*/

public class Solution implements java.util.List<Long>{
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    @Override
    public synchronized Object[] toArray(Object[] a) {
        return original.toArray(a);
    }

    @Override
    public synchronized int size() {
        return original.size();
        //return 0;
    }

    @Override
    public synchronized boolean isEmpty() {
        return original.isEmpty();
        //return false;
    }

    @Override
    public synchronized boolean contains(Object o) {
        return original.contains(o);
        //return false;
    }

    @Override
    public synchronized Iterator iterator() {
        return original.iterator();
        //return null;
    }

    @Override
    public synchronized Object[] toArray() {
        return original.toArray();
        //return new Object[0];
    }

    @Override
    public synchronized boolean add(Long aLong) {
        return original.add(aLong);
        //return false;
    }

    //@Override
    /*public synchronized boolean add(Object o) {
        return original.add((Long) o);
        //return false;
    }*/

    @Override
    public synchronized boolean remove(Object o) {
        return original.remove(o);
        //return false;
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c) {
        return original.addAll(c);
        //return false;
    }

    @Override
    /*public synchronized boolean addAll(Collection c) {

        return original.add(c);
        return false;
    }*/

    //@Override
    public synchronized boolean containsAll(Collection c) {
        return original.containsAll(c);
        //return false;
    }

    @Override
    public synchronized boolean addAll(int index, Collection c) {
        return original.addAll(index, c);
        //return false;
    }

    @Override
    public synchronized boolean retainAll(Collection c) {
        return original.retainAll(c);
        //return false;
    }

    @Override
    public synchronized boolean removeAll(Collection c) {
        return original.removeAll(c);
        //return false;
    }


    @Override
    public synchronized void clear() {
        original.clear();
    }

    @Override
    public synchronized Long get(int index) {
        return original.get(index);
        //return null;
    }

    /*@Override
    public synchronized Object get(int index) {
        return original.get(index);
        //return null;
    }*/

    @Override
    public synchronized Long set(int index, Long element) {
        return original.set(index, element);
        //return null;
    }

    @Override
    public synchronized void add(int index, Long element) {
        original.add(index, element);
    }

    @Override
    public synchronized Long remove(int index) {
        return original.remove(index);
        //return null;
    }

    //@Override
   /* public synchronized Object set(int index, Object element) {
        return original.set(index, (Long) element);
        //return null;
    }*/

    //@Override
    /*public synchronized void add(int index, Object element) {
        original.add(index, (Long) element);
    }*/

    /*@Override
    public synchronized Object remove(int index) {
        return original.remove(index);
        //return null;
    }*/

    @Override
    public synchronized int indexOf(Object o) {
        return original.indexOf(o);
        //return 0;
    }

    @Override
    public synchronized int lastIndexOf(Object o) {
        return original.lastIndexOf(o);
        //return 0;
    }

    @Override
    public synchronized ListIterator listIterator() {
        return original.listIterator();
        //return null;
    }

    @Override
    public synchronized ListIterator listIterator(int index) {
        return original.listIterator(index);
        //return null;
    }

    @Override
    public synchronized List subList(int fromIndex, int toIndex) {
        return original.subList(fromIndex, toIndex);
        //return null;
    }

}
