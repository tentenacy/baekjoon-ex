import enum.Tier
import java.lang.Exception
import java.nio.charset.Charset
import kotlin.reflect.full.primaryConstructor

class Executor(val no: Int) {
    fun execute() {
        for(year in 2022..2032) {
            for(month in 1..12) {
                try {
                    Class.forName("${year}.${"%02d".format(month)}.Ex$no").kotlin.primaryConstructor?.let {
                        (it.call() as Exercise).run {
                            val title = "백준 ${this.no}번($link) [${title}]의 풀이"
                            val top = "################# $title #################"
                            println(top)
                            println("${top.map { if(it.code in 0xAC00..0xD800) "##" else "#" }.joinToString("")} Tier: $tier")
                            println("${top.map { if(it.code in 0xAC00..0xD800) "##" else "#" }.joinToString("")} Category: ${categories.joinToString(", ")}")
                            exercise()
                        }
                    } ?: kotlin.run { throw RuntimeException() }
                    return
                } catch (e: Exception) {
                    continue
                }
            }
        }
        println("해당 문제의 풀이가 존재하지 않습니다.")
    }
}