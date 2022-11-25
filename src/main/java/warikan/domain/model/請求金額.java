package warikan.domain.model;

import warikan.domain.model.type.金額;

public class 請求金額 {
    warikan.domain.model.type.金額 金額;
    public 請求金額(金額 金額) {
        this.金額 = 金額;
    }

    public 均等割りした金額 を次のあたいで割る(参加者人数 参加者人数) {

        金額 均等割りした金額 = this.金額.除算(参加者人数.人数);
        return new 均等割りした金額(均等割りした金額);
    }
}
