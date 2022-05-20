package ru.netology.manager;

import ru.netology.domain.FilmItem;

public class ManagerFilm {

    int maxAmountOffFilm = 10;


    private FilmItem[] items = new FilmItem[0];
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

    public ManagerFilm(int maxAmountOffFilm) {
        this.maxAmountOffFilm = maxAmountOffFilm;
    }

    public ManagerFilm() {
    }

    public void save(FilmItem item) {
        int length = items.length + 1; //вычисляем длину нового массива
        FilmItem[] tmp = new FilmItem[length]; //создали новый массив с увеличеной на 1 длиной
        System.arraycopy(items, 0, tmp, 0, items.length);//откуда скопировать, с какого места копировать (с 0), куда скопировать, с чего начать, сколько копировать
        int lastIndex = tmp.length - 1; //просто вычислили последний индекс
        tmp[lastIndex] = item; //добавили наш товар в последний массив
        items = tmp;
    }

    public FilmItem[] findAll() {
        return items;
    }

    public void removeByID(int id) {
        int length = items.length - 1; //вводим переменную и присваиваем длину на 1 меньше
        FilmItem[] tmp = new FilmItem[length]; //создаем массив с учетом меньшей длины
        int index = 0;
        for (FilmItem item : items) { // бежим по каждой единице массива
            if (item.getId() != id) { //сравниваем каждую единицу с номером ID, не равно
                tmp[index] = item;
                index++;

            }

        }

        items = tmp;

    }

    public FilmItem[] getAll() {
        findAll(); //находим все фильмы, репозиторий отдает в прямом порядке, а надо в обратном
        FilmItem[] result = new FilmItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];

        }
        return result;
    }

    public FilmItem[] findLast() {
        findAll();
        int resultLength;
       if (items.length > maxAmountOffFilm) {
          resultLength = maxAmountOffFilm;
        } else {
           resultLength = items.length;
        }
        //находим все фильмы, репозиторий отдает в прямом порядке, а надо в обратном
        FilmItem[] result = new FilmItem[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

}
