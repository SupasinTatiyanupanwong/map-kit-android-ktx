@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Marker

/**
 * Builds a new [Marker.Options].
 *
 * @return the constructed [Marker.Options].
 */
@Suppress("FunctionName")
inline fun MarkerOptions(): Marker.Options {
    return MapKit.newMarkerOptions()
}

/**
 * Builds a new [Marker.Options] using the provided [actions].
 *
 * @return the constructed [Marker.Options].
 */
@Suppress("FunctionName")
inline fun MarkerOptions(actions: Marker.Options.() -> Unit): Marker.Options {
    return MarkerOptions().apply(actions)
}
