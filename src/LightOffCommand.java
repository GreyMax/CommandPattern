public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        System.out.println("======== undo " + getClass().getSimpleName() + " ===========");
        light.on();
    }
}
