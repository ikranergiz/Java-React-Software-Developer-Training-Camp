package polymorphismDemo2;

public class Main {

    public static void main(String[] args) {
        // write your code here
//        BaseLogger[] baseLoggers = new BaseLogger[]{new EmailLogger(),new DatabaseLogger(), new FileLogger(),new ConsolLogger()};
//        for(BaseLogger baseLogger : baseLoggers) {
//            baseLogger.log("Log mesajı");
//        }
        CustomerManager customerManager = new CustomerManager(new FileLogger());
        customerManager.add();
    }
}


