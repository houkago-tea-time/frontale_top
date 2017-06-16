package net.koashi.frontale_top;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by koashi on 2017/06/12.
 */
@Service
public class FrontaleNextGameService {
    public FrontaleNextGame getFrontaleNextGame() {
        return new FrontaleNextGame(new Date(), "等々力", "フロンターレ", "レッズ");
    }
}
