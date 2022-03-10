package buttons

import Renderable

abstract class Button protected constructor() : Renderable {
    abstract fun handleClick();
}