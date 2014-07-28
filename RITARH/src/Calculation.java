import java.util.HashMap;

import org.apfloat.Apfloat;

public class Calculation implements Runnable {
	
	int lLimit;
	int uLimit;
	static int precision;
	//static Apfloat[] factorials;
	static HashMap<Integer, Apfloat> factorials = new HashMap<Integer, Apfloat>();
	static int calculatedFact = 0;
	int tId;
	int index;
	Apfloat tmp;

	Apfloat[] result;
	
	public Calculation(int i, Apfloat[] res, int prec, int tId) {
		this.index = i;
		this.result = res;
		setPrecision(prec);
		this.tId = tId;
		
		//initFactorials();
		result[tId] = new Apfloat(0, precision);
	}
	/*
	public void run () {
		for (int i = lLimit; i <= uLimit; i += 2) {
			//Apfloat fact = getFactorial(i+1);
			Apfloat fact = factorial(i - 1);
			tmp = new Apfloat(i, precision);
			//System.out.println(tmp + "/" + fact);
			result[tId] = result[tId].add(tmp.divide(fact));
			//System.out.println(result[tId]);
		}
		System.out.println("Thread " + tId + " calculated :" + result[tId]);
	}
	*/
	public void run () {
		//Apfloat fact = getFactorial(i+1);
		
		Apfloat fact = factorial(index - 1);
		tmp = new Apfloat(index, precision);
		
		//System.out.println(tmp + "/" + fact);
		
		result[tId] = result[tId].add(tmp.divide(fact));
		
		//System.out.println(result[tId]);
		System.out.println("Thread " + tId + " calculated :" + result[tId]);
	}
	/*
	static void initFactorials () {
		factorials = new Apfloat[precision];
		factorials[0] = new Apfloat(1, precision);
		factorials[1] = new Apfloat(1, precision);
		calculatedFact = 2;
	}
	*/
	
	static Apfloat factorial(int i)
    {
		Apfloat ret;
        
        if (i == 0) return Apfloat.ONE;
        if (null != (ret = factorials.get(i))) return ret;
        ret = new Apfloat(i, precision).multiply(factorial(i-1));
        factorials.put(i, ret);
        return ret;
    }
	
	static void setPrecision (int p) {
		Calculation.precision = p;
	}
	/*
	Apfloat getFactorial(int i) throws NullPointerException, ArrayIndexOutOfBoundsException {
		if (calculatedFact > i) {
			return factorials[i];
		} else {
			for (int k = calculatedFact; k <= i + 1; ++k, ++calculatedFact) {
				factorials[k - 1] = factorials[k - 2].multiply(new Apfloat(k, precision));
			}
			return factorials[calculatedFact - 1];
		}
	}*/
	
}