package ru.netology.manager;

import ru.netology.domain.Movies;

public class ManagerFilms {
    private int release = 10;
    private Movies[] movie = new Movies[0];

    public ManagerFilms(Movies[] movie) {
    }

    public ManagerFilms(int release) {
        this.release = release;
        this.movie = movie;
    }

    public void add(Movies films) {
        int length = movie.length + 1;
        Movies[] tmp = new Movies[length];
        System.arraycopy(movie, 0, tmp, 0, movie.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = films;
        movie = tmp;
    }


    public Movies[] findAll() {
        return movie;
    }


    public Movies[] getMovie() {
        int resultLength;
        if (release >= movie.length) {
            resultLength = movie.length;
        } else {
            resultLength = release;
        }
        Movies[] result = new Movies[resultLength];
        for (int i = 0; i < resultLength; i++) {
            int index = movie.length - i - 1;
            result[i] = movie[index];


        }
        return result;
    }

}


