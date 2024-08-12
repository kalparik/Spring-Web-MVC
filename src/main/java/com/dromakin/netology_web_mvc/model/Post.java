package com.dromakin.netology_web_mvc.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Post {
    private long id;
    private String content;
    @Builder.Default
    private boolean active = true;
}
