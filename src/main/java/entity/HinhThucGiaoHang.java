package entity;

import lombok.Data;

import java.util.List;
@Data
public class HinhThucGiaoHang {
    private int maHinhThucGiaoHang;
    private  String hinhThucGiaoHang;
    private String moTa;
    private double chiPhiGiaoHang;
    private List<ChiTietDonHang> danhSachDonHang;
}
