package com.AdabNY.fragrance.fragrance;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class FragranceService {
    private final FragranceRepository fragranceRepository;

    @Autowired
    public FragranceService(FragranceRepository fragranceRepository){
        this.fragranceRepository = fragranceRepository;
    }

    public List<Fragrance> getFragrances(){
        return fragranceRepository.findAll();
    }

    public List<Fragrance> getFragranceByBrand(String brand){
        return fragranceRepository.findAll().stream()
                .filter(fragrance -> brand.equals(fragrance.getBrand()))
                .collect(Collectors.toList());
    }

    public List<Fragrance> getFragranceByName(String searchText){
        return fragranceRepository.findAll().stream()
                .filter(fragrance -> fragrance.getName().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public Fragrance addFragrance(Fragrance fragrance){
        fragranceRepository.save(fragrance);
        return fragrance;
    }

    public Fragrance updateFragrance(Fragrance updatedFragrance){
        Optional<Fragrance> existingFragrance = fragranceRepository.findByName(updatedFragrance.getName());

        if(existingFragrance.isPresent()){
            Fragrance fragToUpdate = existingFragrance.get();

            fragToUpdate.setName(updatedFragrance.getName());
            fragToUpdate.setUrl(updatedFragrance.getUrl());
            fragToUpdate.setBrand(updatedFragrance.getBrand());
            fragToUpdate.setCountry(updatedFragrance.getCountry());
            fragToUpdate.setGender(updatedFragrance.getGender());
            //set later
            fragranceRepository.save(fragToUpdate);
            return fragToUpdate;
        }

        return null;
    }

    @Transactional
    public void deleteFragrance(String name){
        fragranceRepository.deleteByName(name);
    }
}
