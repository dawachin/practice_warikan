package warikan.domain.model;


import org.junit.jupiter.api.Test;
import warikan.domain.model.type.金額;

import static org.junit.jupiter.api.Assertions.*;

public class 金額Test {

    @Test
    public void ある金額からある金額を差し引くことができる() {
        金額 ひかれる金額 = 金額.整数より(10000);
        金額 ひく金額 = 金額.整数より(3000);
        金額 ひかれた金額 = ひかれる金額.減算(ひく金額);
        assertEquals(ひかれた金額, 金額.整数より(7000));
    }

}
