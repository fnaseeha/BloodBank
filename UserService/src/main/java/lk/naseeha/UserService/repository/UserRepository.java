package lk.naseeha.UserService.repository;

import lk.naseeha.UserService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("select u from User u inner join u.address a  where a.city = :location or u.bloodGroup = :bloodGroup ")
    List<User> findByBloodGroupAndLocation(@Param("bloodGroup") String bloodGroup,@Param("location") String location);

}
