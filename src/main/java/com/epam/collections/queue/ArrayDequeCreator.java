package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(firstQueue.remove());
        deque.add(firstQueue.remove());
        deque.add(secondQueue.remove());
        deque.add(secondQueue.remove());
        boolean turn = true;
        while (!(firstQueue.isEmpty() && secondQueue.isEmpty())){
            if(turn){
                firstQueue.add(deque.pollLast());
                deque.add(firstQueue.remove());
                deque.add(firstQueue.remove());
            } else {
                secondQueue.add(deque.pollLast());
                deque.add(secondQueue.remove());
                deque.add(secondQueue.remove());
            }
            turn = !turn;
        }
        return deque;
    }
}
