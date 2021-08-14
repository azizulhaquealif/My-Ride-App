package com.example.demoride.model
import com.google.gson.annotations.SerializedName


data class ModelRoute(
    @SerializedName("geocoded_waypoints")
    val geocodedWaypoints: List<GeocodedWaypoint>?,
    @SerializedName("routes")
    val routes: List<Route>?,
    @SerializedName("status")
    val status: String?
)

data class GeocodedWaypoint(
    @SerializedName("geocoder_status")
    val geocoderStatus: String?,
    @SerializedName("place_id")
    val placeId: String?,
    @SerializedName("types")
    val types: List<String>?
)

data class Route(
    @SerializedName("bounds")
    val bounds: Bounds?,
    @SerializedName("copyrights")
    val copyrights: String?,
    @SerializedName("legs")
    val legs: List<Leg>?,
    @SerializedName("overview_polyline")
    val overviewPolyline: OverviewPolyline?,
    @SerializedName("summary")
    val summary: String?,
    @SerializedName("warnings")
    val warnings: List<Any>?,
    @SerializedName("waypoint_order")
    val waypointOrder: List<Any>?
)

data class Bounds(
    @SerializedName("northeast")
    val northeast: NortheastX?,
    @SerializedName("southwest")
    val southwest: SouthwestX?
)

data class Leg(
    @SerializedName("distance")
    val distance: Distance?,
    @SerializedName("duration")
    val duration: Duration?,
    @SerializedName("end_address")
    val endAddress: String?,
    @SerializedName("end_location")
    val endLocation: EndLocation?,
    @SerializedName("start_address")
    val startAddress: String?,
    @SerializedName("start_location")
    val startLocation: StartLocation?,
    @SerializedName("steps")
    val steps: List<Step>?,
    @SerializedName("traffic_speed_entry")
    val trafficSpeedEntry: List<Any>?,
    @SerializedName("via_waypoint")
    val viaWaypoint: List<Any>?
)

data class OverviewPolyline(
    @SerializedName("points")
    val points: String?
)

data class NortheastX(
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?
)

data class SouthwestX(
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?
)

data class Distance(
    @SerializedName("text")
    val text: String?,
    @SerializedName("value")
    val value: Int?
)

data class Duration(
    @SerializedName("text")
    val text: String?,
    @SerializedName("value")
    val value: Int?
)

data class EndLocation(
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?
)

data class StartLocation(
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?
)

data class Step(
    @SerializedName("distance")
    val distance: DistanceX?,
    @SerializedName("duration")
    val duration: DurationX?,
    @SerializedName("end_location")
    val endLocation: EndLocationX?,
    @SerializedName("html_instructions")
    val htmlInstructions: String?,
    @SerializedName("maneuver")
    val maneuver: String?,
    @SerializedName("polyline")
    val polyline: Polyline?,
    @SerializedName("start_location")
    val startLocation: StartLocationX?,
    @SerializedName("travel_mode")
    val travelMode: String?
)

data class DistanceX(
    @SerializedName("text")
    val text: String?,
    @SerializedName("value")
    val value: Int?
)

data class DurationX(
    @SerializedName("text")
    val text: String?,
    @SerializedName("value")
    val value: Int?
)

data class EndLocationX(
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?
)

data class Polyline(
    @SerializedName("points")
    val points: String?
)

data class StartLocationX(
    @SerializedName("lat")
    val lat: Double?,
    @SerializedName("lng")
    val lng: Double?
)