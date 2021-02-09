package cn.itsource.org.controller;

import cn.itsource.basic.utiles.JsonResult;
import cn.itsource.org.domain.Shop;
import cn.itsource.org.service.IShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private IShopService shopService;

    @RequestMapping("/settlement")
    public JsonResult settlement(@RequestBody Shop shop){
        try {
            shopService.settlement(shop);
            return new JsonResult();
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.me(e.getMessage());
        }
    }
}
