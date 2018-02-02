/**
 * 
 */
package UnitTests;
import static org.junit.Assert.*;
public class HiloDelay implements Runnable {
	private Monitor.Cola cola;
	private boolean flag;
	
	public HiloDelay(Monitor.Cola cola){
		this.cola=cola;
		flag=false;
	}
	
	public boolean getFlag(){
		return flag;
	}
	
	@Override
	public void run(){
		try{
			cola.delay();
			System.out.println("Sal� del wait");
		}
		catch(InterruptedException e){
			fail("Se gener� error por interrupci�n de thread");
		}
		flag=true;	
	}

}
