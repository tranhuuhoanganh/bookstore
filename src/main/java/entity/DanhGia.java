package entity;

import lombok.Data;

@Data
public class DanhGia {
    private long maDanhGia;
    private float diemXepHang;
    private String nhanXet;
    private Sach sach;
    private NguoiDung nguoiDung;
}
