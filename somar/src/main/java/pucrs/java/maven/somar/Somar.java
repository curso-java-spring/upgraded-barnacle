package pucrs.java.maven.somar;

/**
 * 
 * @author Marco Mangan
 */
public class Somar 
{
	/**
	 * 
	 * @param args
	 */
    public static void main( String[] args )
    {
    	int a = 10;
    	int b = 20;
        System.out.println( somar(a, b) );
    }

    /**
     * 
     * @param a
     * @param b
     * @return
     */
	static int somar(int a, int b) {
		return a + b;
	}
}
