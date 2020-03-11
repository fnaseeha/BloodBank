package lk.naseeha.CampService.service;

import lk.naseeha.CampService.model.Camp;

import java.util.List;
import java.util.Optional;

public interface CampService {

    public Camp saveOrUpdate(Camp camp);

    public List<Camp> getAllCamp();

    public void deleteCamp(int id);

    public Optional<Camp> getCampById(int id);

}
