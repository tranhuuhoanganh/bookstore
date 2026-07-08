package com.bookstore.mapper;

import com.bookstore.dto.DonHangDTO;
import com.bookstore.entity.DonHang;
import org.springframework.stereotype.Component;

@Component
public class DonHangMapper {
    public DonHangDTO toDTO(DonHang donHang){
        DonHangDTO dto = new DonHangDTO();
        dto.setMaDonHang(donHang.getMaDonHang());
        dto.setNgayTao(donHang.getNgayTao());
        dto.setTongTien(donHang.getTongtien());
        if (donHang.getHinhThucThanhToan() != null) {
            dto.setHinhThucThanhToan(
                    donHang.getHinhThucThanhToan().getHinhThucThanhToan()
            );
        }

        return dto;
    }
}
