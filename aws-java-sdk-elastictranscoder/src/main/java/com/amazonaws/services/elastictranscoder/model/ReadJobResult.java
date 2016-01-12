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

package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;

/**
 * <p>
 * The <code>ReadJobResponse</code> structure.
 * </p>
 */
public class ReadJobResult implements Serializable, Cloneable {

    /**
     * <p>
     * A section of the response body that provides information about the job.
     * </p>
     */
    private Job job;

    /**
     * <p>
     * A section of the response body that provides information about the job.
     * </p>
     * 
     * @param job
     *        A section of the response body that provides information about the
     *        job.
     */
    public void setJob(Job job) {
        this.job = job;
    }

    /**
     * <p>
     * A section of the response body that provides information about the job.
     * </p>
     * 
     * @return A section of the response body that provides information about
     *         the job.
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * <p>
     * A section of the response body that provides information about the job.
     * </p>
     * 
     * @param job
     *        A section of the response body that provides information about the
     *        job.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ReadJobResult withJob(Job job) {
        setJob(job);
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
        if (getJob() != null)
            sb.append("Job: " + getJob());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReadJobResult == false)
            return false;
        ReadJobResult other = (ReadJobResult) obj;
        if (other.getJob() == null ^ this.getJob() == null)
            return false;
        if (other.getJob() != null
                && other.getJob().equals(this.getJob()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJob() == null) ? 0 : getJob().hashCode());
        return hashCode;
    }

    @Override
    public ReadJobResult clone() {
        try {
            return (ReadJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}