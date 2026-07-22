
import java.util.List;
import java.util.Set;

import controllers.ShipmentController;
import data.ShipmentData;
import models.Shipment;

public class Main {

    public static void main(String[] args) {

        List<Shipment> shipments = ShipmentData.createShipments();

        ShipmentController controller = new ShipmentController();

        Set<Shipment> ordered = controller.filterAndOrderShipments(shipments, 50000);

        List<Shipment> bulky = controller.classifyAndExtractShipments(shipments, "BULKY");

        List<Shipment> regular = controller.classifyAndExtractShipments(shipments, "REGULAR");

        List<Shipment> light = controller.classifyAndExtractShipments(shipments, "LIGHT");

        System.out.println("Method A: " + ordered.size());
        System.out.println("BULKY: " + bulky.size());
        System.out.println("REGULAR: " + regular.size());
        System.out.println("LIGHT: " + light.size());

    }
}