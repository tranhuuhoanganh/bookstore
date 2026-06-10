package entity;

import lombok.Data;

import java.sql.Date;
import java.util.List;
@Data
public class DonHang {
    private int maDonHang;
    private Date ngayTao;
    private String diaChiMuaHang;
    private String getDiaChiNhanHang;
    private double tongTienSanPham;
    private double chiPhiGiaoHang;
    private double chiPhiThanhToan;
    private double tongtien;
    private List<ChiTietDonHang> danhSachChiTietDonHang;
    private NguoiDung nguoiDung;
    private HinhThucThanhToan hinhThucThanhToan;
    private HinhThucGiaoHang hinhThucGiaoHang;
}
