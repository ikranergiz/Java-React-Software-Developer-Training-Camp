package PlayerSimulation;

public class Main {

    public static void main(String[] args) {

        Game left4Dead = new Game("Left 4 Dead",29.99,0.20);
        Game rocketLeague = new Game("Rocket League",86.99,0.10);

	    Player ikra = new Player("Ikra","Nergiz","1234",2001,rocketLeague,200);
		Player emir = new Player("Emir","Nergiz","5678",2009,left4Dead,40);

	    MemberManager memberManager1 = new PlayerManager(new MemberCheckManager());
	    memberManager1.add(ikra);

		MemberManager memberManager2 = new PlayerManager(new MemberCheckManager());
		memberManager2.add(emir);

	    SalesManager salesManager = new SalesManager(left4Dead);
	    salesManager.buyGame(ikra);

	    CampaignManager campaignManager = new CampaignManager(left4Dead);
	    campaignManager.add();

	    System.out.println("---------------------------------------------------");
	    salesManager.buyGame(emir);

    }
}
//checkservice newlenemez . bu interface i implement eden classı newle.
//bana check edebileceğim bir şey ver
//çünkü member manager member ileilgli işlemler yapıyor.
//member ekle gibi. ama eklerken gerçekten bir insan mı diye bakmak gerekiyor
//bu yüzden interface yazdım checkService diye
//bu interface i memberCHECKmanager da yazdım
//ama member managerda kullanmak istiyorum doğrulamayı
//membermanager da gidipte checkService interface newlenemez
//memberCHECKmanager i newlesem buna sıkı sıkı bağlı olurum
//bu yüzden şöyle yapıyoruz
//member manager kesinlikle bir doğrulamaya ihityaç duyduğu için
//interface imi private olarak yazıyorum ve constructor yazıyorum
//main de new ile bu interface i inherit eden classları veriyorum
//doğrulama olsun ama tek bir doğrulamaya bağlı olmasın
//belki sonrada doğrulamayı başka bir class ister
//yapılacak tek şey isteyen class a private interface i yazmak
//böylece tightly bağlı olacağım


//member abstract class yaptım kullanmayacağım için. Böylece base gizli kaldı. ama inherit olan classların referansını
//tutabiliyor
	    /*Member member = new Player("Ala","Nergiz","1234",1998,game1,40);
	    System.out.println(member.getFirstName());*/
