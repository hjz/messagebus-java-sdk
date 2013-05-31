/*
 * Copyright (c) 2012 Mail Bypass, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License
 */
package com.messagebus.client.spi;

import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;


@JsonIgnoreProperties(ignoreUnknown = true)
public class StatsResponse extends DefaultResponse {

    private StatsDetail stats = null;

    private StatsFilter filter = null;
    private StatsSmtp smtp = null;

    @JsonCreator
    public StatsResponse(@JsonProperty("statusCode") final int statusCode,
                         @JsonProperty("statusMessage") final String statusMessage,
                         @JsonProperty("statusTime") final Date statusTime,
                         @JsonProperty("stats") final StatsDetail stats,
                         @JsonProperty("smtp") final StatsSmtp smtp,
                         @JsonProperty("filter") final StatsFilter filter
    ) {
        super(statusCode, statusMessage, statusTime);
        this.stats = stats;
        this.smtp = smtp;
        this.filter = filter;
    }

    public StatsDetail getStats() {
        return stats;
    }

    public StatsFilter getFilter() {
        return filter;
    }

    public StatsSmtp getSmtp() {
        return smtp;
    }


}
