package org.classreviewsite.classlist.dto.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import org.classreviewsite.classlist.data.ImageUrl;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class BannerInfo {

    private String name;

    private String url;


    public static List<BannerInfo> toList(List<ImageUrl> banners){
        List<BannerInfo> list = new ArrayList<>();
        for(ImageUrl imageUrl: banners){
            list.add(BannerInfo.from(imageUrl));
        }
        return list;
    }

    public static BannerInfo from(ImageUrl imageUrl){
        return new BannerInfo(
                imageUrl.getImageName(),
                imageUrl.getImageUrl()
        );
    }

}
