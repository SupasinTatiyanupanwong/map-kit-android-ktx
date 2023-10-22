@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Polyline

/**
 * Builds a new [Polyline.Options].
 *
 * @return the constructed [Polyline.Options].
 */
@Suppress("FunctionName")
inline fun PolylineOptions(): Polyline.Options {
    return MapKit.newPolylineOptions()
}

/**
 * Builds a new [Polyline.Options] using the provided [actions].
 *
 * @return the constructed [Polyline.Options].
 */
@Suppress("FunctionName")
inline fun PolylineOptions(actions: Polyline.Options.() -> Unit): Polyline.Options {
    return PolylineOptions().apply(actions)
}
