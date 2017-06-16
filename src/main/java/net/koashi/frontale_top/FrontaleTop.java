package net.koashi.frontale_top;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by koashi on 2017/06/11.
 */
@AllArgsConstructor
@Data
public class FrontaleTop {

    private FrontaleGameResult frontaleGameResult;
    private FrontaleNextGame frontaleNextGame;
    private FrontaleNews frontaleNews;

//    public FrontaleTop(String hoge, String hoge1) {
//        newsTitle = hoge;
//        newsDate = hoge1;
//    }
}
