public class Stretcher implements Craft{
    String material = "2 палки и 3 листа";

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

    public void buildStretcher(Robinzon robinzon,Island island) throws NotSmart {
        if (robinzon.intellectLevel < 20){
            throw new NotSmart(robinzon.name," носилки ");
        }
        if (!island.hasObject(new Forest())) {
            throw new NotSmart(robinzon.name,": На острове нет леса — нет палок и листьев для создания!");
        }
        if (robinzon.inventory.getOrDefault("sticks", 0) < 2 || robinzon.inventory.getOrDefault("leaves", 0) < 5) {
            throw new NotSmart(robinzon.name,": Недостаточно палок или листьев для постройки палатки!");
        }
        robinzon.inventory.put("sticks", robinzon.inventory.get("sticks") - 2);
        robinzon.inventory.put("leaves", robinzon.inventory.get("leaves") - 5);
        System.out.println("Робинзон на скорую руку сколотил носилки!");
        island.addObject(new Stretcher());

    }




    @Override
    public String toString(){
        return "Носилки";
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

