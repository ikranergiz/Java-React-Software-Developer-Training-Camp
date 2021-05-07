package abstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veriniz getirildi: MySql");
    }
}
/*interface class değil ama classlar gibi referans tutabilir
* */