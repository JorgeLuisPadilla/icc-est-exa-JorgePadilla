package data;

import java.util.ArrayList;
import java.util.List;

import models.PackageDimensions;
import models.Shipment;

public final class ShipmentData {

    private ShipmentData() {
    }

    public static List<Shipment> createShipments() {
        List<Shipment> shipments = new ArrayList<>();

        shipments.add(new Shipment("SHP-001", "Ana Torres", new PackageDimensions(65.0, 25.0, 40.0, 25.0), 4));
        shipments.add(new Shipment("SHP-002", "Luis Mora", new PackageDimensions(50.0, 35.0, 45.0, 4.5), 2));
        shipments.add(new Shipment("SHP-003", "Carlos Vega", new PackageDimensions(75.0, 50.0, 20.0, 23.5), 2));
        shipments.add(new Shipment("SHP-004", "Sofía Cordero", new PackageDimensions(35.0, 45.0, 15.0, 21.0), 5));
        shipments.add(new Shipment("SHP-005", "Mateo Rojas", new PackageDimensions(45.0, 35.0, 45.0, 4.5), 5));
        shipments.add(new Shipment("SHP-006", "Valentina Ruiz", new PackageDimensions(75.0, 25.0, 30.0, 7.5), 1));
        shipments.add(new Shipment("ShP-007", "Diego Pérez", new PackageDimensions(30.0, 45.0, 40.0, 4.5), 5));
        shipments.add(new Shipment("SHP-008", "María López", new PackageDimensions(35.0, 60.0, 35.0, 18.5), 1));
        shipments.add(new Shipment("SHP-009", "JOSÉ ANDRADE", new PackageDimensions(40.0, 55.0, 10.0, 18.5), 3));
        shipments.add(new Shipment("SHP-010", "Camila Vázquez", new PackageDimensions(45.0, 40.0, 40.0, 18.5), 4));
        shipments.add(new Shipment("shp-011", "Andrés Molina", new PackageDimensions(20.0, 25.0, 25.0, 6.0), 5));
        shipments.add(new Shipment("SHP-012", "Lucía Herrera", new PackageDimensions(80.0, 15.0, 35.0, 27.5), 4));
        shipments.add(new Shipment("SHP-013", "pablo cárdenas", new PackageDimensions(70.0, 15.0, 20.0, 7.5), 3));
        shipments.add(new Shipment("ShP-014", "Daniela Ortiz", new PackageDimensions(20.0, 30.0, 10.0, 9.0), 4));
        shipments.add(new Shipment("SHP-015", "Miguel Salazar", new PackageDimensions(65.0, 15.0, 15.0, 10.5), 3));
        shipments.add(new Shipment("SHP-016", "Fernanda León", new PackageDimensions(30.0, 15.0, 20.0, 32.5), 4));
        shipments.add(new Shipment("SHP-017", "Ricardo Ponce", new PackageDimensions(65.0, 60.0, 40.0, 25.0), 2));
        shipments.add(new Shipment("SHP-018", "GABRIELA NÚÑEZ", new PackageDimensions(20.0, 35.0, 50.0, 18.5), 1));
        shipments.add(new Shipment("SHP-019", "Esteban Castro", new PackageDimensions(55.0, 55.0, 40.0, 27.5), 4));
        shipments.add(new Shipment("SHP-020", "Natalia Peña", new PackageDimensions(75.0, 55.0, 15.0, 30.0), 1));
        shipments.add(new Shipment("ShP-021", "Ana Torres", new PackageDimensions(80.0, 50.0, 10.0, 10.5), 2));
        shipments.add(new Shipment("shp-022", "Luis Mora", new PackageDimensions(55.0, 40.0, 40.0, 27.5), 1));
        shipments.add(new Shipment("SHP-023", "Carlos Vega", new PackageDimensions(70.0, 55.0, 15.0, 7.5), 1));
        shipments.add(new Shipment("SHP-024", "Sofía Cordero", new PackageDimensions(50.0, 45.0, 20.0, 23.5), 3));
        shipments.add(new Shipment("SHP-025", "Mateo Rojas", new PackageDimensions(65.0, 50.0, 45.0, 14.0), 2));
        shipments.add(new Shipment("SHP-026", "valentina ruiz", new PackageDimensions(25.0, 20.0, 50.0, 9.0), 5));
        shipments.add(new Shipment("SHP-027", "DIEGO PÉREZ", new PackageDimensions(55.0, 20.0, 20.0, 10.5), 4));
        shipments.add(new Shipment("ShP-028", "María López", new PackageDimensions(45.0, 45.0, 25.0, 10.5), 1));
        shipments.add(new Shipment("SHP-029", "José Andrade", new PackageDimensions(60.0, 30.0, 20.0, 14.0), 1));
        shipments.add(new Shipment("SHP-030", "Camila Vázquez", new PackageDimensions(45.0, 25.0, 10.0, 32.5), 3));
        shipments.add(new Shipment("SHP-031", "Andrés Molina", new PackageDimensions(75.0, 60.0, 40.0, 21.0), 1));
        shipments.add(new Shipment("SHP-032", "Lucía Herrera", new PackageDimensions(40.0, 50.0, 30.0, 21.0), 4));
        shipments.add(new Shipment("shp-033", "Pablo Cárdenas", new PackageDimensions(65.0, 55.0, 20.0, 9.0), 1));
        shipments.add(new Shipment("SHP-034", "Daniela Ortiz", new PackageDimensions(55.0, 30.0, 30.0, 10.5), 5));
        shipments.add(new Shipment("ShP-035", "Miguel Salazar", new PackageDimensions(75.0, 40.0, 15.0, 32.5), 2));
        shipments.add(new Shipment("SHP-036", "FERNANDA LEÓN", new PackageDimensions(55.0, 50.0, 50.0, 7.5), 4));
        shipments.add(new Shipment("SHP-037", "Ricardo Ponce", new PackageDimensions(50.0, 15.0, 50.0, 18.5), 3));
        shipments.add(new Shipment("SHP-038", "Gabriela Núñez", new PackageDimensions(25.0, 45.0, 45.0, 14.0), 2));
        shipments.add(new Shipment("SHP-039", "esteban castro", new PackageDimensions(75.0, 60.0, 45.0, 12.0), 2));
        shipments.add(new Shipment("SHP-040", "Natalia Peña", new PackageDimensions(45.0, 55.0, 20.0, 30.0), 5));
        shipments.add(new Shipment("SHP-041", "Ana Torres", new PackageDimensions(70.0, 60.0, 25.0, 30.0), 2));
        shipments.add(new Shipment("ShP-042", "Luis Mora", new PackageDimensions(40.0, 30.0, 15.0, 6.0), 5));
        shipments.add(new Shipment("SHP-043", "Carlos Vega", new PackageDimensions(55.0, 30.0, 45.0, 9.0), 4));
        shipments.add(new Shipment("shp-044", "Sofía Cordero", new PackageDimensions(25.0, 55.0, 10.0, 18.5), 2));
        shipments.add(new Shipment("SHP-045", "MATEO ROJAS", new PackageDimensions(50.0, 60.0, 35.0, 30.0), 3));
        shipments.add(new Shipment("SHP-046", "Valentina Ruiz", new PackageDimensions(35.0, 55.0, 15.0, 14.0), 2));
        shipments.add(new Shipment("SHP-047", "Diego Pérez", new PackageDimensions(50.0, 60.0, 25.0, 25.0), 3));
        shipments.add(new Shipment("SHP-048", "María López", new PackageDimensions(20.0, 35.0, 45.0, 25.0), 4));
        shipments.add(new Shipment("ShP-049", "José Andrade", new PackageDimensions(40.0, 45.0, 30.0, 16.0), 3));
        shipments.add(new Shipment("SHP-050", "Camila Vázquez", new PackageDimensions(70.0, 35.0, 15.0, 32.5), 3));
        shipments.add(new Shipment("SHP-051", "Andrés Molina", new PackageDimensions(25.0, 35.0, 50.0, 9.0), 1));
        shipments.add(new Shipment("SHP-052", "lucía herrera", new PackageDimensions(70.0, 25.0, 10.0, 12.0), 2));
        shipments.add(new Shipment("SHP-053", "Pablo Cárdenas", new PackageDimensions(70.0, 15.0, 45.0, 18.5), 3));
        shipments.add(new Shipment("SHP-054", "DANIELA ORTIZ", new PackageDimensions(30.0, 20.0, 40.0, 14.0), 3));
        shipments.add(new Shipment("shp-055", "Miguel Salazar", new PackageDimensions(75.0, 60.0, 30.0, 18.5), 5));
        shipments.add(new Shipment("ShP-056", "Fernanda León", new PackageDimensions(80.0, 60.0, 45.0, 27.5), 4));
        shipments.add(new Shipment("SHP-057", "Ricardo Ponce", new PackageDimensions(50.0, 30.0, 50.0, 16.0), 5));
        shipments.add(new Shipment("SHP-058", "Gabriela Núñez", new PackageDimensions(75.0, 50.0, 45.0, 18.5), 1));
        shipments.add(new Shipment("SHP-059", "Esteban Castro", new PackageDimensions(75.0, 40.0, 10.0, 18.5), 4));
        shipments.add(new Shipment("SHP-060", "Natalia Peña", new PackageDimensions(45.0, 55.0, 35.0, 7.5), 2));
        shipments.add(new Shipment("SHP-061", "Ana Torres", new PackageDimensions(60.0, 30.0, 20.0, 23.5), 2));
        shipments.add(new Shipment("SHP-062", "Luis Mora", new PackageDimensions(80.0, 50.0, 20.0, 21.0), 3));
        shipments.add(new Shipment("ShP-063", "CARLOS VEGA", new PackageDimensions(30.0, 45.0, 45.0, 25.0), 1));
        shipments.add(new Shipment("SHP-064", "Sofía Cordero", new PackageDimensions(30.0, 45.0, 45.0, 25.0), 2));
        shipments.add(new Shipment("SHP-065", "mateo rojas", new PackageDimensions(20.0, 30.0, 30.0, 6.0), 2));
        shipments.add(new Shipment("shp-066", "Valentina Ruiz", new PackageDimensions(50.0, 40.0, 30.0, 30.0), 4));
        shipments.add(new Shipment("SHP-067", "Diego Pérez", new PackageDimensions(25.0, 30.0, 45.0, 30.0), 4));
        shipments.add(new Shipment("SHP-068", "María López", new PackageDimensions(40.0, 25.0, 10.0, 32.5), 4));
        shipments.add(new Shipment("SHP-069", "José Andrade", new PackageDimensions(40.0, 20.0, 45.0, 21.0), 3));
        shipments.add(new Shipment("ShP-070", "Camila Vázquez", new PackageDimensions(50.0, 50.0, 45.0, 4.5), 5));
        shipments.add(new Shipment("SHP-071", "Andrés Molina", new PackageDimensions(30.0, 35.0, 25.0, 7.5), 2));
        shipments.add(new Shipment("SHP-072", "LUCÍA HERRERA", new PackageDimensions(60.0, 50.0, 50.0, 21.0), 2));
        shipments.add(new Shipment("SHP-073", "Pablo Cárdenas", new PackageDimensions(20.0, 50.0, 30.0, 27.5), 3));
        shipments.add(new Shipment("SHP-074", "Daniela Ortiz", new PackageDimensions(30.0, 45.0, 40.0, 23.5), 3));
        shipments.add(new Shipment("SHP-075", "Miguel Salazar", new PackageDimensions(55.0, 55.0, 20.0, 4.5), 2));
        shipments.add(new Shipment("SHP-076", "Fernanda León", new PackageDimensions(65.0, 35.0, 25.0, 32.5), 2));
        shipments.add(new Shipment("shp-077", "Ricardo Ponce", new PackageDimensions(60.0, 25.0, 45.0, 7.5), 2));
        shipments.add(new Shipment("SHP-078", "gabriela núñez", new PackageDimensions(30.0, 40.0, 45.0, 21.0), 3));
        shipments.add(new Shipment("SHP-079", "Esteban Castro", new PackageDimensions(55.0, 50.0, 40.0, 14.0), 1));
        shipments.add(new Shipment("SHP-080", "Natalia Peña", new PackageDimensions(35.0, 50.0, 30.0, 14.0), 1));
        shipments.add(new Shipment("SHP-081", "ANA TORRES", new PackageDimensions(25.0, 30.0, 45.0, 27.5), 2));
        shipments.add(new Shipment("SHP-082", "Luis Mora", new PackageDimensions(60.0, 55.0, 10.0, 6.0), 5));
        shipments.add(new Shipment("SHP-083", "Carlos Vega", new PackageDimensions(60.0, 30.0, 25.0, 23.5), 3));
        shipments.add(new Shipment("ShP-084", "Sofía Cordero", new PackageDimensions(25.0, 30.0, 10.0, 14.0), 4));
        shipments.add(new Shipment("SHP-085", "Mateo Rojas", new PackageDimensions(55.0, 20.0, 10.0, 18.5), 4));
        shipments.add(new Shipment("SHP-086", "Valentina Ruiz", new PackageDimensions(25.0, 30.0, 20.0, 14.0), 5));
        shipments.add(new Shipment("SHP-087", "Diego Pérez", new PackageDimensions(30.0, 20.0, 10.0, 12.0), 4));
        shipments.add(new Shipment("shp-088", "María López", new PackageDimensions(75.0, 35.0, 30.0, 21.0), 5));
        shipments.add(new Shipment("SHP-089", "José Andrade", new PackageDimensions(70.0, 35.0, 20.0, 27.5), 5));
        shipments.add(new Shipment("SHP-090", "CAMILA VÁZQUEZ", new PackageDimensions(70.0, 60.0, 40.0, 4.5), 2));
        shipments.add(new Shipment("shp-003", "cARLOS vEGA", new PackageDimensions(75.0, 50.0, 20.0, 23.5), 2));
        shipments.add(new Shipment("SHP-007", "dIEGO pÉREZ", new PackageDimensions(30.0, 45.0, 40.0, 4.5), 5));
        shipments.add(new Shipment("shp-012", "lUCÍA hERRERA", new PackageDimensions(80.0, 15.0, 35.0, 27.5), 4));
        shipments.add(new Shipment("SHP-018", "gabriela núñez", new PackageDimensions(20.0, 35.0, 50.0, 18.5), 1));
        shipments.add(new Shipment("shp-026", "VALENTINA RUIZ", new PackageDimensions(25.0, 20.0, 50.0, 9.0), 5));
        shipments.add(new Shipment("SHP-035", "mIGUEL sALAZAR", new PackageDimensions(75.0, 40.0, 15.0, 32.5), 2));
        shipments.add(new Shipment("shp-044", "sOFÍA cORDERO", new PackageDimensions(25.0, 55.0, 10.0, 18.5), 2));
        shipments.add(new Shipment("SHP-058", "gABRIELA nÚÑEZ", new PackageDimensions(75.0, 50.0, 45.0, 18.5), 1));
        shipments.add(new Shipment("shp-072", "lucía herrera", new PackageDimensions(60.0, 50.0, 50.0, 21.0), 2));
        shipments.add(new Shipment("SHP-089", "jOSÉ aNDRADE", new PackageDimensions(70.0, 35.0, 20.0, 27.5), 5));

        return shipments;
    }
}
