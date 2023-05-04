package com.jojo.msscbrewery.domain;

import com.jojo.msscbrewery.web.model.v2.BeerStyleEnum;

import java.util.UUID;

public class Beer {

    private UUID id;

    private String name;

    private BeerStyleEnum style;

    private Long upc;
}
