
public class TestConnection {

	public static void main(String[] args) {

		// implements AutoCloseable
		try (Connection connection = new Connection()) {
			connection.readData();
		} catch (IllegalStateException e) {
			System.out.println("Error: " + e.getMessage());
		}

//		Connection connection = null;
//
//		try {
//			// open connection
//			connection = new Connection();
//			// read data
//			connection.readData();
//		} catch (IllegalStateException e) {
//			// get error
//			System.out.println("Error: " + e.getMessage());
//		} finally {
//			// close connection
//			connection.close();
//		}

	}

}
