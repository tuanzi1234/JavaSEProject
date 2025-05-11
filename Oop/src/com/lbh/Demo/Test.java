package com.lbh.Demo;

public class Test {

    public static void main(String[] args) {
        // 需求：完成一个面向对象案例
        //展示电影信息，根据id查电影
        Movie[] movies = new Movie[6];
        //此时，movies = [null, null, null, null, null, null]
        movies[0] = new Movie(1, "唐顿庄园", 9.5, "罗宾·怀特");
        movies[1] = new Movie(2, "唐顿庄园2", 9.5, "罗宾·怀特");
        movies[2] = new Movie(3, "唐顿庄园3", 9.5, "罗宾·怀特");
        movies[3] = new Movie(4, "唐顿庄园4", 9.5, "罗宾·怀特");
        movies[4] = new Movie(5, "唐顿庄园5", 9.5, "罗宾·怀特");
        movies[5] = new Movie(6, "唐顿庄园6", 9.5, "罗宾·怀特");

        //3. 创建电影操作对象，用于电影业务操作
        MovieService movieService = new MovieService(movies);
        movieService.showMovie();
        movieService.findMovieById();



    }
}
