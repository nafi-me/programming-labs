package entity;

import record.OutfitDetails;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Queen extends Person {
    private List<Outfit> outfits; // наряды, нашитые для Тротти

    public Queen(String name) {
        super(name, Disposition.CRUEL);
        this.outfits = new ArrayList<>();
    }

    public void buyMaterial(String material) {
        System.out.println(name + " скупает всю " + material + " в городе.");
    }

    public void sewOutfitsForTrotti(int number, OutfitDetails details) {
        System.out.println(name + " нашивает для Тротти " + number + " нарядов.");
        for (int i = 0; i < number; i++) {
            outfits.add(new Outfit(details, true));
        }
    }

    public void burnRemainingMaterial(String material) {
        System.out.println(name + " сжигает оставшийся " + material + ".");
    }

    public List<Outfit> getOutfits() {
        return outfits;
    }

    @Override
    public void act() {
        System.out.println(name + " занимается королевскими делами и контролирует материальные запасы.");
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Queen)) return false;
        Queen queen = (Queen) o;
        return outfits.equals(queen.outfits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), outfits);
    }

    @Override
    public String toString() {
        return "entity.Queen{" +
                "name='" + name + '\'' +
                ", disposition=" + disposition +
                ", outfits=" + outfits +
                '}';
    }
}
