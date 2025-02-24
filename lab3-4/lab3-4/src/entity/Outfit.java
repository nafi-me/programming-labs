package entity;

import record.OutfitDetails;

import java.util.Objects;

public class Outfit {
    private OutfitDetails details;
    private boolean isNew;

    public Outfit(OutfitDetails details, boolean isNew) {
        this.details = details;
        this.isNew = isNew;
    }

    public OutfitDetails getDetails() {
        return details;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean isNew) {
        this.isNew = isNew;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Outfit)) return false;
        Outfit outfit = (Outfit) o;
        return isNew == outfit.isNew &&
                Objects.equals(details, outfit.details);
    }

    @Override
    public int hashCode() {
        return Objects.hash(details, isNew);
    }

    @Override
    public String toString() {
        return "entity.Outfit{" +
                "details=" + details +
                ", isNew=" + isNew +
                '}';
    }
}
