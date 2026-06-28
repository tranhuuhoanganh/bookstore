package com.bookstore.mapper;

import com.bookstore.dto.SachDetailDTO;
import com.bookstore.entity.Sach;
import java.util.List;

public class SachDetailMapper {
    public static SachDetailDTO toDetailDTO(
            Sach sach,
            List<String> hinhAnh,
            List<String> theLoai
    ) {

        return new SachDetailDTO(
                sach.getMaSach(),
                sach.getTenSach(),
                sach.getTenTacGia(),
                sach.getGiaBan(),
                sach.getGiaNiemYet(),
                sach.getMoTa(),
                hinhAnh,
                theLoai
        );
    }
}
