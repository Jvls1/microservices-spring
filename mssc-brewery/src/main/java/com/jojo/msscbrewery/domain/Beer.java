package com.jojo.msscbrewery.domain;

import com.jojo.msscbrewery.web.model.v2.BeerStyleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Beer {

    private UUID id;

    private String name;

    private BeerStyleEnum style;

    private Long upc;

    private Timestamp dateCreated;

    private Timestamp dateUpdated;

}
