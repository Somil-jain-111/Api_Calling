package com.example.Rest_Api_Calling.client.Impl;

import com.example.Rest_Api_Calling.client.PostClient;
import com.example.Rest_Api_Calling.dto.GetPostDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

//@Component
@Service
@RequiredArgsConstructor
public class PostClientImpl implements PostClient {
    private final RestClient restClient;


//    public PostClientImpl(RestClient restClient) {
//        this.restClient = restClient;
//    }

    @Override
    public GetPostDTO getAllPost(GetPostDTO getPostDTO) {
        try {
            System.out.println("ssssssssssss "+getPostDTO);
             getPostDTO = restClient.post()
                    .uri("post/upload")
                    .body(getPostDTO) // Pass request body
                    .retrieve().body(new ParameterizedTypeReference<>() {});
            return getPostDTO;
        } catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }
}

