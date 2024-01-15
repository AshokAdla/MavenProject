package week3.day2.HomeAssignments;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {

	public void connect() {
		System.out.println("Connect method implementation");
		
	}

	public void disconnect() {
		System.out.println("Disconnect method implementation");
		
	}

	public void executeUpdate() {
		System.out.println("execute update method implementation");
		
	}
	
	public static void main(String[] args) {
		JavaConnection obj=new JavaConnection();
		obj.connect();
		obj.disconnect();
		obj.executeUpdate();
		obj.executeQuery();
	}

}
