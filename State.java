import java.util.Observable;

/**
 * @author Lana Abdulla, lanabd-9
 * Klassen State håller på statusen på simuleringen , varje förändring
 * som sker och när view ändras och uppdateras
 */


public class State extends Observable {
	int CustomInStore = 0;//customers i butiken just nu
	int totCustomOpen = 0; //totalt för dagen
	int payedCustom = 0;
	int missedCustom = 0;
	
	double totTimeInQueue = 0;
	int lengthOfQueue = 0;
	double totTimeCheckout = 0;
	double freeTimeCheckout = 0;
	
	
	
	public final int maxCustomInStore;
	public int maxCheckouts;
	public double closingTime;
	//public FIFO checkoutQueue;
	
	/**
	 * Constructor
	 * @param maxCustomInStore
	 * @param maxCheckouts
	 * @param closingTime
	 * @param freeTimeCheckout
	 */
	public State(int maxCustomInStore, int maxCheckouts, double closingTime, double freeTimeCheckout) {
		this.maxCustomInStore = maxCustomInStore;
		this.maxCheckouts = maxCheckouts;
		this.closingTime = closingTime;
		this.freeTimeCheckout = freeTimeCheckout;
		//checkoutQueue = new FIFO (this);//Skapa FIFO klass?	  
	}
	
	
	private boolean activeSim;
	private long timePassed;
	
	
	public long getTimePassed() {
		return this.timePassed;
	}
	
	public boolean stop() {
		activeSim = false;
		return activeSim;
	}
	
	//public State() {//returna tillståndet just nu?
		
		//checka om butiken är full
		//
		
	}

