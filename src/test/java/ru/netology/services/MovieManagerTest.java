package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    public void addMovie0Test() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.findALl();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie1Test() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        String[] actual = manager.findALl();
        String[] expected = {"Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie5Test() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        String[] actual = manager.findALl();
        String[] expected = {"Film 1", "Film 2", "Film 3", "Film 4", "Film 5"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestWhen3film() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        String[] actual = manager.findLast();
        String[] expected = {"Film 3", "Film 2", "Film 1"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestWhen0Film() {
        MovieManager manager = new MovieManager();
        String[] actual = manager.findLast();
        String[] expected = {};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTestWhen7Film() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");
        String[] actual = manager.findLast();
        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3"};
        Assertions.assertArrayEquals(expected, actual);
    }
}