@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Circle

/**
 * Builds a new [Circle.Options].
 *
 * @return the constructed [Circle.Options].
 */
@Suppress("FunctionName")
inline fun CircleOptions(): Circle.Options {
    return MapKit.newCircleOptions()
}

/**
 * Builds a new [Circle.Options] using the provided [actions].
 *
 * @return the constructed [Circle.Options].
 */
@Suppress("FunctionName")
inline fun CircleOptions(actions: Circle.Options.() -> Unit): Circle.Options {
    return CircleOptions().apply(actions)
}
