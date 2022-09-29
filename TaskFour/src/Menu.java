import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public ArrayList<String> options = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Menu(ArrayList<String> actions){
        options.add(String.valueOf(actions));
    }

    public void showMenu(){
        System.out.println("Type a number to choose");
        System.out.println(options);
        String Choice = scan.nextLine();
        System.out.println(Choice);

    }

}
