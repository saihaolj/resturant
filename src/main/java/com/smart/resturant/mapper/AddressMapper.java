package com.smart.resturant.mapper;

import com.smart.resturant.entity.Address;

import java.util.List;

public interface AddressMapper {
    /**
     * 插入地址数据（增）
     * @param address 地址的数据
     * @return 受影响的行数
     */
    Integer insert(Address address);

    /**
     * 删除地址数据（删）
     * @param aid 地址的aid
     * @return 受影响的行数
     */
    Integer deleteByAid(Integer aid);

    /**
     * 修改地址数据（改）
     * @param address 地址的数据
     * @return 受影响的行数
     */
    Integer updateByAid(Address address);

    /**
     * 查询当前用户的所有地址数据（查）
     * @param uid 用户的uid
     * @return 如果找到对应的地址集合信息，则返回这个集合数据；如果没有找到，则返回null值
     */
    List<Address> findByUid(Integer uid);

    /**
     * 查询当前地址详细信息
     * @param aid 地址的aid
     * @return 如果找到对应的地址信息，则返回这个地址信息数据；如果没有找到，则返回null值
     */
    Address findByAid(Integer aid);
}
