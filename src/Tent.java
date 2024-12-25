
public class Tent implements Craft{
    String material = "3 палки и 2 листа";

    @Override
    public String getMaterial() {
        if (!material.isEmpty()){
            return material;
        } else {
            return Craft.default_material;
        }
    }
    @Override
    public void setMaterial(String material) {
        this.material = material;
    }



    public void buildTent(Robinzon robinzon,Island island){
        if (robinzon.intellectLevel < 50) {
            throw new DontHave("Робинзон не может построить палатку ему не хватает ума");
        }
        if (!island.hasObject(new Forest())) {
            throw new DontHave("На острове нет леса — нет палок и листьев для постройки!");
        }
        if (robinzon.inventory.getOrDefault("sticks", 0) < 5 || robinzon.inventory.getOrDefault("leaves", 0) < 3) {
            throw new DontHave("Недостаточно палок или листьев для постройки палатки!");
        }
        // Успешное строительство палатки
        robinzon.inventory.put("sticks", robinzon.inventory.get("sticks") - 5);
        robinzon.inventory.put("leaves", robinzon.inventory.get("leaves") - 3);
        System.out.println("Часа через два за наружной оградой, между ней и рощей, у нас красовалась чудесная парусиновая палатка!");
        island.addObject(new Tent());
    }
    @Override
    public String toString(){
        return "Палатка";
    }
    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        return true;
    }
}
