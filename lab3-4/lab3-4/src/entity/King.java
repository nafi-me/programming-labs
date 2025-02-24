package entity;

public class King extends Person {
    public King(String name) {
        super(name, Disposition.KIND);
    }

    // Метод для приглашения другого короля
    public void inviteKing(Person otherKing) {
        System.out.println(name + " приглашает " + otherKing.getName() + " во дворец.");
    }

    @Override
    public void act() {
        System.out.println(name + " занимается королевскими делами.");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && (o instanceof King);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "entity.King{" +
                "name='" + name + '\'' +
                ", disposition=" + disposition +
                '}';
    }
}
