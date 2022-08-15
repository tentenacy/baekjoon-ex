package enum

sealed class Tier(private val grade: String, private val num: TierNumber) {
    data class Bronze(val num: TierNumber): Tier("Bronze", num) {
        override fun toString(): String = super.toString()
    }
    data class Silver(val num: TierNumber): Tier("Silver", num) {
        override fun toString(): String = super.toString()
    }
    data class Gold(val num: TierNumber): Tier("Gold", num) {
        override fun toString(): String = super.toString()
    }
    data class Platinum(val num: TierNumber): Tier("Platinum", num) {
        override fun toString(): String = super.toString()
    }
    data class Diamond(val num: TierNumber): Tier("Diamond", num) {
        override fun toString(): String = super.toString()
    }
    data class Ruby(val num: TierNumber): Tier("Ruby", num) {
        override fun toString(): String = super.toString()
    }

    override fun toString(): String = "$grade $num"
}

sealed class TierNumber(private val i: Int) {
    object I: TierNumber(1)
    object II: TierNumber(2)
    object III: TierNumber(3)
    object IV: TierNumber(4)
    object V: TierNumber(5)

    override fun toString(): String = "$i"
}