package lk.naseeha.CampService.service;

import lk.naseeha.CampService.model.Camp;

import java.util.List;

public interface CampService {

    public Camp saveOrUpdate(Camp camp);

    public List<Camp> getAllCamp();
    
}
