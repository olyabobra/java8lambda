package edu.bobra.lambdas.chapter3;


import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static junit.framework.Assert.assertEquals;

public class AdditionalExercisesTest {

    private Function<Integer, String> mapper = intToStringMapper();

    @Test
    public void shouldMapAsTheLibraryDoes() throws Exception {
        final List<Integer> input = Arrays.asList(1,2);
        final Stream<String> exerciseImplResult = AdditionalExercises.map(input.stream(), mapper);
        final Stream<String> libraryImplResult = input.stream().map(mapper);
        assertEquals(libraryImplResult.collect(toList()), exerciseImplResult.collect(toList()));
    }

    @Test
    public void shouldMapAnEmptyStreamAsTheLibraryDoes() throws Exception {
        final List<Integer> input = new ArrayList<>();
        final Stream<String> exerciseImplResult = AdditionalExercises.map(input.stream(), mapper);
        final Stream<String> libraryImplResult = input.stream().map(mapper);
        assertEquals(libraryImplResult.collect(toList()), exerciseImplResult.collect(toList()));
    }

    @Test
    public void shouldFilterAsTheLibraryDoes() throws Exception {
        final List<Integer> input = Arrays.asList(1,2);
        final Stream<Integer> exerciseImplResult = AdditionalExercises.filter(input.stream(), isEven());
        final Stream<Integer> libraryImplResult = input.stream().filter(isEven());
        assertEquals(libraryImplResult.collect(toList()), exerciseImplResult.collect(toList()));
    }

    @Test
    public void shouldFilterAnEmptyStreamAsTheLibraryDoes() throws Exception {
        final List<Integer> input = new ArrayList<>();
        final Stream<String> exerciseImplResult = AdditionalExercises.map(input.stream(), mapper);
        final Stream<String> libraryImplResult = input.stream().map(mapper);
        assertEquals(libraryImplResult.collect(toList()), exerciseImplResult.collect(toList()));
    }

    private Function<Integer, String> intToStringMapper() {
        return intValue -> intValue.toString();
    }

    private Predicate<Integer> isEven() {
        return intValue -> intValue % 2 == 0;
    }

}
