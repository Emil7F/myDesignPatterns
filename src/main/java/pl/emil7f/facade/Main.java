package pl.emil7f.facade;

import pl.emil7f.facade.deliverybox.DeliveryBoxFacade;

public class Main {
    public static void main(String[] args) {
        DeliveryBoxFacade deliveryBoxFacade = new DeliveryBoxFacade();
        deliveryBoxFacade.pickUpPackage();
    }
}
