package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.CameraPosition

/**
 * Builds a new [CameraPosition] using the provided [actions]
 * Using this removes the need to explicitly construct a [CameraPosition.Builder] object.
 *
 * @return the constructed [CameraPosition]
 */
inline fun CameraPosition(actions: CameraPosition.Builder.() -> Unit): CameraPosition {
    return MapKit.newCameraPositionBuilder().apply(actions).build()
}

/**
 * Builds a new [CameraPosition] using the provided [camera] and [actions].
 * Using this removes the need to explicitly construct a [CameraPosition.Builder] object.
 *
 * @return the constructed [CameraPosition]
 */
inline fun CameraPosition(
    camera: CameraPosition,
    actions: CameraPosition.Builder.() -> Unit
): CameraPosition {
    return MapKit.newCameraPositionBuilder(camera).apply(actions).build()
}
