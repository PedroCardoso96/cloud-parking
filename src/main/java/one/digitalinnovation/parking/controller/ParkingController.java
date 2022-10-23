package one.digitalinnovation.parking.controller;

import one.digitalinnovation.parking.model.Parking;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ParkingController {

    @GetMapping
    public List<Parking> findAll(){
        var parking = new Parking();
        parking.setColor("PRETO");
        parking.setLicense("MISS-1111");
        parking.setModel("VW GOL");
        parking.setState("SP");

        return Arrays.asList(parking, parking);

    }

}
