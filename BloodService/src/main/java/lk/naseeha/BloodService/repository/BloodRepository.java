package lk.naseeha.BloodService.repository;

import lk.naseeha.BloodService.model.BloodRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BloodRepository extends JpaRepository<BloodRequest,Integer> {

    @Query("select b from BloodRequest b where b.requestBloodType = :requestBloodType")
    List<BloodRequest> getRequestedBloodGroupList(@Param("requestBloodType") String requestBloodType);


}
