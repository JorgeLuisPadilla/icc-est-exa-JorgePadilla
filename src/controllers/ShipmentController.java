package controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import models.Shipment;

public class ShipmentController {

  public Set<Shipment> filterAndOrderShipments(
      List<Shipment> shipments,
      double minimumVolume) {
    Set<Shipment> result = new TreeSet<>((s1, s2) -> {
      if (Double.compare(s1.getDimensions().getVolume(), s2.getDimensions().getVolume()) == 0
          && s1.getTrackingCode().equalsIgnoreCase(s2.getTrackingCode())) {
        return 0;
      }

      int volumeCompare = Double.compare(s2.getDimensions().getVolume(), s1.getDimensions().getVolume());
      if (volumeCompare != 0) {
        return volumeCompare;
      }

      return s1.getTrackingCode().compareToIgnoreCase(s2.getTrackingCode());
    });

    if (shipments != null) {
      for (Shipment shipment : shipments) {
        if (shipment != null && shipment.getDimensions() != null) {
          if (shipment.getDimensions().getVolume() >= minimumVolume) {
            result.add(shipment);
          }
        }
      }
    }

    return result;
  }

  public List<Shipment> classifyAndExtractShipments(
      List<Shipment> shipments,
      String requestedCategory) {
    Map<String, Set<Shipment>> map = new TreeMap<>();

    map.put("BULKY", createCategorySet());
    map.put("LIGHT", createCategorySet());
    map.put("REGULAR", createCategorySet());

    if (shipments != null) {
      for (Shipment shipment : shipments) {
        if (shipment != null && shipment.getDimensions() != null) {
          String category = determineCategory(shipment);
          map.get(category).add(shipment);
        }
      }
    }

    if (requestedCategory == null) {
      return new ArrayList<>();
    }

    String normalizedCategory = requestedCategory.trim().toUpperCase();

    if (!map.containsKey(normalizedCategory)) {
      return new ArrayList<>();
    }

    return new ArrayList<>(map.get(normalizedCategory));
  }

  private Set<Shipment> createCategorySet() {
    return new TreeSet<>((s1, s2) -> {
      if (s1.getPriority() == s2.getPriority()
          && s1.getTrackingCode().equalsIgnoreCase(s2.getTrackingCode())) {
        return 0;
      }

      int priorityCompare = Integer.compare(s2.getPriority(), s1.getPriority());
      if (priorityCompare != 0) {
        return priorityCompare;
      }

      return s1.getTrackingCode().compareToIgnoreCase(s2.getTrackingCode());
    });
  }

  private String determineCategory(Shipment shipment) {
    double vol = shipment.getDimensions().getVolume();
    double weight = shipment.getDimensions().getWeight();

    if (vol >= 120000 || weight >= 25) {
      return "BULKY";
    }
    if (vol >= 30000) {
      return "REGULAR";
    }
    return "LIGHT";
  }
}
