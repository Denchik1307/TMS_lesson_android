package den.project.first_lesson_android

import kotlin.io.print as print1

class Disscount {
    var title: String? = null
        get() = field?.uppercase()
    var discription: String? = null
        set(value) = if (value?.length!! <= 100) {
            field = value
        } else {
            field = value?.substring(0..100)
        }
    var amount: Int? = null
        set(value) {
            field = try {
                if (value != null) {
                    1 / value
                } else {
                    0
                }
            } catch (exeption: ArithmeticException) {
                0
            }
        }
    var url: String? = null
}

