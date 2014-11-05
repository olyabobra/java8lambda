package edu.bobra.lambdas.chapter3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class AdditionalExercises {
    public static <T, S> Stream<S> map(Stream<T> stream, Function<? super T, ? extends S> mapper) {
        final List<S> result = new ArrayList<>();
        stream.reduce(result, (acc, t) -> {
            acc.add(mapper.apply(t));
            return acc;

        }, (ses, ses2) -> ses);
        return result.stream();
    }

    public static <T> Stream<T> filter(Stream<T> stream, Predicate<? super T> predicate) {
        final List<T> result = new ArrayList<>();
        stream.reduce(result, (acc, t) -> {
            if(predicate.test(t)) {
                acc.add(t);
            }
            return acc;

        }, (ses, ses2) -> ses);
        return result.stream();
    }
}
