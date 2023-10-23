package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Circle
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.GroundOverlay
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.MapClient
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Marker
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Polygon
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Polyline
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.TileOverlay

/**
 * Adds a [Circle] to this [MapClient] using the function literal with receiver [actions].
 *
 * @return The [Circle] object that is added to the map. Might be `null` if there's an error.
 */
inline fun MapClient.addCircle(actions: Circle.Options.() -> Unit): Circle? {
    return addCircle(CircleOptions(actions))
}

/**
 * Adds a [GroundOverlay] to this [MapClient] using the function literal with receiver [actions].
 *
 * @return the [GroundOverlay] object that is added to the map. Might be `null` if there's an error.
 */
inline fun MapClient.addGroundOverlay(actions: GroundOverlay.Options.() -> Unit): GroundOverlay? {
    return addGroundOverlay(GroundOverlayOptions(actions))
}

/**
 * Adds a [Marker] to this [MapClient] using the function literal with receiver [actions].
 *
 * @return the [Marker] object that is added to the map. Might be `null` if there's an error.
 */
inline fun MapClient.addMarker(actions: Marker.Options.() -> Unit): Marker? {
    return addMarker(MarkerOptions(actions))
}

/**
 * Adds a [Polygon] to this [MapClient] using the function literal with receiver [actions].
 *
 * @return the [Polygon] object that is added to the map. Might be `null` if there's an error.
 */
inline fun MapClient.addPolygon(actions: Polygon.Options.() -> Unit): Polygon? {
    return addPolygon(PolygonOptions(actions))
}

/**
 * Adds a [Polyline] to this [MapClient] using the function literal with receiver [actions].
 *
 * @return the [Polyline] object that is added to the map. Might be `null` if there's an error.
 */
inline fun MapClient.addPolyline(actions: Polyline.Options.() -> Unit): Polyline? {
    return addPolyline(PolylineOptions(actions))
}

/**
 * Adds a [TileOverlay] to this [MapClient] using the function literal with receiver [actions].
 *
 * @return the [TileOverlay] object that is added to the map. Might be `null` if there's an error.
 */
inline fun MapClient.addTileOverlay(actions: TileOverlay.Options.() -> Unit): TileOverlay? {
    return addTileOverlay(TileOverlayOptions(actions))
}
