package eight;

import java.util.Optional;

public class Computer {

    public Optional<Soundcard> getSoundcard() {
        return Optional.of(new Soundcard());
    }
}
