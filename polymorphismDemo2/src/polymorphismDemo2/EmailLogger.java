package polymorphismDemo2;

public class EmailLogger extends BaseLogger{
    public void log(String message){
        System.out.println("email logger " + message);
    }
}
