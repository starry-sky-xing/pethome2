package cn.itsource.org.controller;

import cn.itsource.basic.utiles.JsonResult;
import cn.itsource.basic.utiles.PageBean;
import cn.itsource.org.domain.Dictionary;
import cn.itsource.org.query.DictionaryQuery;
import cn.itsource.org.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dictionary")
public class DictionaryController {
    @Autowired
    private IDictionaryService iDictionaryService;

    @DeleteMapping("/{id}")
    public JsonResult delete(@PathVariable("id") Long id){
        try {
            iDictionaryService.delete(id);
            return new JsonResult();
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.me(e.getMessage());
        }
    }

    //添加和蟹盖
    @PutMapping
    public JsonResult save(@RequestBody Dictionary dictionary){
        try {
            if(dictionary.getId()==null){
                iDictionaryService.add(dictionary);
            }else {
                iDictionaryService.update(dictionary);
            }
            return new JsonResult();
        } catch (Exception e) {
            e.printStackTrace();
            return JsonResult.me(e.getMessage());
        }
    }
    //fenye
    @PostMapping("/findPage")
    public PageBean<Dictionary> findPage(@RequestBody DictionaryQuery dictionaryQuery){
        return iDictionaryService.findPage(dictionaryQuery );
    }
}
