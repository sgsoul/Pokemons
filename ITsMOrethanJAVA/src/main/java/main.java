import io.activej.eventloop.Eventloop;

public class main {
    public static void main(String[] args) {
		Eventloop eventloop = Eventloop.create();

		eventloop.post(() -> System.out.print("интересная штука"));

		eventloop.run();
	}
}
