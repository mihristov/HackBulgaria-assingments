import java.util.LinkedList;

public class BoundedQueue<T> extends LinkedList<T> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {
        BoundedQueue<Integer> boundedQueue = new BoundedQueue<>(3);
        boundedQueue.offer(1);
        boundedQueue.offer(2);
        boundedQueue.offer(3);
        boundedQueue.offer(4);
        boundedQueue.offer(5);
        System.out.println(boundedQueue.toString());
    }

    private int arraySize;

    public BoundedQueue(int size) {
        this.arraySize = size;
    }

    @Override
    public boolean offer(T e) {
        if (e == null) {
            return false;
        }
        if (this.size() == arraySize) {
            this.removeFirst();
            this.add(e);
        } else {
            this.add(e);
        }
        return true;
    }

}
