//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.awt.*;
import java.util.ArrayList;
import java.util.*;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ArrayListExercise {
    static void searchColor(String colors, ArrayList<String> Colors) {
        for (int j = 0; j < Colors.size(); j++) {
            if (colors.equals(Colors.get(j))) {
                System.out.println("found");
            }

        }
    }

    static void removeDuplicate(ArrayList<String> Colors) {
        for (int i = 0; i < Colors.size(); i++) {
            for (int j = i + 1; j < Colors.size(); j++) {
                if (Colors.get(i).equals(Colors.get(j))) {
                    Colors.remove(j);

                }
            }
        }
        System.out.println(Colors);
    }

    public static void main(String[] args) {
        ArrayList<String> Colors = new ArrayList<>();
        Colors.add("Black");
        Colors.add("White");
        Colors.add("Yellow");
        Colors.add("Purple");
        Colors.add("Purple");
        Colors.add("Yellow");
        for (int i = 0; i < Colors.size(); i++) {
            System.out.println(Colors.get(i));
        }
        Colors.set(2, "Red");
        Colors.remove(1);
        System.out.println(Colors);

        ArrayListExercise.searchColor("Purple", Colors);
        ArrayListExercise.removeDuplicate(Colors);

    }
}
