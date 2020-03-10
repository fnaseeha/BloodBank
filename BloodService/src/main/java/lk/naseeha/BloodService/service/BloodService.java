package lk.naseeha.BloodService.service;

import lk.naseeha.BloodService.model.BloodRequest;

import java.util.List;

public interface BloodService {


    List<BloodRequest> RequestBlood(String bloodGroup);

    List<BloodRequest> getAllRequestBlood();

    BloodRequest save(BloodRequest bloodRequest);
}
