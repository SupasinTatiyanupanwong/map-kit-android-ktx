package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Circle
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.GroundOverlay
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.MapClient
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Marker
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Polygon
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Polyline
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.TileOverlay

/**
 * Returns the [Circle] object that is added to this [MapClient] using the function literal
 * with receiver [actions]. Might be `null` if there's an error adding the circle.
 *
 * Using this removes the need to explicitly construct a [Circle.Options] object.
 */
inline fun MapClient.addCircle(actions: Circle.Options.() -> Unit): Circle? {
    return addCircle(CircleOptions(actions))
}

/**
 * Returns the [GroundOverlay] object that is added to this [MapClient] using the function literal
 * with receiver [actions]. Might be `null` if there's an error adding the overlay.
 *
 * Using this removes the need to explicitly construct a [GroundOverlay.Options] object.
 */
inline fun MapClient.addGroundOverlay(actions: GroundOverlay.Options.() -> Unit): GroundOverlay? {
    return addGroundOverlay(GroundOverlayOptions(actions))
}

/**
 * Returns the [Marker] object that is added to this [MapClient] using the function literal
 * with receiver [actions]. Might be `null` if there's an error adding the marker.
 *
 * Using this removes the need to explicitly construct a [Marker.Options] object.
 */
inline fun MapClient.addMarker(actions: Marker.Options.() -> Unit): Marker? {
    return addMarker(MarkerOptions(actions))
}

/**
 * Returns the [Polygon] object that is added to this [MapClient] using the function literal
 * with receiver [actions]. Might be `null` if there's an error adding the polygon.
 *
 * Using this removes the need to explicitly construct a [Polygon.Options] object.
 */
inline fun MapClient.addPolygon(actions: Polygon.Options.() -> Unit): Polygon? {
    return addPolygon(PolygonOptions(actions))
}

/**
 * Returns the [Polyline] object that is added to this [MapClient] using the function literal
 * with receiver [actions]. Might be `null` if there's an error adding the polyline.
 *
 * Using this removes the need to explicitly construct a [Polyline.Options] object.
 */
inline fun MapClient.addPolyline(actions: Polyline.Options.() -> Unit): Polyline? {
    return addPolyline(PolylineOptions(actions))
}

/**
 * Returns the [TileOverlay] object that is added to this [MapClient] using the function literal
 * with receiver [actions]. Might be `null` if there's an error adding the overlay.
 *
 * Using this removes the need to explicitly construct a [TileOverlay.Options] object.
 */
inline fun MapClient.addTileOverlay(actions: TileOverlay.Options.() -> Unit): TileOverlay? {
    return addTileOverlay(TileOverlayOptions(actions))
}
