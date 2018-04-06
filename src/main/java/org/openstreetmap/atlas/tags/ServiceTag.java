package org.openstreetmap.atlas.tags;

import org.openstreetmap.atlas.tags.annotations.Tag;
import org.openstreetmap.atlas.tags.annotations.TagKey;
import org.openstreetmap.atlas.tags.annotations.TagValueAs;

/**
 * OSM service tag.
 *
 * @author robert_stack
 * @author daniel-baah
 */
@Tag(taginfo = "http://taginfo.openstreetmap.org/keys/service#values", osm = "http://wiki.openstreetmap.org/wiki/Key:service")
public enum ServiceTag
{
    PARKING_AISLE,
    DRIVEWAY,
    ALLEY,
    EMERGENCY_ACCESS,
    @TagValueAs("drive-through")
    DRIVE_THROUGH,
    SPUR,
    YARD,
    SIDING,
    CROSSOVER,
    TRANSPORTATION,
    WATER_POWER,
    IRRIGATION;

    @TagKey
    public static final String KEY = "service";
}
