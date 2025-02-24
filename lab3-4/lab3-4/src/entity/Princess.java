package entity;

import exception.InvalidActionException;

public class Princess extends Person implements Dressable {
    private Outfit currentOutfit;

    public Princess(String name) {
        super(name, Disposition.KIND);
        this.currentOutfit = null;
    }

    public void setOutfit(Outfit outfit) {
        this.currentOutfit = outfit;
        if (outfit == null) {
            System.out.println(name + " утратила свой наряд.");
        } else {
            System.out.println(name + " надевает " + outfit);
        }
    }

    @Override
    public void wearOutfit(Outfit outfit) throws InvalidActionException {
        if (outfit == null) {
            throw new InvalidActionException(name + " не может надеть несуществующий наряд.");
        }
        this.currentOutfit = outfit;
        System.out.println(name + " теперь носит " + outfit);
    }

    public void hide() {
        System.out.println(name + " прячется в самом темном углу.");
    }

    @Override
    public void act() {
        if (currentOutfit == null) {
            System.out.println(name + " идет без наряда.");
        } else {
            System.out.println(name + " выглядит элегантно в своем наряде.");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Princess)) return false;
        Princess that = (Princess) o;
        return (currentOutfit == null && that.currentOutfit == null) ||
                (currentOutfit != null && currentOutfit.equals(that.currentOutfit));
    }

    @Override
    public int hashCode() {
        return super.hashCode() + (currentOutfit == null ? 0 : currentOutfit.hashCode());
    }

    @Override
    public String toString() {
        return "entity.Princess{" +
                "name='" + name + '\'' +
                ", currentOutfit=" + currentOutfit +
                '}';
    }
}
