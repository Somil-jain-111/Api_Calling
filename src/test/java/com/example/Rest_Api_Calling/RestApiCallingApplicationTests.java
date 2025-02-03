package com.example.Rest_Api_Calling;

import com.example.Rest_Api_Calling.client.PostClient;
import com.example.Rest_Api_Calling.dto.GetPostDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class RestApiCallingApplicationTests {
@Autowired
	private PostClient postClient;
	@Test
	void getAllPost() {
		GetPostDTO getPostDTOList = new GetPostDTO("title 4","description 4");
		GetPostDTO savedData=postClient.getAllPost(getPostDTOList);
		System.out.println(getPostDTOList);
	}

}
