import org.apfloat.Apfloat;

public class Results {

    long time;

    Apfloat result;

    public Results(Apfloat res, long t) {
        this.time = t;
        this.result = res;
    }
}