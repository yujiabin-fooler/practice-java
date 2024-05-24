package net.jiabin.design.pattern.practice.iterator;

public class IteratorTestClient {


    public static void main(String[] args) {
        TVChanneMenu tvMenu = new TVChanneMenu();
        FilmMenu filmMenu = new FilmMenu();

        MainMenu mainMenu = new MainMenu(tvMenu, filmMenu);
        mainMenu.printMenu();
    }

}
