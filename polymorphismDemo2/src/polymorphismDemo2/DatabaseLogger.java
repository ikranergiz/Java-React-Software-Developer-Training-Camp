package polymorphismDemo2;

public class DatabaseLogger extends BaseLogger{
    public void log(String message){
        System.out.println("logged to databse " + message);
    }
}
