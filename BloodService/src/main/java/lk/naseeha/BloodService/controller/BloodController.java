package lk.naseeha.BloodService.controller;

import lk.naseeha.BloodService.model.BloodRequest;
import lk.naseeha.BloodService.service.BloodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BloodController {

    @Autowired
    BloodService bloodService;

    @RequestMapping(value = "/getBloodRequest",method = RequestMethod.GET)
    public List<BloodRequest> getAllRequestBlood(){
        return bloodService.getAllRequestBlood();
    }

    @RequestMapping(value = "/getBloodRequest/{bloodType}",method = RequestMethod.GET)
    public List<BloodRequest> getRequestBlood(@PathVariable String bloodType){
        return bloodService.RequestBlood(bloodType);
    }

    @RequestMapping(value = "/saveBloodRequest",method = RequestMethod.POST)
    public BloodRequest save(@RequestBody BloodRequest bloodRequest){
        return bloodService.save(bloodRequest);
    }
}
