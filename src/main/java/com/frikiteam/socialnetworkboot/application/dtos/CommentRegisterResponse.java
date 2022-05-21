package com.frikiteam.socialnetworkboot.application.dtos;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Value
public class CommentRegisterResponse {
  @TargetAggregateIdentifier
  private final String id;

  private final String content;
}
