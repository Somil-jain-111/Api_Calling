package com.example.Rest_Api_Calling.client;

import com.example.Rest_Api_Calling.dto.GetPostDTO;

import java.util.List;

public interface PostClient {
    GetPostDTO getAllPost(GetPostDTO getPostDTO);

}
