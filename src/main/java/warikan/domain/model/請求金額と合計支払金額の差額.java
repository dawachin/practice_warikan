package warikan.domain.model;

import warikan.domain.model.type.金額;

public class 請求金額と合計支払金額の差額 {

    合計支払金額 合計支払金額;

    請求金額 請求金額;

    public 請求金額と合計支払金額の差額(合計支払金額 合計支払金額, 請求金額 請求金額) {
        this.合計支払金額 = 合計支払金額;
        this.請求金額 = 請求金額;
    }

    public 金額 の金額() {
        // 請求金額から合計支払金額を引く
        return null;
    }
}
