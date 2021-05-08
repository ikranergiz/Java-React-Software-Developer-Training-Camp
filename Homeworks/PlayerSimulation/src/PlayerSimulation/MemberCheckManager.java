package PlayerSimulation;

public class MemberCheckManager implements CheckService {
    /*manuel olarak kontrol ediyoruz.Mernis gibi değil.Mernis classı için de oluşturabiliriz*/

    @Override
    public boolean checkIfRealPerson(Member member) {
        return true;
    }
}
