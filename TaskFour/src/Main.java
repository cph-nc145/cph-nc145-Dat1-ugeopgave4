import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actions = new ArrayList<>(10);
        actions.add("1) Start game");
        actions.add("2) Resume game");
        actions.add("3) Pause game");
        actions.add("4) End game");
        System.out.println("Hello world!");
        System.out.print(actions.get(1));
        Menu Menutest = new Menu(actions);
        Menutest.showMenu();
    }
}