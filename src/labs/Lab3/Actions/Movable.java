package labs.Lab3.Actions;

import labs.Lab3.DataModels.InvalidMovementException;

public interface Movable {
    void move() throws InvalidMovementException;
}
