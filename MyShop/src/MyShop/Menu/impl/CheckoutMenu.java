package MyShop.Menu.impl;

import MyShop.Configs.ApplicationContext;
import MyShop.Enteties.Order;
import MyShop.Enteties.impl.DefaultOrder;
import MyShop.Menu.Menu;
import MyShop.Services.OrderManagementService;
import MyShop.Services.impl.DefaultOrderManagementService;

import java.util.ResourceBundle;
import java.util.Scanner;

public class CheckoutMenu implements Menu {

    private ApplicationContext context;
    private OrderManagementService orderManagementService;
    private ResourceBundle rb;

    {
        context = ApplicationContext.getInstance();
        orderManagementService = DefaultOrderManagementService.getInstance();
        rb = ResourceBundle.getBundle(RESOURCE_BUNDLE_BASE_NAME);
    }

    @Override
    public void start() {
        while (true) {
            printMenuHeader();
            Scanner sc = new Scanner(System.in);
            String userInput = sc.next();

            if (!createOrder(userInput)) {
                continue;
            }
            context.getSessionCart().clear();
            break;
        }

        System.out.println(rb.getString("thank.you.msg"));
        new MainMenu().start();

    }

    private boolean createOrder(String creditCardNumber) {
        Order order = new DefaultOrder();
        if (!order.isCreditCardNumberValid(creditCardNumber)) {
            return false;
        }

        order.setCreditCardNumber(creditCardNumber);
        order.setProducts(context.getSessionCart().getProducts());
        order.setCustomerId(context.getLoggedInUser().getId());
        orderManagementService.addOrder(order);
        return true;
    }

    @Override
    public void printMenuHeader() {
        System.out.println(rb.getString("checkout.menu.header"));
        System.out.print(rb.getString("enter.credit.card.number.cta"));
    }
}
