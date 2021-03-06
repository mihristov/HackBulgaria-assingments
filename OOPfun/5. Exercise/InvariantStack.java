public class InvariantStack extends StackImpl {

    public static void main(String[] args) {
        InvariantStack m = new InvariantStack();
        m.push(5);
        m.push(4);
        m.push(5);
    }

    public InvariantStack() {
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
        boolean isDuplicate = false;
        for (int i = 0; i < topIndex; i++) {
            if (stackArray[i].equals(obj)) {
                isDuplicate = true;
                break;
            }
        }
        if (isDuplicate) {
            System.out.println(String.format("You already have %s", obj.toString()));
        } else {
            topIndex++;
            stackArray[topIndex] = obj;
        }
    }
}
