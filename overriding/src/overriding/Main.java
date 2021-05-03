package overriding;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BaseCrediManager[] baseCrediManagers = new BaseCrediManager[]
                {new TarımCrediManager(), new TeacherCrediManager(),
                new OgrenciCrediManager()};

        for (BaseCrediManager baseCrediManager : baseCrediManagers) {
            System.out.println(baseCrediManager.hesapla(1000));
        }


    }
}

