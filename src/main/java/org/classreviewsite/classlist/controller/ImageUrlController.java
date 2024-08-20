package org.classreviewsite.classlist.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.classreviewsite.classlist.dto.response.BannerInfo;
import org.classreviewsite.classlist.service.ImageUrlService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ImageUrlController {

    private final ImageUrlService imageUrlService;

    @GetMapping("/banner")
    public Result BannerRender(){
        List<BannerInfo> response = imageUrlService.imageRender();
        return new Result(200, response, "배너 이미지 리스트 입니다.");
    }




    @Data
    @AllArgsConstructor
    class Result<T>{
        private int status;
        private T data;
        private String message;
    }
}
