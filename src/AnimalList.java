import java.util.ArrayList;
import java.util.List;

public class AnimalList {

    protected List<Animals> sumList = new ArrayList<>();

    public AnimalList () {

        Dog Sixten = new Dog ("Sixten", 5000);
        Dog Dogge = new Dog ("Dogge", 10000);

        Cat Venus = new Cat ("Venus", 5000);
        Cat Ove = new Cat ("Ove", 3000);

        Snake Hypno = new Snake("Hypno", 1000);

        sumList.add(Sixten);
        sumList.add(Dogge);
        sumList.add(Venus);
        sumList.add(Ove);
        sumList.add(Hypno);
    }

    public Animals whatAnimal (String name) {

        Animals fromWhatAnimal = null;
        for (Animals animals : sumList) {
            if (name.trim().toLowerCase().equals(animals.getName().toLowerCase())) {
                fromWhatAnimal = animals;
                break;
            }
        }
        return fromWhatAnimal;
    }
}
