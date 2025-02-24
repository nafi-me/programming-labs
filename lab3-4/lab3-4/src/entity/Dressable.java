package entity;

import exception.InvalidActionException;

public interface Dressable {
    void wearOutfit(Outfit outfit) throws InvalidActionException;
}
