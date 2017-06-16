package net.koashi.frontale_top;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * Created by koashi on 2017/06/12.
 */
@AllArgsConstructor
@Data
public class FrontaleGameResult {
    private Date gameDate;
    private String homeClubName;
    private int homeClubScore;
    private String awayClubName;
    private int awayClubScore;
}
