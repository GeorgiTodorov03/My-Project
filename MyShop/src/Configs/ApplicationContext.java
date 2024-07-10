package Configs;

import Entities.Cart;
import Entities.User;

import java.awt.*;
import java.awt.desktop.AppForegroundListener;

public class ApplicationContext {
    private static ApplicationContext instance;

    private User loggedInUser;
    private Menu mainMenu;
    private Cart sessionCart;

    private ApplicationContext() {

    }

    public void setLoggedInUser(User user) {
        if(this.sessionCart != null) {
            this.sessionCart.clear();
        }
        this.loggedInUser = user;
    }
    public User getLoggedInUser() {
        return loggedInUser;
    }

    public void setMainMenu(Menu mainMenu) {
        this.mainMenu = mainMenu;
    }

    public Menu getMainMenu() {
        return mainMenu;
    }

    public static ApplicationContext getInstance() {
        if (instance == null) {
            instance = new ApplicationContext();
        }
        return instance;
    }

    public Cart getSessionCart() {
        if (this.sessionCart == null) {
            this.sessionCart = new Cart();
        }
        return sessionCart;
    }
}
