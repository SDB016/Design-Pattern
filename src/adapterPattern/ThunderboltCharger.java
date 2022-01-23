package adapterPattern;

public class ThunderboltCharger implements IphoneCharger{
    @Override
    public void startIphoneCharging() {
        System.out.println("Iphone charging start");
    }

    @Override
    public void finishIphoneCharging() {
        System.out.println("Iphone charging finish");
    }
}
