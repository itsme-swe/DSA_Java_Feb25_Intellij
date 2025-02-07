package CollectionFramework.QueueInterface.BasicsOfQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class creatingQueue {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>(); // queue created using an object of linked list

        Queue<String> q1 = new ArrayDeque<>(); // queue created using an object of array deque

        Queue<Integer> q2 = new PriorityQueue<>(); // queue created using an object of priority queue
    }
}
