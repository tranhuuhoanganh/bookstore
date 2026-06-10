package entity;

import lombok.Data;

@Data
public class HinhAnh {
    private int maHinhAnh;
    private String tenHinhAnh;
    private boolean icon;
    private String link;
    private String duLieuAnh;
    private  Sach sach;
}
