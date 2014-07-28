import java.util.HashMap;

import org.apfloat.Apfloat;

public class sumCalculation implements Runnable
{

	//declaring parameters
	int threads;
	int n;
	Apfloat result[];
	static HashMap<Integer,Apfloat> factorials = new HashMap<Integer,Apfloat>();
	//static Apfloat factorials[];
	int ind;
	int step;
	static int precision;
	
	//constructor
	@SuppressWarnings("static-access")
	public sumCalculation(int thread_count, int n, Apfloat r[], int ind, int st, int p)
	{
		this.threads = thread_count;
		this.n = n;
		this.result = r;
		this.ind = ind;
		this.step = st;
		this.precision = p;
		
		//factorials = new Apfloat[precision];
	}
	
	
	
	public synchronized void run() throws ArrayIndexOutOfBoundsException {

		Apfloat part_sum = new Apfloat(0, precision);
		for(int j = n; j < n + step; j += 2)
		{
			//System.out.println(j + " / " + (j - 1) + "!");
			part_sum = part_sum.add(new Apfloat(j, precision).divide(factorial(j-1)));
		}
		//System.out.println("Thread " + ind + " partial sum: " + part_sum);	
		result[ind] = part_sum;
		
	}/*
	static synchronized Apfloat factorial(int i) throws ArrayIndexOutOfBoundsException
    {
        if (i == 0) {
        	return Apfloat.ONE;  
        } else if (null != factorials[i]) { 
        	return factorials[i];
        } else {
	        factorials[i] = new Apfloat(i, precision).multiply(factorial(i-1));
	        return factorials[i];
        }
    }*/
	
	public static Apfloat factorial(int n)
    {
		Apfloat ret;
        
        if (n == 0) return Apfloat.ONE;
        if (null != (ret = factorials.get(n))) return ret;
        ret =  new Apfloat(n, precision).multiply(factorial(n-1));
        factorials.put(n, ret);
        return ret;
    }

	
	
}
