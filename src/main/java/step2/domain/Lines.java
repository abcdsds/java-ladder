package step2.domain;


import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toList;

public class Lines {
    private final List<Line> lines;

    public Lines(List<Line> lines) {
        this.lines = lines;
    }

    public static Lines of(int height, int size, Condition condition) {
        return IntStream.range(0, height)
                .mapToObj(index -> Line.of(size - 1, condition))
                .collect(collectingAndThen(toList(), Lines::new));
    }

    public List<Line> getLines() {
        return Collections.unmodifiableList(lines);
    }
}
