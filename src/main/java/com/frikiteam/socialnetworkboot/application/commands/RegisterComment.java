package com.frikiteam.socialnetworkboot.application.commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class RegisterComment {
    @TargetAggregateIdentifier
    private String id;
    private String content;
}
