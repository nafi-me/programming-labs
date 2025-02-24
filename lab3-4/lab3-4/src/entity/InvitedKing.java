package entity;

public class InvitedKing extends King {
    public InvitedKing(String name) {
        super(name);
        // Приглашённый король может обладать нейтральным характером
        this.disposition = Disposition.NEUTRAL;
    }

    @Override
    public void act() {
        System.out.println(name + " прибывает во дворец с величественным видом.");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && (o instanceof InvitedKing);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "entity.InvitedKing{" +
                "name='" + name + '\'' +
                ", disposition=" + disposition +
                '}';
    }
}
