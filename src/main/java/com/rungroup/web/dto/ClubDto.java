package com.rungroup.web.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Builder(toBuilder = true)
public class ClubDto {
    private Long id;
    private String title;
    private String photoUrl;
    private String content;

    private LocalDateTime createdOn;
    private LocalDateTime updateOn;


}
