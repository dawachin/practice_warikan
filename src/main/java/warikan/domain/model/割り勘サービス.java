package warikan.domain.model;

public class 割り勘サービス {

    /**
     *
     * @param 参加者人数
     * @param 請求金額
     * @return
     */
    public 均等割りした金額 均等割りする(参加者人数 参加者人数, 請求金額 請求金額) {
        均等割りした金額 均等割りした金額 = 請求金額.を次のあたいで割る(参加者人数);
        return 均等割りした金額;
    }

}
