package Class1

class SimpleSpice {

    val spice: String = "curry"
    private var spiciness: String = "mild"

    val heat: Int get() = if (spiciness.contains("mild")) 5 else 0

    var setupSpiciness : String
        get() = spiciness
        set(value) {spiciness = value}

}