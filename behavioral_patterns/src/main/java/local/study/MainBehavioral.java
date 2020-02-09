package local.study;

import local.study.mediator.GameClientMediator;
import local.study.mediator.Mediator;
import local.study.mediator.Player;
import local.study.mediator.PlayerImpl;

public class MainBehavioral {

    public static void main(String[] args) {

        Mediator gameClient = new GameClientMediator();
        Player player1 = new PlayerImpl(gameClient,"John");
        Player player2 = new PlayerImpl(gameClient,"Nick");
        Player player3 = new PlayerImpl(gameClient,"Mike");
        Player player4 = new PlayerImpl(gameClient,"Rick");

        player1.login();
        player2.login();
        player3.login();
        player4.login();

        player1.pressPlayButton();
        player2.pressPlayButton();
        player3.pressPlayButton();
        player4.pressPlayButton();

        player2.logout();
        player3.logout();

        player1.pressPlayButton();
        player2.pressPlayButton();
        player3.pressPlayButton();
        player4.pressPlayButton();

    }
}
