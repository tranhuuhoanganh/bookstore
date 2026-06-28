package com.bookstore.Controller;

import com.bookstore.dto.SachHomeDTO;
import com.bookstore.service.SachService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/sach")
@CrossOrigin("*")
public class SachController {

    private final SachService sachService;

    public SachController(SachService sachService) {
        this.sachService = sachService;
    }

    @GetMapping("/home")
    public List<SachHomeDTO> getSachHome() {
        return sachService.getSachHome();
    }
}