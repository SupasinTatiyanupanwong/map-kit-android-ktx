@file:Suppress("NOTHING_TO_INLINE")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.Tile

inline fun Tile(width: Int, height: Int, data: ByteArray?): Tile = MapKit.newTile(width, height, data)
