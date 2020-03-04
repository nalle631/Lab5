import java.util.LinkedList;

/**
 * @author Lana Abdulla, lanabd-9
 *
 */

public class EventQueue {
	private LinkedList<Event> queue;

	public Event next() {
		return queue.poll();
	}

	public void sortQueue() {
		// kankse behövs ej då ad dmetod
	}

	public void addEvent(Event e) {
		if (queue.size() == 0) {
			queue.add(e);
		} else {
			for (int i = 0; queue.size() > i; i++) {
				// händelsestyrd så att det lägger sig rätt och inte längst bak
				// för alla evemt har en specifik tid för sin händelse.
				// if satsen checkar ifall eventet som den går igenpm och dess
				// tid är mindre eller större än dess egna planerade tid.
				// checkar ett event mot ett annat så att den passar in i
				// tidslinjen. gettime returnerar tiden för eventet
				if (queue.get(i).getTime() > e.getTime()) {
					queue.add(i, e);// e i indexet
				}

			}
		}
	}
}
