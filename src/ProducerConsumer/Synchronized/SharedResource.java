package ProducerConsumer.Synchronized;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    Queue<Integer> q;
    int bufferSize;

    SharedResource(int size)
    {
        q = new LinkedList<>();
        bufferSize = size;
    }

    public synchronized void produce(int item)
    {
        if(q.size() == bufferSize)
        {
            System.out.println("Queue is full");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        q.add(item);
        System.out.println("Added the item id:::"+item);
        notify();
    }

    public synchronized void consume()
    {
        if(q.isEmpty())
        {
            System.out.println("Queue is empty");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int t = q.remove();
        System.out.println("Consumed the item id:::"+t);
        notify();
    }
}
