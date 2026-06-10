package entity;

import lombok.Data;

import java.util.List;
@Data
public class HinhThucThanhToan {
    private int maHinhThucThanhToan;
    private  String hinhThucThanhToan;
    private String moTa;
    private double chiPhiThanhToan;
    private List<ChiTietDonHang> danhSachDonHang;
}
