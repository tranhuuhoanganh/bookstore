package com.bookstore.Controller;

import com.bookstore.dto.SachDetailDTO;
import com.bookstore.service.SachDetailService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sach")
@CrossOrigin("*")
public class SachDetailController {
    private final SachDetailService SachDetailService;

    public SachDetailController(
            SachDetailService SachDetailService) {

        this.SachDetailService = SachDetailService;
    }

    @GetMapping("/{maSach}")
    public SachDetailDTO getSachDetail(
            @PathVariable Integer maSach) {

        return SachDetailService.getSachDetail(maSach);
    }
}
