package polymorphismDemo2;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger){
        this.logger = logger;
    }
    public void add(){
        System.out.println("Müşteri eklendi");
        //ya kaldırılırsa ?
        //DatabaseLogger databaseLogger = new DatabaseLogger();
        this.logger.log("log mesaji");
    }
}
