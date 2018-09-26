package eight;

import java.util.Optional;

public class Soundcard {

    public Optional<USB> getUsb() {
        return Optional.of(new USB());
    }
}
