package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class ManagerFilmTest {
    @Test
    public void shouldManagerSaveOneFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        ManagerFilm manager = new ManagerFilm();
        manager.save(film1);
        FilmItem[] expected = {film1};
        FilmItem[] actual = manager.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldManagerSaveSeveralFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        ManagerFilm manager = new ManagerFilm();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        FilmItem[] expected = {film1, film2, film3};
        FilmItem[] actual = manager.findAll();
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldManagerSaveNothing() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        ManagerFilm manager = new ManagerFilm();
        FilmItem[] expected = {};
        FilmItem[] actual = manager.findAll();
        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldManagerGatAllFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        ManagerFilm manager = new ManagerFilm();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.findAll();
        FilmItem[] expected = {film3, film2, film1};
        FilmItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldManagerGatOneFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        ManagerFilm manager = new ManagerFilm();
        manager.save(film1);
        FilmItem[] expected = {film1};
        FilmItem[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldManagerFindLastIfLowerThanMaxAmountOffFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        FilmItem film4 = new FilmItem(004, "film4", "film4", true);
        FilmItem film5 = new FilmItem(005, "film5", "film5", true);
        FilmItem film6 = new FilmItem(006, "film6", "film6", true);
        ManagerFilm manager = new ManagerFilm(5);
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        FilmItem[] expected = {film6, film5, film4, film3, film2};
        FilmItem[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldManagerFindLastIfWithMoreThanMaxAmountOffFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        FilmItem film4 = new FilmItem(004, "film4", "film4", true);
        FilmItem film5 = new FilmItem(005, "film5", "film5", true);
        FilmItem film6 = new FilmItem(006, "film6", "film6", true);
        FilmItem film7 = new FilmItem(007, "film7", "film7", true);
        FilmItem film8 = new FilmItem(8, "film8", "film8", true);
        FilmItem film9 = new FilmItem(9, "film9", "film9", true);
        FilmItem film10 = new FilmItem(010, "film10", "film10", true);
        FilmItem film11 = new FilmItem(011, "film11", "film11", true);
        FilmItem film12 = new FilmItem(012, "film12", "film12", true);

        ManagerFilm manager = new ManagerFilm();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);
        manager.save(film11);
        FilmItem[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        FilmItem[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldManagerFindLastIfWithEqualMaxAmountOffFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        FilmItem film4 = new FilmItem(004, "film4", "film4", true);
        FilmItem film5 = new FilmItem(005, "film5", "film5", true);
        FilmItem film6 = new FilmItem(006, "film6", "film6", true);
        FilmItem film7 = new FilmItem(007, "film7", "film7", true);
        FilmItem film8 = new FilmItem(8, "film8", "film8", true);
        FilmItem film9 = new FilmItem(9, "film9", "film9", true);
        FilmItem film10 = new FilmItem(010, "film10", "film10", true);
        FilmItem film11 = new FilmItem(011, "film11", "film11", true);
        FilmItem film12 = new FilmItem(012, "film12", "film12", true);

        ManagerFilm manager = new ManagerFilm();
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);
        FilmItem[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        FilmItem[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldManagerFindLastIfWithOneFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        FilmItem film4 = new FilmItem(004, "film4", "film4", true);
        FilmItem film5 = new FilmItem(005, "film5", "film5", true);
        FilmItem film6 = new FilmItem(006, "film6", "film6", true);
        FilmItem film7 = new FilmItem(007, "film7", "film7", true);
        FilmItem film8 = new FilmItem(8, "film8", "film8", true);
        FilmItem film9 = new FilmItem(9, "film9", "film9", true);
        FilmItem film10 = new FilmItem(010, "film10", "film10", true);
        FilmItem film11 = new FilmItem(011, "film11", "film11", true);
        FilmItem film12 = new FilmItem(012, "film12", "film12", true);

        ManagerFilm manager = new ManagerFilm(1);
        manager.save(film1);
        manager.save(film2);
        manager.save(film3);
        manager.save(film4);
        manager.save(film5);
        manager.save(film6);
        manager.save(film7);
        manager.save(film8);
        manager.save(film9);
        manager.save(film10);
        FilmItem[] expected = {film10};
        FilmItem[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldManagerFindLastWithoutFilm() {
        FilmItem film1 = new FilmItem(001, "film1", "film1", true);
        FilmItem film2 = new FilmItem(002, "film2", "film2", true);
        FilmItem film3 = new FilmItem(003, "film3", "film3", true);
        FilmItem film4 = new FilmItem(004, "film4", "film4", true);
        FilmItem film5 = new FilmItem(005, "film5", "film5", true);
        FilmItem film6 = new FilmItem(006, "film6", "film6", true);
        FilmItem film7 = new FilmItem(007, "film7", "film7", true);
        FilmItem film8 = new FilmItem(8, "film8", "film8", true);
        FilmItem film9 = new FilmItem(9, "film9", "film9", true);
        FilmItem film10 = new FilmItem(010, "film10", "film10", true);
        FilmItem film11 = new FilmItem(011, "film11", "film11", true);
        FilmItem film12 = new FilmItem(012, "film12", "film12", true);

        ManagerFilm manager = new ManagerFilm(1);
        FilmItem[] expected = {};
        FilmItem[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

}