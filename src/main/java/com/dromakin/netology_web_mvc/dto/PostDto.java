/*
 * File:     PostDto
 * Package:  com.dromakin.netology_web_mvc.dto
 * Project:  netology_web_mvc
 *
 * Created by dromakin as 27.07.2023
 *
 * author - dromakin
 * maintainer - dromakin
 * version - 2023.07.27
 * copyright - ORGANIZATION_NAME Inc. 2023
 */
package com.dromakin.netology_web_mvc.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
public class PostDto {
    private long id;
    private String content;
}
