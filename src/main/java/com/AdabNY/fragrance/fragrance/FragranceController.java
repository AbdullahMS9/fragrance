package com.AdabNY.fragrance.fragrance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/fragrance")
public class FragranceController {
    private final FragranceService fragranceService;

    @Autowired
    public FragranceController(FragranceService fragranceService){
        this.fragranceService = fragranceService;
    }

    @GetMapping
    public List<Fragrance> getFragrance(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String brand,
            @RequestParam(required = false) String country,
            @RequestParam(required = false) String gender){
        //
        if(name != null){
            return fragranceService.getFragranceByName(name);
        } else {
             return fragranceService.getFragrances();
        }
    }

    @PostMapping
    public ResponseEntity<Fragrance> addFragrance(@RequestBody Fragrance fragrance){
        Fragrance createdFragrance = fragranceService.addFragrance(fragrance);
        return new ResponseEntity<>(createdFragrance, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Fragrance> updateFragrance(@RequestBody Fragrance updatedFragrance) {
        Fragrance resultFragrance = fragranceService.updateFragrance(updatedFragrance);
        if (resultFragrance != null) {
            return new ResponseEntity<>(resultFragrance, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{fragranceName}")
    public ResponseEntity<String> deleteFragrance(@PathVariable String fragranceName) {
        fragranceService.deleteFragrance(fragranceName);
        return new ResponseEntity<>("Fragrance deleted successfully", HttpStatus.OK);
    }
}
