package cn.itsource.org.controller;

import cn.itsource.basic.utiles.JsonResult;
import cn.itsource.basic.utiles.PageBean;
import cn.itsource.org.domain.DictionaryDetail;
import cn.itsource.org.query.DictionaryDetailQuery;
import cn.itsource.org.service.IDictionaryDetialService;
import cn.itsource.org.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dictionaryDetail")
public class DictionaryDetailController {

    @Autowired
    private IDictionaryDetialService iDictionaryDetialService;
    @DeleteMapping("/{id}")
    public JsonResult delete(@PathVariable("id") Long id){
        try {
            iDictionaryDetialService.delete(id);
            return new JsonResult();
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.me(e.getMessage());
        }
    }

    //添加和蟹盖
    @PutMapping
    public JsonResult save(@RequestBody DictionaryDetail dictionaryDetail){
        try {
            if(dictionaryDetail.getId()==null){
                iDictionaryDetialService.add(dictionaryDetail);
            }else {
                iDictionaryDetialService.update(dictionaryDetail);
            }
            return new JsonResult();
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.me(e.getMessage());
        }
    }
    //fenye
    @PostMapping("/findPage")
    public PageBean<DictionaryDetail> findPage(@RequestBody DictionaryDetailQuery dictionaryDetailQuery){
        return iDictionaryDetialService.findPage(dictionaryDetailQuery );
    }
}
