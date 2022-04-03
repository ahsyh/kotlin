import io.reactivex.rxjava3.core.Observer
import io.reactivex.rxjava3.internal.schedulers.ComputationScheduler
import io.reactivex.rxjava3.internal.schedulers.IoScheduler
import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toObservable

class AsyncTest {
    fun startRStream() {
        val list = listOf("1", "2", "3", "4", "5")

        list.toObservable()
            .subscribeBy(
                onNext = { println(it) },
                onError = { it.printStackTrace() },
                onComplete = { println("onComplete!") }
            )
    }
}