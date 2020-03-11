package lk.naseeha.UserService.service;

import lk.naseeha.UserService.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface UserService {

    public User save(User user);

    public Optional<User> ViewProfile(Long nic);

    public List<User> Search(String bloodGroup,String location);

    public void delete(Long nic);

    public List<User> getAllUser();

  //  public User update(User user);
}
