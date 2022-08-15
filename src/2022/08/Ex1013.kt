package `2022`.`08`

import Exercise
import enum.Category
import enum.Tier
import enum.TierNumber

class Ex1013: Exercise() {
    override val no: Int
        get() = 1013
    override val title: String
        get() = "Contact"
    override val link: String
        get() = "https://www.acmicpc.net/problem/1013"
    override val tier: Tier
        get() = Tier.Gold(TierNumber.V)
    override val categories: List<Category>
        get() = listOf(
            Category.STRING,
            Category.REGULAR_EXPRESSION,
        )

    override fun exercise() {
        for(i in 0..10) {
            println(i)
        }
    }
}