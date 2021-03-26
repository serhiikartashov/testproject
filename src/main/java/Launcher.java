import model.Advocate;
import service.AdvocateService;

public class Launcher {

    public static void main(String[] args) {
        AdvocateService advocateService = new AdvocateService();
        Advocate advocate = advocateService.hireAdvocate();
        System.out.println(advocate);
    }
}
