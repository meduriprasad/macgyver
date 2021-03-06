/**
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
package io.macgyver.core;

public class ConfigurationException extends MacGyverException {


	private static final long serialVersionUID = 7848546256255148844L;

	public ConfigurationException() {
		super();
	
	}

	public ConfigurationException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public ConfigurationException(String arg0) {
		super(arg0);
	
	}

	public ConfigurationException(Throwable arg0) {
		super(arg0);

	}

}
