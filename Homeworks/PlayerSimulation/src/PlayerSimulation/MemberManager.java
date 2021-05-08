package PlayerSimulation;

public class MemberManager implements MemberService{

    private CheckService checkService;

    public MemberManager(CheckService checkService) {
        this.checkService = checkService;
    }

    @Override
    public void add(Member member) {
        if(this.checkService.checkIfRealPerson(member)){
            System.out.println("added new member : " + member.getFirstName() + " " + member.getLastName());
        }
        else{
            System.out.println("not a valid person");
        }

    }

    @Override
    public void change(Member member) {
        System.out.println("Your information has been updated! ");

    }

    @Override
    public void delete(Member member) {
        System.out.println("Your membership has been deleted! ");
    }
}
