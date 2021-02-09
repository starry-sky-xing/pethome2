package cn.itsource.shop.controller;

import cn.itsource.basic.utiles.JsonResult;
import cn.itsource.shop.domain.Shop;
import cn.itsource.shop.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private IShopService shopService;

    //入驻
    @PostMapping("register")
    public JsonResult register(@RequestBody Shop shop){
        try {
            shopService.register(shop);
            return JsonResult.me();
        } catch (Exception e) {
            e.printStackTrace();
            return new JsonResult(e.getMessage());
        }
    }
}
