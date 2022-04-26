package br.com.cesed.p3.deque;

public class Main {
    public static void main(String[] args) {
        Deque deque = new Deque();

        deque.insertFirst("novo 0");
        deque.insertFirst("novo 1");
        deque.insertFirst("novo 2");
        deque.insertFirst("novo 3");
        deque.insertFirst("novo 4");
        deque.insertFirst("novo 5");



        //deque.removeLast();
        System.out.println(deque.getLast());
        System.out.println(deque.getFirst());

        deque.removeFirst();

        System.out.println(deque.getFirst());




    }


}
