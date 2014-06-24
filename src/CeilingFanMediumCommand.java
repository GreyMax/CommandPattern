public class CeilingFanMediumCommand implements Command {

    private CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        System.out.println("======== undo " + getClass().getSimpleName() + " ===========");
        switch (prevSpeed) {
            case CeilingFan.HIGH: {
                ceilingFan.high();
                break;
            }
            case CeilingFan.MEDIUM: {
                ceilingFan.medium();
                break;
            }
            case CeilingFan.LOW: {
                ceilingFan.low();
                break;
            }
            case CeilingFan.OFF: {
                ceilingFan.off();
                break;
            }
        }
    }
}
