package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        Item[] item = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item name = items[i];    
            if (items[i] != null) {
                    item[size] = name;
                    size++;
                }
        }
        item = Arrays.copyOf(item, size);
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
        return item;
    }

    public Item[] findByName(String key) {
        Item[] item1 = new Item[items.length];
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            Item name1 = items[i];
            if (name1 != null && name1.getName().equals(key)) {
                item1[size] = name1;
                size++;
            }
        }
        item1 = Arrays.copyOf(item1, size);
        for (int i = 0; i < item1.length; i++) {
            System.out.println(item1[i]);
        }
        return item1;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}