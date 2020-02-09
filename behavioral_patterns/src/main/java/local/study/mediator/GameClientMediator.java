package local.study.mediator;

import java.util.*;

public class GameClientMediator implements Mediator {

    private List<Player> readyPlayers;
    private Map<Player, Boolean> players;
    private final int playersExpected;
    private boolean isPlayable;

    public GameClientMediator() {
        this.readyPlayers = new ArrayList<>();
        this.players = new HashMap<>();
        this.playersExpected = 3;
        this.isPlayable = false;
    }

    @Override
    public void checkStartCondition() {
        if (readyPlayers.size() == playersExpected) {
            isPlayable = true;
        }
    }

    @Override
    public void play(Player player) {
        if (players.containsKey(player) && players.get(player)) {
            if (!readyPlayers.contains(player)) {
                readyPlayers.add(player);
                checkStartCondition();
                if (isPlayable) {
                    startGame();
                    finishGame();
                }
                else {
                    System.out.println("Not enough players...");
                }
            }
        }
    }

    @Override
    public void login(Player player) {
        players.put(player,  true);
    }

    @Override
    public void logout(Player player) {
        players.put(player,  false);
    }

    private Player getWinner() {
        return readyPlayers.get((int) (Math.random() * (playersExpected - 1)));
    }

    private void startGame() {
        System.out.println("Game Started!");
    }

    private void finishGame() {
        System.out.println("Game finished!");
        System.out.printf("Winner is %s!\n", getWinner().getName());
        readyPlayers.clear();
        isPlayable = false;
    }

}
