
public class CreateManager {

	public static void main(String[] args) {
		
		Manager manager = new Manager();
		
		// inherited from the employee
		manager.setName("Jose");
		manager.setCpf("14785236912");
		manager.setWage(6000.0);
		
		// inherited from the manager
		manager.setPassword(1234);
		
		boolean auth = manager.auth(1234);
		
		System.out.println(manager.getName());
		System.out.println(manager.getCpf());
		System.out.println(manager.getWage());
		System.out.println(manager.getBonus());
		System.out.println(auth);

	}

}
