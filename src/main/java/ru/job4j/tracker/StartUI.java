package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Formatter;

public class StartUI {
    public static void main(String[] args) {
    Item item = new Item();
    System.out.println("Data of Item: " + item.getCreated().format(item.getFormatter()));
    }
}