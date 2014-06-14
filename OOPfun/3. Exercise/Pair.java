public class Pair {
    private final Object first;
    private final Object second;

    public Pair(Object first, Object second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return this.first;
    }

    public Object getSecond() {
        return this.second;
    }

    @Override
    public String toString() {
        return String.format("(%s, %s)", this.first.toString(), this.second.toString());
    }

    @Override
    public boolean equals(Object rhs){
        
        if(rhs instanceof Pair){
            if (this.getFirst().equals(((Pair) rhs).first) &&
                    this.getSecond().equals(((Pair) rhs).getSecond())){
                return true;
            }
        }
        return false;
    }
}
