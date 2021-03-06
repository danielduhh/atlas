package org.openstreetmap.atlas.tags;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import org.openstreetmap.atlas.tags.annotations.Tag;
import org.openstreetmap.atlas.tags.annotations.Tag.Validation;
import org.openstreetmap.atlas.tags.annotations.TagKey;

/**
 * Tag that tracks any invalid multipolygon members that were removed during country slicing
 * <p>
 * This is not an OSM tag.
 *
 * @author samg
 */
@Tag(synthetic = true, value = Validation.NON_EMPTY_STRING)
public interface SyntheticInvalidMultiPolygonRelationMembersRemovedTag
{
    @TagKey
    String KEY = "synthetic_invalid_multipolygon_relation_members_removed";

    String MEMBER_DELIMITER = ",";

    /**
     * The list of all added member identifiers
     *
     * @param taggable
     *            The {@link Taggable} whose members we're interested in
     * @return Iterable of all the added member identifiers for this item
     */
    static Optional<Iterable<Long>> all(final Taggable taggable)
    {
        return taggable.getTag(KEY).map(tagValue -> Arrays.stream(tagValue.split(MEMBER_DELIMITER))
                .map(Long::valueOf).filter(Objects::nonNull).collect(Collectors.toList()));
    }

    /**
     * @param taggable
     *            The {@link Taggable} we're looking at
     * @return {@code true} if this item has removed invalid relation members
     */
    static boolean hasAddedRelationMember(final Taggable taggable)
    {
        return taggable.getTag(KEY).isPresent();
    }

    static String join(final Collection<String> ids)
    {
        return String.join(MEMBER_DELIMITER, ids);
    }
}
