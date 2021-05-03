package abstractClasses;

public abstract class GameCalculator {
    public abstract void hesapla();
    /*public void hesapla(){
        System.out.println("puanınız 100: ");
    }/*/
    public final void gameOver(){
        System.out.println("Oyun bitti! ");
    }

}
/**
 * hep hesaplama var içeriği değişse de
 * akla hemen base class gelsin
 *hesaplama kullanıcı tipine göre değişiklik gösteriyor
 *
 * önemli!
 * defaultu olmasın hesaplanın
 * gameover override edilemez (final keyword)
 * bunu böyle kullanmak zorunda
 *
 * hesapla kim inherit ediyorsa hesaplayı içermek
 * zorunda FAKAT hesaplayı override etmek zorunda!!
 * kullanıcı türünde override etmeli
 *
 * birden fazla operasyonum var içerisini base de değil
 * kim inherit ediyorsa o yapsın istiyorum
 *
 * abstract class da methodların hepsi abstract olmak
 * zorunda değil
 *
 * base i gizlemek için abstract classlar kullanılır
 *abstract sınıflar newlenemez
 * tek başına kullanılamaz
 *GameCalculator gameCalculator = new GameCalculator();
 * olmaz
 *
 * GameCalculator gameCalculator = new WomanGameCalculator();
 * olur referansını tutabilir
 *
 * polymorphik yapı güzel
 * yeni özellik eklenince class oluşturuyoruz OlderGameCalculator
 *
 *Base tek başına anlamı yok sadece referans tutucu
 *herkesin içini ayrı ayrı doldurması gereken özellikler
 * yazıyoruz base class a
 */
