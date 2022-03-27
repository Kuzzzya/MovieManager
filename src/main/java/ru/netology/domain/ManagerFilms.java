package ru.netology.domain;

public class ManagerFilms {
    private int release = 9;
    private Movies[] movie = new Movies[0];

    public void add(Movies films) {
        int length = movie.length + 1;
        Movies[] tmp = new Movies[length];
//        for (int i = 0; i < film.length; i++) {
//            tmp[i] = film[i];
        System.arraycopy(movie, 0, tmp, 0, movie.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = films;
        movie = tmp;
    }


    public Movies[] findAll() {
        return movie;
    }

//    public void removeById(int id) {
//        int length = movie.length - 1;
//        Movies[] tmp = new Movies[length];
//        int index = 0;
//        for (Movies films : movie) {
//            if (films.getId() != id) {
//                tmp[index] = films;
//                index++;
//            }
//        }
//        movie = tmp;
//    }

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


