
public class Connection {

	// constructor
	public Connection() {
		System.out.println("starting connection ");
	}

	public void readData() {
		System.out.println("reading data ");
		throw new IllegalStateException();
	}

	public void closeConnection() {
		System.out.println("closing connection");
	}

}
