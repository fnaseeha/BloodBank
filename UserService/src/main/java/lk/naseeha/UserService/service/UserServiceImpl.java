package lk.naseeha.UserService.service;

import lk.naseeha.UserService.model.User;
import lk.naseeha.UserService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public Optional<User> ViewProfile(String nic) {
        return userRepository.findById(nic);
    }

    @Override
    public List<User> Search(String bloodGroup, String location) {
        return userRepository.findByBloodGroupAndLocation(bloodGroup,location);
    }

    @Override
    public void delete(String nic) {
        userRepository.deleteById(nic);

    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

   /* @Override
    public User update(User user) {
        return userRepository
    }*/

}
