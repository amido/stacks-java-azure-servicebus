package com.amido.stacks.azure.servicebus.publisher;

import com.amido.stacks.core.operations.OperationContext;

public class TestApplicationCommand extends OperationContext {

  public TestApplicationCommand(String correlationId) {
    super(correlationId);
  }

  @Override
  public int getOperationCode() {
    return 1000;
  }
}
