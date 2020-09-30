import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        AnimalList animalList = new AnimalList();

        String input = JOptionPane.showInputDialog("Vem ska få mat?");

        while (true) {

            if (input == null) {
                System.exit(1);
            }

            Animals animals = animalList.whatAnimal(input);
            if (animals != null) {
                JOptionPane.showMessageDialog(null, "Du ska mata " + animals.getName()
                        + " med " + animals.getFoodAmount() + "gram " + animals.getCorrectFood().toString()
                        .toLowerCase());
                break;
            } else {
                input = JOptionPane.showInputDialog("Skriv in namnen korrekt");
            }


        }
    }

}