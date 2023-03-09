package com.smart.resturant.mapper;

import com.smart.resturant.ResturantApplication;
import com.smart.resturant.entity.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ResturantApplication.class)
@RunWith(SpringRunner.class)
public class AddressMapperTests {
    @Autowired
    private AddressMapper addressMapper;

    @Test
    public void insert(){
        Address address = new Address();
        address.setAid(1);
        address.setUid(1);
        Integer rows = addressMapper.insert(address);
        System.out.println(rows);
    }

    @Test
    public void deleteByAid(){
        Integer rows = addressMapper.deleteByAid(1);
        System.out.println(rows);
    }

    @Test
    public void findByAid(){
        System.out.println(addressMapper.findByAid(1));
    }

    @Test
    public void findByUid(){
        System.out.println(addressMapper.findByUid(1));
    }
}
