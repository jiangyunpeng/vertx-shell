/*
 * Copyright 2014 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package io.vertx.rxjava.ext.shell.command.base;

import io.vertx.ext.shell.command.base.NetCommand;
import io.vertx.rxjava.ext.shell.command.Command;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 *
 * <p/>
 * NOTE: This class has been automatically generated from the {@link NetCommand original} non RX-ified interface using Vert.x codegen.
 */

public class ServerCommand {

  final NetCommand delegate;

  public ServerCommand(NetCommand delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  public static Command ls() { 
    Command ret= Command.newInstance(NetCommand.ls());
    return ret;
  }


  public static ServerCommand newInstance(NetCommand arg) {
    return arg != null ? new ServerCommand(arg) : null;
  }
}
