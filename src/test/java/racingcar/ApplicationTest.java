package racingcar;

import camp.nextstep.edu.missionutils.test.NsTest;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertRandomNumberInRangeTest;
import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ApplicationTest extends NsTest {
    private static final int MOVING_FORWARD = 4;
    private static final int STOP = 3;

    @Test
    void 전진_정지() {
        assertRandomNumberInRangeTest(
                () -> {
                    run("pobi,woni", "1");
                    assertThat(output()).contains("pobi : -", "woni : ", "최종 우승자 : pobi");
                },
                MOVING_FORWARD, STOP
        );
    }

    @Test
    void 이름에_대한_예외_처리() {
        assertSimpleTest(() ->
                assertThatThrownBy(() -> runException("pobi,javaji", "1"))
                        .isInstanceOf(IllegalArgumentException.class)
        );
    }

    // 추가된 테스트
    @Test
    void 이름에_공백이_포함된_것에_대한_처리() {
        assertSimpleTest(() -> {
                 assertThatCode(() -> runException("pobi,ja vai", "1"))
                        .doesNotThrowAnyException();
        });
    }

    @Test
    void 시도할_횟수가_1이하인_경우() {
        assertSimpleTest(() -> {
                assertThatThrownBy(() -> runException("po bi,java", "-1"))
                        .isInstanceOf(IllegalArgumentException.class);
        });
    }

    @Test
    void 이름을_쉼표로_구분하지_않은_경우() {
        assertSimpleTest(() -> {
            assertThatThrownBy(() -> runException("pobi java kang", "-1"))
                    .isInstanceOf(IllegalArgumentException.class);
        });
    }

    @Override
    public void runMain() {
        Application.main(new String[]{});
    }
}
