package com.AndstampAPI.controller;

import com.AndstampAPI.Philately;
import com.AndstampAPI.service.PhilatelyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stamps")
public class PhilatelyController {

    private final PhilatelyService service;

    public PhilatelyController(PhilatelyService service) {
        this.service = service;
    }

    // CREATE
    @PostMapping
    public Philately createStamp(@RequestBody Philately stamp) {
        return service.addStamp(stamp);
    }

    // READ ALL
    @GetMapping
    public List<Philately> getAllStamps() {
        return service.getAllStamps();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Philately getStamp(@PathVariable Long id) {
        return service.getStampById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Philately updateStamp(@PathVariable Long id, @RequestBody Philately stamp) {
        return service.updateStamp(id, stamp);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStamp(@PathVariable Long id) {
        service.deleteStamp(id);
        return "Stamp deleted successfully!";
    }
}

