package com.bookstore.repository;

import com.bookstore.entity.HinhAnh;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface HinhAnhRepository extends JpaRepository<HinhAnh,Integer> {
    @Query("""
        SELECT h.tenHinhAnh FROM HinhAnh h WHERE h.sach.maSach = :maSach
    """)
    List<String> findHinhAnhBySach(Integer maSach);
}
