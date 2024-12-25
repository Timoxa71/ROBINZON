import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;


public class Main {
    static class InClass{
        void showMessage() {
            System.out.println("Это внутренний");
        }
    }
    public static void main(String[] args) {

        class LocalClass {
            void showMessage() {
                System.out.println("Это локальный");
            }
        }


        LocalClass anonymous = new LocalClass() {
            @Override
            public String toString() {
                return "Анон";
            }
        };



        Island island = new Island();
        Forest forest = new Forest();
        island.addObject(new Fortress());
        island.addObject(forest);
        System.out.println(island.getMapObjects());

//        island.getMapObjects().getFirst().material();
//
//
        Map<String, Integer> initialInventory = new HashMap<>();
        initialInventory.put("sticks", 100);
        initialInventory.put("leaves", 100);
        Robinzon robinzon = new Robinzon("Робинзон", Religion.PROTESTANT, 60, initialInventory);
        Friday friday = new Friday();
        island.addBeing(friday);
        island.addBeing(robinzon);

        Slaves farther = new Slaves("Отец", Religion.PAGAN);
        Slaves spaniard = new Slaves("Испанец", Religion.PROTESTANT);

        try {
            robinzon.buildStretcher(island);
        } catch (NotSmart e) {
            System.out.println("Ошибка: " + e.getMessage());
        }


        try {
            robinzon.saveLife(farther, island);
        } catch (Exception e) {
            System.out.println("Ошибка " + e.getMessage());
        }


        try {
            robinzon.saveLife(spaniard, island);
        } catch (Exception e) {
            System.out.println("Ошибка " + e.getMessage());
        }


        try {
            robinzon.buildTent(island);
        } catch (DontHave e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

//        island.getMapObjects().get(3).material();

        robinzon.say(island);

        System.out.println(friday);
        friday.performRole();

        System.out.println(farther);
        System.out.println(spaniard);


//
//        System.out.println(island.hasBeing(new Robinzon()));
//
//        try {
//            robinzon.buildTent();
//        }catch (Exception e){
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//
//        System.out.println(island.getMapObjects());
//
//        System.out.println(robinzon);
//
//        try {
//            robinzon.buildStretcher();
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//
//
//        System.out.println(island.getMapObjects());
//
////        island.getMapObjects().get(4).material();
//
//        System.out.println(island.hasObject(new Stretcher()));
//
//        Slaves farther = new Slaves("Farther",Religion.CATHOLIC);
//
//
//        try {
//            robinzon.saveLife(farther);
//        }catch (Exception e){
//            System.out.println("Ошибка: " + e.getMessage());
//
//        }
//        System.out.println(island.getBeing());
//        robinzon.say();


//        Island island = new Island();
////        island.addObject("Крепость");
//        island.addObject(new Forest());
//        System.out.println(island.getMapObjects());
//
//
//
//
//        Map<String, Integer> initialInventory = new HashMap<>();
//
//
//        initialInventory.put("sticks",100);
//        initialInventory.put("leaves",100);
//        Robinzon robinzon = new Robinzon("Робинзон",Religion.PROTESTANT,60,initialInventory,island);
//        System.out.println(island.hasBeing(robinzon));
//
//        island.addBeing(robinzon);
//        System.out.println(island.hasBeing(robinzon));
//        System.out.println(island.getBeing());
//
//
//
//        try {
//            robinzon.buildTent();
//        } catch (Exception e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        }
//
//
//
//
//
//
//
//        try {
//            island.getMapObjects().get(2).material();
//        }catch (Exception e) {
//            System.out.println("Ошибка, на острове отсутвует данный объект");
//        }
//
//
//
//        robinzon.performRole();
//        System.out.println(robinzon);

    }


}