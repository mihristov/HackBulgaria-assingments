import java.util.ArrayList;

public class OnOffCollection<T> extends ArrayList<T> {

    @Override
    public boolean add(T obj) {
        if (obj == null){
            return false;
        }
        if (this.contains(obj)) {
            this.remove(obj);
            return false;
        }
        super.add(obj);
        return true;
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

}
