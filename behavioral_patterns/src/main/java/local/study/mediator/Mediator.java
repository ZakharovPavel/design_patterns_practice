package local.study.mediator;

public interface Mediator {

    void login(Player player);

    void logout(Player player);

    void checkStartCondition();

    void play(Player player);
}
