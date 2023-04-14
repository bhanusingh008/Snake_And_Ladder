package com.snakeandladder.snakeandladder;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Tile extends Rectangle {

    public Tile(int tile_size)
    {
        setWidth(tile_size);
        setHeight(tile_size);
        setFill(Color.ALICEBLUE);
        setStroke(Color.BLACK);
    }
}
