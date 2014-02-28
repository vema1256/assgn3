public class Brute {
	public static void main(String[] args) {
        String fnm = args[0];
        StdOut.printf("File Name ---%s\n", fnm);
        In exp1 = new In(fnm);
         
        int[] xx  = exp1.readAllInts();
        Points
        for( int i=0; i< xx.length; i++) {
        	StdOut.printf("i %d ---%d\n", i, xx[i]);
        }
  	}
}
