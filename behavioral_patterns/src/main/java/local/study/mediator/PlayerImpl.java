package local.study.mediator;

public class PlayerImpl implements Player {

    private Mediator mediator;
    private final String name;

    public PlayerImpl(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    @Override
    public void login() {
        mediator.login(this);
    }

    @Override
    public void logout() {
        mediator.logout(this);
    }

    @Override
    public void pressPlayButton() {
        mediator.play(this);
    }

    @Override
    public String getName() {
        return name;
    }
}
