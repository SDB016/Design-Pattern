package adapterPattern;

public class CTypeCharger implements AndroidCharger{
    @Override
    public void startAndroidCharging() {
        System.out.println("Android charging start");
    }

    @Override
    public void finishAndroidCharging() {
        System.out.println("Android charging finish");
    }
}
