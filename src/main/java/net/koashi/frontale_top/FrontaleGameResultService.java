package net.koashi.frontale_top;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by koashi on 2017/06/12.
 */
@Service
public class FrontaleGameResultService {
    public FrontaleGameResult getFrontaleGameResult() {
        return new FrontaleGameResult(new Date(), "フロンターレ", 2, "レッズ", 1);
    }
}
