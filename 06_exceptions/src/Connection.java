
/**
 * 
 * @author Fernando
 * @version 1.0
 *
 */

public class Connection implements AutoCloseable {

	// constructor
	public Connection() {
		System.out.println("starting connection ");
		// throw new IllegalStateException();
	}

	public void readData() {
		System.out.println("reading data ");
		throw new IllegalStateException();
	}

//	public void closeConnection() {
//		System.out.println("closing connection");
//	}

	@Override
	public void close() {
		System.out.println("closing connection");

	}

}
