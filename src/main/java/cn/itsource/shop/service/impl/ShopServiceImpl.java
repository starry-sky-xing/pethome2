package cn.itsource.shop.service.impl;

import cn.itsource.basic.service.impl.BaseServiceImpl;
import cn.itsource.basic.utiles.MD5Utils;
import cn.itsource.basic.utiles.StrUtils;
import cn.itsource.org.domain.Employee;
import cn.itsource.org.mapper.EmployeeMapper;
import cn.itsource.shop.domain.Shop;
import cn.itsource.shop.mapper.ShopMapper;
import cn.itsource.shop.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl extends BaseServiceImpl<Shop> implements IShopService {

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public void register(Shop shop) {
        //保存shop 没有adminid
        shopMapper.add(shop);
        Employee admin = shop.getAdmin();
        //给admin密码添加颜值
        String salt= StrUtils.getComplexRandomString(10);
        admin.setSalt(salt);
        //密码加密 mad5 密码和颜值
        admin.setPassword(MD5Utils.encrypByMd5(admin.getPassword()+admin.getSalt()));

//        //保存一个登录信息
//        createdLoginInfo();
        admin.setShop(shop);
        //保存admin
        employeeMapper.add(admin);
        //更新shop 有admin id
        shopMapper.update(shop);
    }
}
