package com.company;

class CannotSwimException extends Exception {
    public CannotSwimException() {
    }

    public CannotSwimException(String message) {
        super(message);
    }

    public CannotSwimException(Exception cause) {
        super(cause);
    }
}

class DangerInTheWater extends RuntimeException {
}

class SharkInTheWaterException extends DangerInTheWater {
}

public class Dolphin {
    public void swim() throws CannotSwimException {

    }
}
