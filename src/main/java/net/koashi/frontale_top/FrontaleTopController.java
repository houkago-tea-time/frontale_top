package net.koashi.frontale_top;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by koashi on 2017/06/11.
 */
@RequiredArgsConstructor
@RestController
public class FrontaleTopController {
    @Autowired
    private FrontaleGameResultService frontaleGameResultService;
    @Autowired
    private FrontaleNextGameService frontaleNextGameService;
    @Autowired
    private FrontaleNewsService frontaleNewsService;

    @GetMapping("/v1/frontaleTop")
    public FrontaleTop get() {
        FrontaleGameResult frontaleGameResult = frontaleGameResultService.getFrontaleGameResult();
        FrontaleNextGame frontaleNextGame = frontaleNextGameService.getFrontaleNextGame();
        FrontaleNews frontaleNews = frontaleNewsService.getFrontaleNews();
        FrontaleTop frontaleTop = new FrontaleTop(frontaleGameResult, frontaleNextGame, frontaleNews);
        return frontaleTop;
    }
}
