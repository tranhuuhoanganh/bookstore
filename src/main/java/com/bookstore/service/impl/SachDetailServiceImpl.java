package com.bookstore.service.impl;

import com.bookstore.dto.SachDetailDTO;
import com.bookstore.entity.Sach;
import com.bookstore.mapper.SachDetailMapper;
import com.bookstore.repository.HinhAnhRepository;
import com.bookstore.repository.SachRepository;
import com.bookstore.repository.TheLoaiRepository;
import com.bookstore.service.SachDetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachDetailServiceImpl
        implements SachDetailService {

    private final SachRepository sachRepository;
    private final HinhAnhRepository hinhAnhRepository;
    private final TheLoaiRepository theLoaiRepository;

    public SachDetailServiceImpl(
            SachRepository sachRepository,
            HinhAnhRepository hinhAnhRepository,
            TheLoaiRepository theLoaiRepository) {

        this.sachRepository = sachRepository;
        this.hinhAnhRepository = hinhAnhRepository;
        this.theLoaiRepository = theLoaiRepository;
    }

    @Override
    public SachDetailDTO getSachDetail(Integer maSach) {

        Sach sach = sachRepository
                .findById(maSach)
                .orElseThrow(() ->
                        new RuntimeException("Không tìm thấy sách"));

        List<String> hinhAnh =
                hinhAnhRepository.findHinhAnhBySach(maSach);

        List<String> theLoai =
                theLoaiRepository.findTheLoaiBySach(maSach);

        return SachDetailMapper.toDetailDTO(
                sach,
                hinhAnh,
                theLoai
        );
    }
}