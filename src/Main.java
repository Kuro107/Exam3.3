import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        TennisBall tennisBall = new TennisBall();
        Folder folder = new Folder();
        Book book = new Book();
        BottleOfWater bottleOfWater = new BottleOfWater();
        CocaCola cocaCola = new CocaCola();

        ArrayList<Items> backPack1 = new ArrayList<>();
        ArrayList<Items> backPack2 = new ArrayList<>();
        ArrayList<Items> backPack3 = new ArrayList<>();

        backPack1.add(book);
        backPack1.add(cocaCola);
        for (int i = 0; i < 20; i++) {
            backPack1.add(apple);
        }

        backPack2.add(folder);
        backPack2.add(bottleOfWater);
        for(int i = 0; i < 50; i++){
            backPack2.add(tennisBall);
        }

        backPack3.add(tennisBall);
        backPack3.add(tennisBall);
        backPack3.add(tennisBall);
        backPack3.add(folder);
        backPack3.add(cocaCola);
        for (int i = 0; i < 10; i++){
            backPack3.add(apple);
        }

    }
}
