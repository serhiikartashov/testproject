package classes;

import model.Advocate;
import model.Box;
import model.Citizen;

public class Runner {
    public static void main(String[] args) {
        Advocate advocate = new Advocate();
        advocate.setName("Andrii");
        advocate.setSurname("Goloborodko");
        advocate.setAge(53);
        advocate.setMarried(false);
        advocate.setAddress("Ukraine");

        Citizen user2 = new Advocate("938498349", "Andrii", "Goloborodko");
//        user2.setId("92939393");
        if (user2 instanceof Advocate){
            ((Advocate)user2).setAge(76);
        }

        System.out.println(new Box(3.2, 4.4));
        String cityOfUkraine = Citizen.CITY_OF_UKRAINE;
    }
}
