package week3.day2.HomeAssignments;

public interface DatabaseConnection {
	public abstract void connect();
	public abstract void disconnect();
	public abstract void executeUpdate();

}
