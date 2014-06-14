public class StackImpl implements Stack {

    protected Object[] stackArray;
    protected int arraySize;
    protected int topIndex;

    public static void main(String[] args) {
        StackImpl m = new StackImpl();
        m.push(5);
        m.print();
        m.push(4);
        m.print();
        m.push(3);
        m.print();
    }

    public StackImpl() {
        stackArray = new Object[2];
        arraySize = 2;
        topIndex = -1;
    }

    @Override
    public void push(Object obj) {
        if (topIndex == arraySize - 1) {
            arraySize *= 2;
            Object[] newStack = new Object[arraySize];
            System.arraycopy(stackArray, 0, newStack, 0, arraySize / 2);
            stackArray = newStack;
        }
        topIndex++;
        stackArray[topIndex] = obj;
    }

    @Override
    public Object pop() {
        if (topIndex >= 0) {
            return stackArray[topIndex--];
        }
        return null;
    }

    @Override
    public Object top() {
        return stackArray[topIndex - 1];
    }

    @Override
    public int lenght() {
        return topIndex + 1;
    }

    @Override
    public boolean isEmpty() {
        return topIndex == -1;
    }

    @Override
    public void clear() {
        topIndex = -1;
    }

    @Override
    public void print() {
        for (int i = 0; i <= topIndex; i++) {
            System.out.println(stackArray[i].toString());
        }
    }

}
