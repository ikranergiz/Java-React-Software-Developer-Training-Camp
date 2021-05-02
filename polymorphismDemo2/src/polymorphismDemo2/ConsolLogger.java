package polymorphismDemo2;

public class ConsolLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Logged to consol :  " + message);
    }
}
