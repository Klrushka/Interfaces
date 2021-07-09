package task7.Rodent;
import java.util.Random;

public class RandomRodentGenerator {
    public Rodent gen() {
        Random random = new Random();
        switch (random.nextInt(3)) {
            default:
            case 0:
                return new Mouse();
            case 1:
                return new Gerbil();
            case 2:
                return new Hamster();
        }
    }
}
