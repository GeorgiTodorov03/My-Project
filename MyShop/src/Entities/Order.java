package Entities;

import java.util.List;

public class Order {
    private static final int AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER = 16;

    private String creditCardNumber;
    private List<Product> products;
    private int customerId;

    public boolean isCreditCardNumberValid (String creditCardNumber) {
        return  creditCardNumber.toCharArray().length == AMOUNT_OF_DIGITS_IN_CREDIT_CARD_NUMBER &&
                !creditCardNumber.contains(" ") && Long.parseLong(creditCardNumber) > 0;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        if (creditCardNumber == null) {
            return;
        }
        this.creditCardNumber = creditCardNumber;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Order: customer id - " + this.customerId + "\t" +
                "credit card number - " + this.creditCardNumber + "\t" +
                "products - " + this.products;
    }
}
