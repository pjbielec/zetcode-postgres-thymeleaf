package zetcodepostgresthymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zetcodepostgresthymeleaf.bean.City;
import zetcodepostgresthymeleaf.repository.CityRepository;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll(){
        List<City> cities = (List<City>) repository.findAll();
        return cities;
    }

}
