/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.devfile.server;

/** Thrown when the provided content of recipe-type tool is empty or invalid. */
public class DevfileRecipeFormatException extends DevfileException {

  public DevfileRecipeFormatException(String message) {
    super(message);
  }
}