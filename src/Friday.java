public class Friday extends Human{
    public Friday(){
        super("Пятница",Religion.PROTESTANT);

    }
    @Override
    public void performRole() {
        System.out.println("Я помошник Робинзона, Сыыыыыы! слава нашему острову");
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
