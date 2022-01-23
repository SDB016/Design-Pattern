package adapterPattern;

public class ChargingTest {
    public static void main(String[] args) {
        System.out.println("I have only android charger");
        AndroidCharger androidCharger = new CTypeCharger();
        testCharging(androidCharger);

        System.out.println("I have thunderbolt adapter");
        IphoneCharger iphoneCharger = new ThunderboltCharger();
        AndroidCharger chargerWithAdapter = new ThunderboltAdapter(iphoneCharger);
        testCharging(chargerWithAdapter);
    }

    private static void testCharging(AndroidCharger androidCharger) {
        androidCharger.startAndroidCharging();
        androidCharger.finishAndroidCharging();
        System.out.println("---");
    }
}
