package ru.netology.domain;

import org.junit.jupiter.api.Test;
import ru.netology.manager.ManagerFilms;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmsTest {

    private ManagerFilms man = new ManagerFilms(10);

    private Movies first = new Movies(1, "we", "scream");
    private Movies second = new Movies(2, "ws", "fantastic");
    private Movies third = new Movies(3, "ww", "scream");
    private Movies four = new Movies(4, "ww", "fantastic");
    private Movies five = new Movies(5, "ww", "fantastic");
    private Movies six = new Movies(6, "ww", "scream");
    private Movies seven = new Movies(7, "ww", "scream");
    private Movies eight = new Movies(8, "ww", "scream");
    private Movies nine = new Movies(9, "ww", "fantastic");
    private Movies ten = new Movies(10, "ww", "fantastic");
    private Movies eleven = new Movies(11, "ww", "fantastic");
    private Movies twelve = new Movies(12, "ww", "fantastic");

    @Test
    public void emptyManager() {

        man.add(first);
        man.add(second);


        Movies[] expected = {second, first};
        Movies[] actual = man.getMovie();

        assertArrayEquals(expected, actual);


    }
    @Test
    public void emptyManager2() {

        man.add(first);
        man.add(second);


        Movies[] expected = {first, second};
        Movies[] actual = man.findAll();

        assertArrayEquals(expected, actual);


    }

    @Test
    public void oneMovieInManager() {

        man.add(first);

        man.add(second);
        man.add(third);
        Movies[] expected = {third, second, first};
        Movies[] actual = man.getMovie();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void twoMovieInManager() {

        man.add(first);
        man.add(second);

        man.add(third);
        man.add(four);

        Movies[] expected = {four, third, second, first};
        Movies[] actual = man.getMovie();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void veryMoreMovies() {

        man.add(first);
        man.add(second);

        man.add(third);
        man.add(four);
        man.add(five);
        man.add(six);
        man.add(seven);
        man.add(eight);
        man.add(nine);


        Movies[] expected = {nine, eight, seven, six, five, four, third, second, first};
        Movies[] actual = man.getMovie();
        assertArrayEquals(expected, actual);


    }

    @Test
    public void veryMoreMoviesButOnlyTen() {
        ManagerFilms man = new ManagerFilms(9);

        man.add(first);
        man.add(second);

        man.add(third);
        man.add(four);
        man.add(five);
        man.add(six);
        man.add(seven);
        man.add(eight);
        man.add(nine);
        man.add(eleven);
        man.add(ten);
        man.add(twelve);

        Movies[] expected = {twelve, ten, eleven, nine, eight, seven, six, five, four,};
        Movies[] actual = man.getMovie();
        assertArrayEquals(expected, actual);


    }
}
