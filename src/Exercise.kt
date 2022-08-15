import enum.Category
import enum.Tier

abstract class Exercise: Exercisable {
    abstract val no: Int
    abstract val title: String
    abstract val link: String
    abstract val tier: Tier
    abstract val categories: List<Category>
}