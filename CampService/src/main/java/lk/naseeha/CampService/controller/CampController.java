package lk.naseeha.CampService.controller;

import lk.naseeha.CampService.model.Camp;
import lk.naseeha.CampService.service.CampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CampController {

    @Autowired
    CampService campService;

    @RequestMapping(value = "/getAllCamp",method = RequestMethod.GET)
    public List<Camp> getAllCamp(){
        return campService.getAllCamp();
    }

    @RequestMapping(value = "/DeleteCamp/{id}",method = RequestMethod.DELETE)
    public int deleteCamp(@PathVariable int id){
        campService.deleteCamp(id);
        return id;
    }
    @RequestMapping(value = "/getCamp/{id}",method = RequestMethod.GET)
    public Optional<Camp> getCampById(@PathVariable int id){
        return campService.getCampById(id);
    }

    @RequestMapping(value = "/saveCamp",method = RequestMethod.POST)
    public Camp insert(@RequestBody Camp camp){
        return campService.saveOrUpdate(camp);
    }

}
