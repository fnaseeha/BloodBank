package lk.naseeha.CampService.service;

import lk.naseeha.CampService.model.Camp;
import lk.naseeha.CampService.repository.CampRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CampServiceImpl implements CampService{

    @Autowired
    CampRepository campRepository;

    @Override
    public Camp saveOrUpdate(Camp camp) {
        return campRepository.save(camp);
    }

    @Override
    public List<Camp> getAllCamp() {
        return campRepository.findAll();
    }

    @Override
    public void deleteCamp(int id) {
        campRepository.deleteById(id);
    }

    @Override
    public Optional<Camp> getCampById(int id) {
        return campRepository.findById(id);
    }
}
