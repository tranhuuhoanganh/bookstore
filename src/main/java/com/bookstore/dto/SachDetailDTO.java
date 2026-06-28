package com.bookstore.dto;

import java.util.List;

public record SachDetailDTO(
        Integer maSach,
        String tenSach,
        String tenTacGia,
        Double giaBan,
        Double giaNiemYet,
        String moTa,
        List<String> hinhAnh,
        List<String> theLoai
) {
}