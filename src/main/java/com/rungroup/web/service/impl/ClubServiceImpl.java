package com.rungroup.web.service.impl;

import com.rungroup.web.Models.Club;
import com.rungroup.web.Repository.ClubRepository;
import com.rungroup.web.dto.ClubDto;
import com.rungroup.web.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class ClubServiceImpl implements ClubService {
    private ClubRepository clubRepository;

    @Autowired
    public ClubServiceImpl(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    @Override
    public List<ClubDto> findAllClubs() {
        List<Club> clubs=clubRepository.findAll();
        return clubs.stream().map((club)->mapToClubDto(club)).collect(Collectors.toList());
    }

    private ClubDto mapToClubDto(Club club) {
        ClubDto clubDto=ClubDto.builder()
                .id(club.getId())
                .title(club.getTitle())
                .photoUrl(club.getPhotoUrl())
                .content(club.getContent())
                .createdOn(club.getCreateOn())
                .updateOn(club.getUpdateOn())
                .build();
        return clubDto;
    }
}
