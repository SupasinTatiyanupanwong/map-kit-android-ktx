@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.TileOverlay

/**
 * Builds a new [TileOverlay.Options].
 *
 * @return the constructed [TileOverlay.Options].
 */
@Suppress("FunctionName")
inline fun TileOverlayOptions(): TileOverlay.Options {
    return MapKit.newTileOverlayOptions()
}

/**
 * Builds a new [TileOverlay.Options] using the provided [actions].
 *
 * @return the constructed [TileOverlay.Options].
 */
@Suppress("FunctionName")
inline fun TileOverlayOptions(actions: TileOverlay.Options.() -> Unit): TileOverlay.Options {
    return TileOverlayOptions().apply(actions)
}
