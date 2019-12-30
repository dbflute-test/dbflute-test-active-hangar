package org.docksidestage.hangar.dbflute.nogen.akka;

import java.util.concurrent.Executor;

import akka.NotUsed;

/**
 * @param <ELEMENT> The type of element.
 * @author jflute (2019/12/30 Monday at sheraton) (referring https://gist.github.com/XenonAbe/667de82ae11bf3a15e7e8b15b410ed35)
 */
public interface AkkaSourceGenerator<ELEMENT> {

    NotUsed runAsync(Runnable runnable, Executor executor);

    void pushNext(ELEMENT elem);
}