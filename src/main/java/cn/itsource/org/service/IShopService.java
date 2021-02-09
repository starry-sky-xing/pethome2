package cn.itsource.org.service;

import cn.itsource.basic.service.IBaseService;
import cn.itsource.org.domain.Shop;

public interface IShopService extends IBaseService<Shop> {
    void settlement(Shop shop);
}
