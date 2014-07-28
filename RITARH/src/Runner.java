import org.apfloat.*;

public class Runner
{
	
	static private Results res;
	
	public static Results myRunner(Integer precision, Integer thread_count, Integer flag)
	{
		Apfloat result[] = new Apfloat[thread_count];
		Thread tr[] = new Thread[thread_count];
		
		
		
		//Vsqka nishka shte presmqta chastichna suma s obshto 'step' na broi subiraemi
		
		int step = 100;
		
		if (precision <= 100) {
			step = 10;
		}
		
		int blocks;
		blocks = precision / step;

		Apfloat totalsum = new Apfloat("0", precision);

		long st = System.currentTimeMillis();
		
		for (int j = 0; j < blocks ; j += thread_count) {
			for (int i = 0; i < thread_count; ++i) {
				if (j + i >= blocks) {
					break;
				}
				sumCalculation r = new sumCalculation(thread_count, 1 + (j + i)*step, result, i, step, precision);
				//Calculation c = new Calculation(0, 100, result, precision, ind);
				Thread t = new Thread(r);
				tr[i] = t;
				t.start();
			}
			Apfloat sum = new Apfloat("0", precision);
			for(int i = 0; i < thread_count; i++) {
				if (j + i >= blocks) {
					break;
				}
				try {	
					tr[i].join();	
					sum = sum.add(result[i]);
				} catch (InterruptedException e) {}
			}
			totalsum = totalsum.add(sum);
		}	

		
		long time = System.currentTimeMillis() - st;
		System.out.println("Execution time: " + time);
		
		//System.out.println("result: " + (totalsum.divide(new Apfloat(thread_count, precision))));
		if (flag == 1) {
			System.out.println("result: " + totalsum);
		}
		
		res = new Results(totalsum, time);
		
		return res;
		
	}
	public static void main(String[] args)
	{
		if (args.length < 3)
		{
			System.out.println("TaskRunner <num of elements> <num of threads>");
			System.exit(1);
		}

		int precision = new Integer(args[0]);
		int thread_count = new Integer(args[1]);
		int flag = new Integer(args[2]);
		
		myRunner(precision, thread_count, flag);

		
	}

}
