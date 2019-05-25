/*
 * nimbus-jose-jwt
 *
 * Copyright 2012-2016, Connect2id Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use
 * this file except in compliance with the License. You may obtain a copy of the
 * License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.nimbusds.jose;


/**
 * Generic payload type transformer. Implementations should be tread-safe.
 */
public interface PayloadTransformer<T> {


	/**
	 * Transforms the specified payload into the desired type.
	 *
	 * @param payload The payload. Not {@code null}.
	 *
	 * @return The desired type.
	 */
	T transform(final Payload payload);
}