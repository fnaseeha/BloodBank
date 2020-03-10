package lk.naseeha.BloodService.service;

import lk.naseeha.BloodService.model.BloodRequest;
import lk.naseeha.BloodService.repository.BloodRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BloodServiceImpl implements BloodService {

    @Autowired
    BloodRepository bloodRepository;

    @Override
    public List<BloodRequest> RequestBlood(String bloodGroup) {
        return bloodRepository.getRequestedBloodGroupList(bloodGroup);
    }

    @Override
    public List<BloodRequest> getAllRequestBlood() {
        return bloodRepository.findAll();
    }

    @Override
    public BloodRequest save(BloodRequest bloodRequest) {
        return bloodRepository.save(bloodRequest);
    }
}
