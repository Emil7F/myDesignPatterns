package pl.emil7f.facade.deliverybox;

public class DeliveryBoxFacade {

    private DeliveryBox deliveryBox;
    private DeliveryBoxSystem deliveryBoxSystem;

    public DeliveryBoxFacade() {
        this.deliveryBox = new DeliveryBox();
        this.deliveryBoxSystem = new DeliveryBoxSystem();
    }

    public void pickUpPackage() {

        deliveryBox.getUserData();
        if (deliveryBoxSystem.isUserDataValidated()
                &&
                deliveryBoxSystem.isPaymentSecured()) {
            deliveryBox.openBox();
        }
    }
}
