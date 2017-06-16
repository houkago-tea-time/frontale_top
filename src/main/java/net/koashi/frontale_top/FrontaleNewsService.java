package net.koashi.frontale_top;

import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by koashi on 2017/06/12.
 */
@Service
public class FrontaleNewsService {
    public FrontaleNews getFrontaleNews() {
        return new FrontaleNews(123, "test", new Date());
    }
}
