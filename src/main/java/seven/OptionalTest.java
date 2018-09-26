package seven;

public class OptionalTest {

    Computer computer = new Computer();
    Soundcard soundcard = new Soundcard();
    USB usb = new USB();

    public void caseJava7() {

        String version = "UNKNOWN";
        if(computer != null){
            soundcard = computer.getSoundcard();
            if(soundcard != null){
                usb = soundcard.getUsb();
                if(usb != null){
                    version = usb.getVersion();
                }
            }
        }

        System.out.print(version);
    }
    public void caseGroovy() {

        // String version = computer?.getSoundcard()?.getUsb()?.getVersion() ?: "UNKNOWN";
    }
}
