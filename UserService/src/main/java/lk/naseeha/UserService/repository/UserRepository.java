package lk.naseeha.UserService.repository;

import lk.naseeha.UserService.model.BloodRequest;
import lk.naseeha.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, String> {

    @Query("select u from User u where u.bloodGroup = :bloodGroup or u.location = :location")
    List<User> findByBloodGroupAndLocation(@Param("bloodGroup") String bloodGroup,
                                           @Param("location") String location);


}
