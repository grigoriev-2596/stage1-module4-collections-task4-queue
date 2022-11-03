package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> dishes = new ArrayDeque<>();
        List<Integer> dishOrder = new ArrayList<>();
        for(int i = 1; i <= numberOfDishes; i++) {
            dishes.add(i);
        }

        while(!dishes.isEmpty()) {
            for(int i = 0; i < everyDishNumberToEat - 1; i++) {
                dishes.add(dishes.poll());
            }
            dishOrder.add(dishes.poll());
        }
        return dishOrder;
    }
}
