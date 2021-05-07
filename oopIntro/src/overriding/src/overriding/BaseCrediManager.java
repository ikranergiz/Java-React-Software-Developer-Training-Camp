package overriding;

public class BaseCrediManager {
    //public den sonra final dersek override edemezz!!
    //olduğu gibi kullanmak zorundasın!
    public double hesapla(double tutar){
        return tutar * 1.18;
    }
}
/**
 * abstract class
 * normal class lar gibi kuralları var
 * tek miras
 *
 */
