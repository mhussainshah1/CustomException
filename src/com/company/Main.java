package com.company;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws CannotSwimException {
//        throw new CannotSwimException();
//        throw new CannotSwimException("broken fin");
        throw new CannotSwimException(new FileNotFoundException("Can't find shark file"));
    }
}
