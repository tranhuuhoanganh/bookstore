package com.bookstore.dto;

import lombok.Data;

import java.sql.Date;

@Data
public class DonHangDTO {
    private int maDonHang;
    private Date ngayTao;
    private double tongTien;
    private String hinhThucThanhToan;
}
