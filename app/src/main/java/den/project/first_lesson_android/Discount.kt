package den.project.first_lesson_android

data class Discount(
    var title: String,
    var description: String,
    var amount: Int = 0,
    var url: String? = null,
    var discountType: DiscountType
) {

    fun getMyTitle() = this.title.uppercase()

    fun setMyDescription(value: String) = if (value.length <= 100) {
        this.description = value
    } else {
        this.description = value.substring(0..100)
    }

    fun setMyAmount(value: Int) {
        this.amount = try {
            1 / value
        } catch (exception: ArithmeticException) {
            -1
        }
    }

    fun getSafeUrl(): String {
        return url ?: "Google.com"
    }

    fun temp(url: String?): String {
        return url ?: "Google.com"
    }
}




