package ProducerConsumer.Synchronized;

public class SynchronizedClient {
    public static void main(String args[])
    {
        SharedResource sharedResource = new SharedResource(3);

        Thread th1 = new Thread(()->{
           for(int i=0;i<6;i++)
           {
               sharedResource.produce(i);
           }
        });

        Thread th2 = new Thread(()->{
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for(int i=0;i<5;i++)
           {
               sharedResource.consume();
           }
        });

        th1.start();
        th2.start();
    }
}
