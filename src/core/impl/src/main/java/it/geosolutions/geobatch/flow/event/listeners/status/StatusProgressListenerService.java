/*
 *  GeoBatch - Open Source geospatial batch processing system
 *  http://geobatch.geo-solutions.it/
 *  Copyright (C) 2007-2012 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package it.geosolutions.geobatch.flow.event.listeners.status;

import it.geosolutions.geobatch.catalog.Identifiable;
import it.geosolutions.geobatch.catalog.impl.BaseService;
import it.geosolutions.geobatch.configuration.event.listener.ProgressListenerService;

/**
 * 
 * @author ETj <etj at geo-solutions.it>
 * @author (r2)Carlo Cancellieri - carlo.cancellieri@geo-solutions.it
 */
public class StatusProgressListenerService extends BaseService 
    implements ProgressListenerService<StatusProgressListener,StatusProgressListenerConfiguration> {

//    private final static Logger LOGGER = LoggerFactory.getLogger(StatusProgressListenerService.class
//            .toString());
    
    /**
     * Constructor forcing initialization of: id ,name and description of this resource 
     * @param id
     * @param name
     * @param description
     */
    public StatusProgressListenerService(String id, String name, String description) {
        super(id, name, description);
    }

    public StatusProgressListener createProgressListener(StatusProgressListenerConfiguration configuration, Identifiable owner) {
        return new StatusProgressListener(configuration,owner);
    }
}
