package entity;

import lombok.Data;

import java.util.List;
@Data
public class NguoiDung {
    private int maNguoiDung;
    private String hoDem;
    private String ten;
    private String tenDangNhap;
    private String matKhau;
    private char gioiTinh;
    private String diaChiMuaHang;
    private String diaChiGiaoHang;
    private List<DanhGia> danhSachDanhGia;
    private List<SachYeuThich> danhSachYeuThich;
    private List<Quyen> danhSachQuyen;
    private List<DonHang> danhSachDonHang;
}
