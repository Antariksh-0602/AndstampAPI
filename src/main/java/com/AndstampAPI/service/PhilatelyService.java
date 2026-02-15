package com.AndstampAPI.service;

import com.AndstampAPI.Philately;
import com.AndstampAPI.repository.PhilatelyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhilatelyService {

    private final PhilatelyRepository repository;

    public PhilatelyService(PhilatelyRepository repository) {
        this.repository = repository;
    }

    // CREATE
    public Philately addStamp(Philately stamp) {
        return repository.save(stamp);
    }

    // READ ALL
    public List<Philately> getAllStamps() {
        return repository.findAll();
    }

    // READ ONE
    public Philately getStampById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Stamp not found"));
    }

    // UPDATE
    public Philately updateStamp(Long id, Philately updated) {
        Philately stamp = getStampById(id);
        stamp.setStampname(updated.getStampname());
        stamp.setCountryname(updated.getCountryname());
        stamp.setYear(updated.getYear());
        return repository.save(stamp);
    }

    // DELETE
    public void deleteStamp(Long id) {
        repository.deleteById(id);
    }
    public List<Philately> searchByStampName(String keyword) {
        return repository.findByStampnameContainingIgnoreCase(keyword);
    }

}
