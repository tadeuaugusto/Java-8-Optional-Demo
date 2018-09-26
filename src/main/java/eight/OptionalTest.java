package eight;

import java.util.Optional;

public class OptionalTest {

//    Optional<Computer> computer = Optional.empty(); // empty Optional

    Optional<Computer> computer = Optional.of(new Computer());


    public void caseJava8() {

        String version = computer.flatMap(Computer::getSoundcard)
                .flatMap(Soundcard::getUsb)
                .map(USB::getVersion)
                .orElse("UNKNOWN");

        System.out.println(version);
        computer.ifPresent(System.out::println);


    }

    public void caseGroovy() {

        // String version = computer?.getSoundcard()?.getUsb()?.getVersion() ?: "UNKNOWN";
    }
}
