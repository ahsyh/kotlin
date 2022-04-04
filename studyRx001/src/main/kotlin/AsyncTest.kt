import io.reactivex.rxjava3.kotlin.subscribeBy
import io.reactivex.rxjava3.kotlin.toObservable
import io.reactivex.rxjava3.schedulers.Schedulers

class AsyncTest {
    fun startRStream() {
        val list = listOf("1", "23", "345", "4567", "5")

        list.toObservable()
            .map {it + "_suffix"}
            .filter {it.length > 9}
            .subscribeOn(Schedulers.io())
            .observeOn(Schedulers.computation())
            .subscribeBy(
                onNext = { println(it) },
                onError = { it.printStackTrace() },
                onComplete = { println("onComplete!") }
            )

        Thread.sleep(2000)
    }
}
