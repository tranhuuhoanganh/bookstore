package com.bookstore.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "hinh_anh")
public class HinhAnh {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_hinh_anh")
    private int maHinhAnh;
    @Column(name = "ten_hinh_anh",length = 256)
    private String tenHinhAnh;
    @Column(name = "icon")
    private boolean icon;
    @Column(name = "link")
    private String link;
    @Column(name = "du_lieu_anh")
    @Lob //dữ liệu lớn
    private String duLieuAnh;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "ma_sach",nullable = false)
    private  Sach sach;
}
