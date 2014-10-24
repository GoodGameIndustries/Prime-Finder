import java.util.ArrayList;

/**
 * 
 */

/**
 * @author Emmett Deen
 * @version 1.0
 * @date Oct 23, 2014
 */
public class DTP {

	private static ArrayList<Integer> primes = new ArrayList<Integer>();
	private static int total = 2;
	////////////////////////////////////////////////*how many primes?
													private static int primeN = 1000;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		primes.add(2);
		System.out.println(primes.get(0));
		primes.add(3);
		System.out.println(primes.get(1));
		
		int i =1;
		while(total<primeN){
			int last = primes.size();
			boolean tempP = isPrime((6*i)+1);
			boolean tempN = isPrime((6*i)-1);
			
			if(tempN){primes.add((6*i)-1);System.out.println(primes.get(primes.size()-1));total++;}
			
			if(tempP){primes.add((6*i)+1);System.out.println(primes.get(primes.size()-1));total++;}
			
			i++;
			
		}
		System.out.println(total+" primes have been generated");
	}

	private static boolean isPrime(int n){
		boolean result =true;
		for(int j=0; j<primes.size(); j++){
			if(j>0){
				if(primes.get(j)>(n/primes.get(j-1))){break;}
			}
			if(n%primes.get(j)==0){
				 result= false;
			}
			
		}
		return result;
		
	}
	
}
