package com.rungroup.web.service.impl;

import com.rungroup.web.Repository.ClubRepository;
import com.rungroup.web.dto.ClubDto;
import com.rungroup.web.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        return null;
    }
}
