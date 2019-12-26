package model;

import model.New_Plants.*;
import model.New_Plants.fruits.Fruit;
import model.New_Zombies.Zombie;

import java.util.ArrayList;

public class Cell {
    private int row;
    private int column;
    private Plant plant;
    private ArrayList<Zombie> zombies = new ArrayList<Zombie>();
    private ArrayList<Fruit> fruits = new ArrayList<>();
    private boolean isLand;
    private boolean leaf;

    public boolean isLeaf() {
        return leaf;
    }

    public void setLeaf(boolean leaf) {
        this.leaf = leaf;
    }

    public boolean isLand() {
        return isLand;
    }

    public void setLand(boolean land) {
        isLand = land;
    }

    public ArrayList<Zombie> getZombies() {
        return zombies;
    }

    public void setZombies(ArrayList<Zombie> zombies) {
        this.zombies = zombies;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plants) {
        plant = plants;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }
}
