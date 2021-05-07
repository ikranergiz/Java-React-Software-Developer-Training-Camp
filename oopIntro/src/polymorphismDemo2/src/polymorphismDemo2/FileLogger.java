package polymorphismDemo2;

public class FileLogger extends BaseLogger{
    public void log(String message){
        System.out.println("file logger " + message);
    }
}
