package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		/*EmailLogger emailLogger=new EmailLogger();
		emailLogger.log("Log mesajý");
		
		BaseLogger[] loggers=new BaseLogger[] {	new FileLogger(),new DatabaseLogger(),new ConsoleLogger()};

		for(BaseLogger logger: loggers) {
			logger.log("Log mesajý");
		}*/
		
		CustomerManager customerManager=new CustomerManager(new DatabaseLogger ());
		customerManager.add();
		
		
		
		
			
		}
}
