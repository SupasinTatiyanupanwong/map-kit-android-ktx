@file:Suppress("FunctionName")

package dev.supasintatiyanupanwong.libraries.android.kits.maps.ktx.model

import android.content.Context
import androidx.annotation.RawRes
import dev.supasintatiyanupanwong.libraries.android.kits.maps.MapKit
import dev.supasintatiyanupanwong.libraries.android.kits.maps.model.MapClient

fun MapStyleOptions(json: String): MapClient.Style.Options = MapKit.newMapStyleOptions(json)

fun MapStyleOptions(context: Context, @RawRes resourceId: Int): MapClient.Style.Options = MapKit.newMapStyleOptions(context, resourceId)
