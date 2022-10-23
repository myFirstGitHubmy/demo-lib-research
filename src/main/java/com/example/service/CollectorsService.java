package com.example.service;

import com.annotation.PrintMethod;

import java.util.List;
import java.util.Map;

public interface CollectorsService {

    /**
     * Returns a Collector implementing a "group by" operation on input elements of type T,
     * grouping elements according to a classification function,
     * and returning the results in a Map.
     */
    Map<String, List<String>> grouping();

    /**
     * Returns a Collector accepting elements of type T that counts the number of input elements.
     */
    Map<String, Long> counting();

    /**
     * Returns a Collector that concatenates the input elements,
     * separated by the specified delimiter, in encounter order.
     */
    String joining();

    /**
     * Returns a Collector that produces the sum of a integer-valued function applied to the input elements.
     */
    int summingInt();
}
