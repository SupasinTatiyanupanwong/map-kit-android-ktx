@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.GroundOverlay

/**
 * Builds a new [GroundOverlay.Options].
 *
 * @return the constructed [GroundOverlay.Options].
 */
@Suppress("FunctionName")
inline fun GroundOverlayOptions(): GroundOverlay.Options {
    return MapKit.newGroundOverlayOptions()
}

/**
 * Builds a new [GroundOverlay.Options] using the provided [actions].
 *
 * @return the constructed [GroundOverlay.Options].
 */
@Suppress("FunctionName")
inline fun GroundOverlayOptions(actions: GroundOverlay.Options.() -> Unit): GroundOverlay.Options {
    return GroundOverlayOptions().apply(actions)
}
