package warikan.domain.model;

public class 飲み会 {

    飲み会の名前 名前;

    いつ開催するか いつ開催するか;

    参加者一覧 参加者一覧;

    public 飲み会(飲み会の名前 名前, いつ開催するか いつ開催するか, 参加者一覧 参加者一覧) {
        this.名前 = 名前;
        this.いつ開催するか = いつ開催するか;
        this.参加者一覧 = 参加者一覧;
    }

}
