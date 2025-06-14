package org.gycoding.books.domain.model;

import lombok.Builder;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Builder
public record BookMO(
        UUID id,
        String title,
        String description,
        String cover,
        List<AuthorMO> authors,
        SeriesMO series,
        Number averageRating
) { }