package adapterPattern;

public class ThunderboltAdapter implements AndroidCharger{
    IphoneCharger charger;

    public ThunderboltAdapter(IphoneCharger charger) {
        this.charger = charger;
    }

    @Override
    public void startAndroidCharging() {
        charger.startIphoneCharging();
    }

    @Override
    public void finishAndroidCharging() {
        charger.finishIphoneCharging();
    }
}
