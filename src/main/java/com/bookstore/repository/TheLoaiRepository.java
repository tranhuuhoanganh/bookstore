package com.bookstore.repository;

import com.bookstore.entity.TheLoai;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TheLoaiRepository extends JpaRepository<TheLoai,Integer> {
    @Query("""
        SELECT t.tenTheLoai FROM  Sach s join s.danhSachTheLoai t WHERE s.maSach = :maSach
    """)
    List<String> findTheLoaiBySach(Integer maSach);
}
