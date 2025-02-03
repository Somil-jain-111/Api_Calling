package com.example.Rest_Api_Calling.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetPostDTO {
//    private Long id;
    private String title;
    private String description;
}
