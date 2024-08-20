package org.classreviewsite.classlist.service;

import lombok.RequiredArgsConstructor;
import org.classreviewsite.classlist.data.ImageUrl;
import org.classreviewsite.classlist.dto.response.BannerInfo;
import org.classreviewsite.classlist.infrastructure.ImageUrlDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class ImageUrlService {

    private final ImageUrlDataRepository imageUrlDataRepository;



    public List<BannerInfo> imageRender(){
        List<ImageUrl> list = imageUrlDataRepository.findByImageNameOrImageName("banner", "main-banner");
        if(list.isEmpty()){
            throw new NoSuchElementException("앗 배너를 찾지 못했어요.");
        }

        return BannerInfo.toList(list);
    }


}
