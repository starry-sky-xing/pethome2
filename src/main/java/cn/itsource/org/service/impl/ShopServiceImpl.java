package cn.itsource.org.service.impl;

import cn.itsource.basic.service.impl.BaseServiceImpl;
import cn.itsource.org.domain.Shop;
import cn.itsource.org.service.IShopService;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl extends BaseServiceImpl<Shop> implements IShopService {

    /**
     * 商家入驻
     * @param shop
     */
    @Override
    public void settlement(Shop shop) {

    }
}
