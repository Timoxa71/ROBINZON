import java.util.*;

public class Robinzon extends Human{
    protected int intellectLevel;
    protected Map<String, Integer> inventory;

    public Robinzon(){
        super("Робинзон",Religion.PROTESTANT);

        this.intellectLevel = 60;
        this.inventory = new HashMap<>();
    }

    public Robinzon(String name, Religion religion, int intellectLevel, Map<String, Integer> inventory){
        super(name,religion);
        this.intellectLevel = intellectLevel;
        this.inventory = inventory;
    }


    public void saveLife(Slaves slaves,Island island)throws Exception{
        if (!island.hasObject(new Stretcher())) {
            throw new Exception("На острове нет носилок сначало создайте носилки!");
        }
        if (intellectLevel < 30){
            throw new Exception("Робинзон недостаточно умен, чтобы открыть варота крепости!");
        }
        if (!island.hasBeing(new Friday())){
            throw new Exception("У Робинзона нет помошника!");
        }

        System.out.println("Робинзон с Пятницей доставили больных к наружной стене крепости и Перетащили двух взрослых людей через высокую ограду благодоря уму Робинзона " + slaves.name + " выжил");
        island.addBeing(slaves);

    }


    public void buildStretcher(Island island) throws NotSmart {
        Stretcher stretcher = new Stretcher();
        stretcher.buildStretcher(this,island);
    }

    public void buildTent(Island island){
        Tent tent = new Tent();
        tent.buildTent(this,island);
    }
    public void say(Island island){
        if (island.getBeing().size() > 2){
            System.out.println("Я счасливый король своих владений у меня целых "+(island.getBeing().size()-1)+" раба, "+ TextR.TheGoodKing);
        }else{
            System.out.println(TextR.TheBadKing);
        }
    }

    @Override
    public void performRole() {
        System.out.println(name + " is managing his island as a king.");
    }


    @Override
    public String toString() {
        return "Name: " + name + ", Religion: " + religion + ", inventory: " + inventory + ", intellect: " + intellectLevel;
    }



}
