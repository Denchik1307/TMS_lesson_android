package den.project.first_lesson_android

data class Discount(
    var title: String,
    var description: String,
    var discountAmount: Int = 0,
    var imageUrl: String? = null,
    var siteUrl: String? = null
) {

    fun getCustomTitle() = this.title.uppercase()

    fun setCustomDescription(value: String) = if (value.length <= 100) {
        this.description = value
    } else {
        this.description = value.substring(0..100)
    }
}




