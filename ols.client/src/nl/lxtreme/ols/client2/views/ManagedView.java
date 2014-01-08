/*
 * OpenBench LogicSniffer / SUMP project 
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
 *
 * Copyright (C) 2006-2010 Michael Poppitz, www.sump.org
 * Copyright (C) 2010-2014 J.W. Janssen, www.lxtreme.nl
 */
package nl.lxtreme.ols.client2.views;


import nl.lxtreme.ols.client2.*;

import com.jidesoft.docking.*;


/**
 * Provides a view component that can be managed externally.
 */
public interface ManagedView
{
  // METHODS

  /**
   * @return the identifier of this view.
   */
  String getId();

  /**
   * @return a human-readable name for this view.
   */
  String getName();

  /**
   * Initializes this view.
   * 
   * @param aClient
   *          the client to use, cannot be <code>null</code>;
   * @param aFrame
   *          the dockable frame to initialize, cannot be <code>null</code>.
   */
  void initialize( DockableFrame aFrame );

  /**
   * Called whenever this view needs to update its state.
   * 
   * @param aClient
   *          the current {@link Client} to use;
   * @param aController
   *          the {@link ViewController} to use.
   */
  void updateState( ViewController aController );

}
