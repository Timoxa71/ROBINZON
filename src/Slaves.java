public class Slaves extends Human{
    public Slaves(String name, Religion religion){
        super(name,religion);

    }
    @Override
    public void performRole() {
        System.out.println("Спасибо за спасение Робинзон! Наш владыка!");
    }
}
