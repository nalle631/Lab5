/**
 * 
 */

/**
 * @author Malte Olofsson, olomal-8
 *
 */
import java.util.Observable;

public class State extends Observable {
	private boolean activeSim;
	private long timePassed;
	private Event currentEvent;
	
	/**
	 * Constructor
	 * @param maxCustomInStore
	 * @param maxCheckouts
	 * @param closingTime
	 * @param freeTimeCheckout
	 */
	public State() {
		
		this.activeSim = true;
		  
	}
	
	
	
	
	
	public long getTimePassed() {
		return this.timePassed;
	}
	public boolean getActiveSim(){
		return activeSim;
	}
	
	
	public void stop() {
		activeSim = false;
		
	}





	public Event getCurrentEvent() {
		return currentEvent;
	}





	public void setCurrentEvent(Event currentEvent) {
		this.currentEvent = currentEvent;
		setChanged();
		notifyObservers();
	}
	
	//public State() {//returna tillståndet just nu?
		
		//checka om butiken är full
		//
		
	}
