package lk.naseeha.UserService.controller;

import lk.naseeha.UserService.model.User;
import lk.naseeha.UserService.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/userSaveOrUpdate",method = RequestMethod.POST)
    public User saveOrUpdate(@RequestBody User user){
        return userService.save(user);
    }

    @RequestMapping(value="/userProfile/{nic}",method = RequestMethod.GET)
    public Optional<User> ViewProfile(@PathVariable String nic){
        return userService.ViewProfile(nic);
    }

    @RequestMapping(value = "/userSearch/{bloodGroup}/{location}", method = RequestMethod.GET)
    public List<User> searchData(@PathVariable String bloodGroup, @PathVariable String location){
        return userService.Search(bloodGroup, location);
    }

    //Admin

    @RequestMapping(value="/userDelete/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable String nic){
         userService.delete(nic);
         return nic;
    }


    @RequestMapping(value="/userGet",method = RequestMethod.GET)
    public List<User> getAllUser(){
        return userService.getAllUser();
    }





}
