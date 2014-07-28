public class Test {
	public static void main(String[] args) {
		int thread_count = 7;
		int blocks = 10;
		int step = 100;
		
		
		for (int j = 0; j < blocks ; j += thread_count) {
			for (int i = 0; i < thread_count; ++i) {
				if (i + j >= blocks) {
					break;
				}
				System.out.println("Thread " + i + " : " + (1 + ((i+j)*step)) + " - " + (((i+j)*step + step)));
			}
		}
	}
}