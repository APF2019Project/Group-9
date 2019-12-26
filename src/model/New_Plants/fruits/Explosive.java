package model.New_Plants.fruits;

import constants.Constants;
import model.Cell;
import model.Map;
import model.New_Plants.bomb.BombBox;
import model.battle.Battle;
import model.battle.GraveYard;
import model.battle.ZombieInGame;

import java.util.ArrayList;

public class Explosive extends Fruit {

    private BombBox bombBox;
    private int bombPower = Constants.BOMB_POWER;

    public Explosive(BombBox bombBox) {
        this.bombBox = bombBox;

    }

    @Override
    public <T> void action(ArrayList<T> inputs) {
        int length = bombBox.getLength();
        int width = bombBox.getWidth();
        Map gameMap = Battle.getRunningBattle().getMap();
        for (int i = getPosition().getRow() - width / 2; i <= getPosition().getRow() + width / 2; i++) {
            for (int j = getPosition().getColumn() - length / 2; j < getPosition().getColumn() + length / 2; j++) {
                Cell cell = gameMap.getCell(i, j);
                for (int k = 0; k < cell.getZombies().size() ; k++) {
                    GraveYard.getDeadZombies().add(cell.getZombies().get(k).getZombie());
                    ZombieInGame.getZombiesInGame().remove(cell.getZombies().get(k)) ;
                    cell.getZombies().remove(k) ;
                    k -- ;
                }
            }
        }

    }

    public BombBox getBombBox() {
        return bombBox;
    }
}
