import org.jeasy.rules.annotation.Action
import org.jeasy.rules.annotation.Condition
import org.jeasy.rules.annotation.Rule

@Rule(name = "Hello World rule", description = "Always say hello world")
class HelloWorldRule {
    @Condition
    fun condition(): Boolean {
        return true
    }

    @Action
    @Throws(Exception::class)
    fun then() {
        println("hello world")
    }
}