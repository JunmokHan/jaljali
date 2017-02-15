package com.jaljali.service.impl;

import com.jaljali.domain.House;
import com.jaljali.provider.HouseProvider;
import com.jaljali.service.HouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseServiceImpl implements HouseService{

    @Autowired
    private HouseProvider houseProvider;

    @Override
    public List<House> reads() {
        return houseProvider.reads();
    }

    @Override
    public House read(Long id) {
        return houseProvider.read(id);
    }

    @Override
    public Long create(House house) {
        return houseProvider.create(house);
    }

    @Override
    public void update(House house) {
        houseProvider.update(house);
    }

    @Override
    public void delete(Long id) {
        houseProvider.delete(id);
    }
}
