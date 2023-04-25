package com.favorites.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;


/**
 * @author yyh
 * @date 2023/4/19 16:22
 * @description
 */
@Data
public class WebsiteDto {

    private Long id;

    @NotNull(message = "url不能为空")
    private String url;
    @NotNull(message = "title不能为空")
    private String title;
    @NotNull(message = "type不能为空")
    private String type;

    private List<String> tags;

}
