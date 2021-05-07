package overriding;

public class OgrenciCrediManager extends BaseCrediManager{
    public double hesapla(double tutar){
        return tutar * 1.10;
    }
}
