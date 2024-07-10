package Storage;

import Entities.Order;

import java.io.*;
import java.util.List;

public class OrderStoringService {
    private static final String ORDERS_DATA_FILE_NAME = "orders.data";
    private static final String CURRENT_TASK_RESOURCE_FOLDER = "finalTask";
    private static final String RESOURCES_FOLDER = "resources";

    private static OrderStoringService instance;

    private OrderStoringService() {
    }

    public void saveOrders(List<Order> orders) {
        try (var oos = new ObjectOutputStream(new FileOutputStream(RESOURCES_FOLDER + File.separator + CURRENT_TASK_RESOURCE_FOLDER + File.separator + ORDERS_DATA_FILE_NAME))) {
            oos.writeObject(orders);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Order> loadOrders() {
        try (var ois = new ObjectInputStream(new FileInputStream(RESOURCES_FOLDER + File.separator + CURRENT_TASK_RESOURCE_FOLDER + File.separator + ORDERS_DATA_FILE_NAME))) {
            return (List<Order>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static OrderStoringService getInstance() {
        if (instance == null) {
            instance = new OrderStoringService();
        }
        return instance;
    }
}
