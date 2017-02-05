package com.jaljali.provider.impl;

import com.jaljali.domain.House;
import com.jaljali.mapper.HouseMapper;
import com.jaljali.provider.HouseProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HouseProviderImpl implements HouseProvider{

    @Autowired
    private HouseMapper houseMapper;

    @Override
    public List<House> reads() {
        return houseMapper.reads();
    }

    @Override
    public House read(Long id) {
        return houseMapper.read(id);
    }

    @Override
    public void create(House house) {
        houseMapper.create(house);
    }

    @Override
    public void update(House house) {
        houseMapper.update(house);
    }

    @Override
    public void delete(Long id) {
        houseMapper.delete(id);
    }
}
