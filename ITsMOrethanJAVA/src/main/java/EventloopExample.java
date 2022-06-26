import io.activej.eventloop.Eventloop;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import static java.lang.System.currentTimeMillis;

public final class EventloopExample {
	private List<MyEventListener> eventListeners = new LinkedList<>();

	public void addEventListener(MyEventListener eventListener) {
		eventListeners.add(eventListener);
	}

	public void notifyEventListener(MyEvent event) {
		for (MyEventListener eventListener : eventListeners) {
			eventListener.processEvent(event);
		}
	}

	public static void main(String[] args) {
		EventloopExample example = new EventloopExample();
		Eventloop eventloop = Eventloop.create().withCurrentThread();
		long startTime = currentTimeMillis();
		Stepan stepa = new Stepan();
		Obstacles obst1 = new Obstacles(5, 5);
		Obstacles obst2 = new Obstacles(10, 10);
		Obstacles obst3 = new Obstacles(20, 20);
		List<Obstacles> obst = new LinkedList<>();
		obst.add(obst1);
		obst.add(obst2);
		obst.add(obst3);
		Timer timer = new Timer();
		for (Obstacles obstacles : obst) {
			timer.schedule(new TimerTask() {
				@Override
				public void run() {
					stepa.run(obst);
					if (stepa.checkObstByX(obst) && stepa.checkObstByY(obst)) {
						example.addEventListener(new MyEventListener() {
							@Override
							public void processEvent(MyEvent event) {
								eventloop.post(EventloopExample::bump);
							}
						});
					}
					System.out.println("x: " + stepa.robot.getX() + " y:" + stepa.robot.getY());
				}
			}, 0, 1000);
		}

		example.notifyEventListener(new MyEvent(example, MyEvent.Type.BUMP));

		eventloop.run();
	}

	public static void bump(){
		System.out.println("Стёпа врезался");
	}

	public static void ride(){
		System.out.println("Стёпа едет");
	}
}
