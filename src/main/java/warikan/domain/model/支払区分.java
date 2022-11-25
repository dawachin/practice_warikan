package warikan.domain.model;

public enum 支払区分 {
    多め(new 支払割合(12)),
    少なめ(new 支払割合(10)),
    普通(new 支払割合(8));

    支払区分(支払割合 支払割合) {
    }
}
