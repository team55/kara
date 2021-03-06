package kara

import kara.internal.*

public enum class InputType: StringEnum<InputType> {
    button checkbox file hidden image password radio reset submit text

    // HTML5:
    color date datetime datetime_local email number range search tel time url month week

    override val value: String = name().replace('_', '-')
}
