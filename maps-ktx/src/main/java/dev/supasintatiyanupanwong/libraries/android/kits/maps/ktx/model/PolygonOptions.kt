@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Polygon

/**
 * Builds a new [Polygon.Options].
 *
 * @return the constructed [Polygon.Options].
 */
@Suppress("FunctionName")
inline fun PolygonOptions(): Polygon.Options {
    return MapKit.newPolygonOptions()
}

/**
 * Builds a new [Polygon.Options] using the provided [actions].
 *
 * @return the constructed [Polygon.Options].
 */
@Suppress("FunctionName")
inline fun PolygonOptions(actions: Polygon.Options.() -> Unit): Polygon.Options {
    return PolygonOptions().apply(actions)
}
