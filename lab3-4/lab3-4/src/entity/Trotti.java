package entity;

import exception.InvalidActionException;

public class Trotti extends Person implements Dressable {
    private Outfit currentOutfit;

    public Trotti(String name) {
        super(name, Disposition.NEUTRAL);
        this.currentOutfit = null;
    }

    @Override
    public void wearOutfit(Outfit outfit) throws InvalidActionException {
        if (outfit == null) {
            throw new InvalidActionException(name + " не может надеть пустой наряд.");
        }
        this.currentOutfit = outfit;
        System.out.println(name + " надевает новый наряд: " + outfit);
    }

    @Override
    public void act() {
        if (currentOutfit == null) {
            System.out.println(name + " идет без нового наряда.");
        } else {
            System.out.println(name + " демонстрирует свой новый наряд.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Trotti)) return false;
        Trotti other = (Trotti) o;
        return (currentOutfit == null && other.currentOutfit == null) ||
                (currentOutfit != null && currentOutfit.equals(other.currentOutfit));
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (currentOutfit == null ? 0 : currentOutfit.hashCode());
    }

    @Override
    public String toString() {
        return "entity.Trotti{" +
                "name='" + name + '\'' +
                ", currentOutfit=" + currentOutfit +
                '}';
    }
}
