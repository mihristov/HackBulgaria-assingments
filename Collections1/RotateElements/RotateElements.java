import java.util.ArrayList;

public class RotateElements {
    public void rotate(ArrayList<Integer> collection, int rotateStep) {
        if (rotateStep > 0) {
            for (int i = 0; i < rotateStep; i++) {
                Integer toAdd = collection.get(collection.size() - 1);
                collection.add(0, toAdd);
                collection.remove(collection.size() - 1);
            }
        } else {
            for (int i = rotateStep; i < 0; i++){
                Integer toAdd = collection.get(0);
                collection.add(collection.size(), toAdd);
                collection.remove(0);
            }
        }
    }
}
