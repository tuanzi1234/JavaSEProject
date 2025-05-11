package com.lbh.Demo;

import java.util.Scanner;

public class MovieService {
    // 业务逻辑层
    // 将电影数据传进来
    private Movie[] movies;
    public MovieService(Movie[] movies) {
        this.movies = movies;
    }

    //展示所有的电影
    public void showMovie() {
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            System.out.println(movie.getName() + "  " + movie.getPrice() + "  " + movie.getActor());
        }

    }

    public void findMovieById() {
        System.out.println("请输入要查找的电影编号：");
        Scanner  sc = new Scanner(System.in);
        int id = sc.nextInt();
        for (int i = 0; i < movies.length; i++) {
            Movie movie = movies[i];
            if (movie.getId() == id) {
                System.out.println(movie.getName() + "  " + movie.getPrice() + "  " + movie.getActor());
                return;
            }
        }
        System.out.println("没有找到该电影");
    }
}
