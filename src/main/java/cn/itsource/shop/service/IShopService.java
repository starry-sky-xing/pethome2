package cn.itsource.shop.service;

import cn.itsource.basic.service.IBaseService;
import cn.itsource.shop.domain.Shop;

public interface IShopService extends IBaseService<Shop>{
    void register(Shop shop);
}
