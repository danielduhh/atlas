package org.openstreetmap.atlas.tags;

import java.util.Optional;

import org.openstreetmap.atlas.tags.annotations.Tag;
import org.openstreetmap.atlas.tags.annotations.TagKey;
import org.openstreetmap.atlas.tags.annotations.validation.Validators;

/**
 * OSM construction tag
 *
 * @author daniel-baah
 */
@Tag(taginfo = "https://taginfo.openstreetmap.org/keys/?key=proposed#values", osm = "https://wiki.openstreetmap.org/wiki/Key:proposed")
public enum ProposedTag
{
    YES,
    MOTORWAY,
    MOTORWAY_LINK,
    TRUNK,
    TRUNK_LINK,
    PRIMARY,
    PRIMARY_LINK,
    SECONDARY,
    SECONDARY_LINK,
    TERTIARY,
    TERTIARY_LINK,
    UNCLASSIFIED,
    RESIDENTIAL,
    SERVICE,
    TRACK,
    LIVING_STREET,
    PEDESTRIAN,
    BUS_GUIDEWAY,
    RACEWAY,
    ROAD,
    CYCLEWAY,
    FOOTWAY,
    BRIDLEWAY,
    STEPS,
    PATH,
    PROPOSED,
    CONSTRUCTION,
    ESCAPE,
    BUS_STOP,
    CROSSING,
    ELEVATOR,
    EMERGENCY_ACCESS_POINT,
    GIVE_WAY,
    MINI_ROUNDABOUT,
    MOTORWAY_JUNCTION,
    PASSING_PLACE,
    REST_AREA,
    SPEED_CAMERA,
    STREET_LAMP,
    SERVICES,
    STOP,
    TRAFFIC_SIGNALS,
    TURNING_CIRCLE,
    TURNING_LOOP,
    RAIL,
    NARROW_GAUGE,
    LIGHT_RAIL,
    TRAM,
    PRESERVED,
    SUBWAY,
    MONORAIL,
    BUILDING,
    STATION,
    HOUSE;

    @TagKey
    public static final String KEY = "proposed";

    public static Optional<ProposedTag> isProposed(final Taggable taggable)
    {
        return Validators.from(ProposedTag.class, taggable);
    }

}
