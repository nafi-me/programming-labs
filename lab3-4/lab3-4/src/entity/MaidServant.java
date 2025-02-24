package entity;

import exception.InvalidActionException;

public class MaidServant extends Person {
    public MaidServant(String name) {
        super(name, Disposition.CRUEL);
    }

    // Метод, разрушающий наряд принцессы
    public void ruinOutfit(Princess princess) throws InvalidActionException {
        if (princess == null) {
            throw new InvalidActionException("Нет принцессы для порчи нарядов.");
        }
        System.out.println(name + " обливает грязью и рвет в клочья наряды " + princess.getName() + ".");
        princess.setOutfit(null);
    }

    @Override
    public void act() {
        System.out.println(name + " выполняет поручения королевы.");
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o) && (o instanceof MaidServant);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "entity.MaidServant{" +
                "name='" + name + '\'' +
                ", disposition=" + disposition +
                '}';
    }
}
