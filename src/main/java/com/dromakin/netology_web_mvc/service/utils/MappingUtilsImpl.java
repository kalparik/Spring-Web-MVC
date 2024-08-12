/*
 * File:     MappingUtils
 * Package:  com.dromakin.netology_web_mvc.service.utils
 * Project:  netology_web_mvc
 *
 * Created by dromakin as 27.07.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.07.27
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_web_mvc.service.utils;

import com.dromakin.netology_web_mvc.dto.PostDto;
import com.dromakin.netology_web_mvc.model.Post;
import org.springframework.stereotype.Service;

@Service
public class MappingUtilsImpl implements MappingUtils {

    public PostDto postToPostDto(Post post) {
        return new PostDto(post.getId(), post.getContent());
    }

    public Post postDtoToPost(PostDto postDto) {
        return Post.builder().id(postDto.getId()).content(postDto.getContent()).build();
    }

}
