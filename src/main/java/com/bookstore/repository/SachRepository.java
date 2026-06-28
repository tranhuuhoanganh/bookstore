package com.bookstore.repository;

import com.bookstore.dto.SachHomeDTO;
import com.bookstore.entity.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SachRepository
        extends JpaRepository<Sach, Integer> {

    @Query("""
        SELECT new com.bookstore.dto.SachHomeDTO(
            s.maSach,
            s.tenSach,
            s.giaBan,
            s.moTa,
            h.tenHinhAnh
        )
        FROM Sach s
        LEFT JOIN HinhAnh h
            ON h.sach.maSach = s.maSach
        WHERE h.icon = true
        ORDER BY s.maSach DESC
    """)
    List<SachHomeDTO> getSachHome();
}