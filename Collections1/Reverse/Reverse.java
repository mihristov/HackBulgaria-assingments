import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

public class Reverse {
    public Reverse() {
    }
    
    public <T> void reverseCollection(Collection<T> col){
        Stack<T> myStack = new Stack<>();
        Iterator<T> it = col.iterator();
        while(it.hasNext()){
            myStack.add(it.next());
        }
        col.clear();
        while(!myStack.empty()){
            col.add(myStack.pop());
        }
    }

}
