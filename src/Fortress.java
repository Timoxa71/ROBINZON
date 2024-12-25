public class Fortress implements Craft{
    String material = "камень";

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

    @Override
    public String toString(){
        return "Каменная крепость";
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
