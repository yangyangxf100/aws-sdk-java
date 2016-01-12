/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Gets information about a specified traffic policy instance.
 * </p>
 * <p>
 * To get information about a traffic policy instance, send a <code>GET</code>
 * request to the <code>2015-01-01/trafficpolicyinstance/<i>Id</i></code>
 * resource.
 * </p>
 */
public class GetTrafficPolicyInstanceRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the traffic policy instance that you want to get information
     * about.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The ID of the traffic policy instance that you want to get information
     * about.
     * </p>
     * 
     * @param id
     *        The ID of the traffic policy instance that you want to get
     *        information about.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the traffic policy instance that you want to get information
     * about.
     * </p>
     * 
     * @return The ID of the traffic policy instance that you want to get
     *         information about.
     */
    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The ID of the traffic policy instance that you want to get information
     * about.
     * </p>
     * 
     * @param id
     *        The ID of the traffic policy instance that you want to get
     *        information about.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GetTrafficPolicyInstanceRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetTrafficPolicyInstanceRequest == false)
            return false;
        GetTrafficPolicyInstanceRequest other = (GetTrafficPolicyInstanceRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null
                && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public GetTrafficPolicyInstanceRequest clone() {
        return (GetTrafficPolicyInstanceRequest) super.clone();
    }
}