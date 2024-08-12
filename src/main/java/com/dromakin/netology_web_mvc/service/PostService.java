/*
 * File:     PostService
 * Package:  com.dromakin.netology_web_mvc.service
 * Project:  netology_web_mvc
 *
 * Created by dromakin as 27.07.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.07.27
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_web_mvc.service;

import com.dromakin.netology_web_mvc.model.Post;

import java.util.List;

public interface PostService {
    List<Post> all(boolean active);
    Post getById(long id);
    Post save(Post post);
    void removeById(long id);
}
