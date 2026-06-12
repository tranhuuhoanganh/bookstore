package com.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
@Entity
@Data
@Table(name = "hinh_thuc_thanh_toan")
public class HinhThucThanhToan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_thuc_thanh_toan")
    private int maHinhThucThanhToan;
    @Column(name = "hinh_thuc_giao_hang")
    private  String hinhThucThanhToan;
    @Column(name = "mo_ta")
    private String moTa;
    @Column(name = "chi_phi_giao_hang")
    private double chiPhiThanhToan;
    @OneToMany(
            mappedBy = "maDonHang",
            fetch = FetchType.LAZY,cascade = {
            CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH
    })
    private List<DonHang> donHang;
}
