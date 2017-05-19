/*
 * Copyright 2016-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.credhub.support;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A container type for a credential that contains a single string {@literal password} value.
 *
 * @author Scott Frederick
 */
public class PasswordCredential extends StringCredential {
	/**
	 * Create an empty {@link PasswordCredential}. Intended to be used internally for deserialization of responses.
	 */
	public PasswordCredential() {
		super(null);
	}

	/**
	 * Create a {@link PasswordCredential} containing the specified password value.
	 *
	 * @param value the password
	 */
	@JsonCreator
	public PasswordCredential(String value) {
		super(value);
	}

	/**
	 * Get the password value.
	 *
	 * @return the password value
	 */
	@JsonValue
	public String getPassword() {
		return value;
	}
}