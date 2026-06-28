package com.bookstore.service.impl;

import com.bookstore.dto.SachHomeDTO;
import com.bookstore.repository.SachRepository;
import com.bookstore.service.SachService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SachServiceImpl implements SachService {

    private final SachRepository sachRepository;

    public SachServiceImpl(
            SachRepository sachRepository) {

        this.sachRepository = sachRepository;
    }

    @Override
    public List<SachHomeDTO> getSachHome() {
        return sachRepository.getSachHome();
    }
}