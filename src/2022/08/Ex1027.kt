package `2022`.`08`

import Exercise
import enum.Category
import enum.Tier
import enum.TierNumber

class Ex1027: Exercise() {
    override val no: Int
        get() = 1027
    override val title: String
        get() = "고층건물"
    override val link: String
        get() = "https://www.acmicpc.net/problem/1027"
    override val tier: Tier
        get() = Tier.Gold(TierNumber.IV)
    override val categories: List<Category>
        get() = listOf(
            Category.MATHEMATICS,
            Category.BRUTEFORCING,
            Category.GEOMETRY,
        )

    override fun exercise() {
        println("흐하하하!")
    }
}