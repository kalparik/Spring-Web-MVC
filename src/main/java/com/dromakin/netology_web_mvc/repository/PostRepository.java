/*
 * File:     PostRepository
 * Package:  com.dromakin.netology_web_mvc.repository
 * Project:  netology_web_mvc
 *
 * Created by dromakin as 27.07.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.07.27
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_web_mvc.repository;

import com.dromakin.netology_web_mvc.model.Post;

import java.util.List;
import java.util.Optional;

public interface PostRepository {
    List<Post> all(boolean active);
    Optional<Post> getById(long id);
    Post saveUpdate(Post post);
    Post save(Post post);
    Post update(Post post);
    void removeById(long id);
}
