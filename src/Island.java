import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Island {
    private ArrayList<Craft> mapObjects;
    private ArrayList<Human> being;

    public Island() {
        this.mapObjects = new ArrayList<>();
        this.being = new ArrayList<>();
        System.out.println("Остров создан");
    }
    public void addBeing(Human b){
        being.add(b);
        System.out.println("Сущность " + b + " добавлена на остров.");
    }

    public boolean hasBeing(Human object) {
        return being.contains(object);
    }
    public List<Human> getBeing() {
        return being;
    }



    public void addObject(Craft object){
        mapObjects.add(object);
        System.out.println(object + " добавлен(а) на остров.");
    }

    public boolean hasObject(Craft object) {
        return mapObjects.contains(object);
    }


    public ArrayList<Craft> getMapObjects() {
        return mapObjects;
    }


}
