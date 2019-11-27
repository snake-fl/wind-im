/** 
 * Copyright 2018-2028 Akaxin Group
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
package com.windchat.im.message.service;

import com.windchat.common.command.Command;
import com.windchat.im.message.api.IMessageService;

/**
 * 负责接受所有从connector下来的业务请求，请负责分发
 * 
 * @author Sam
 *
 */
public class ImMessageService implements IMessageService {

	public boolean execute(Command command) {
		return MessageDispatcher.dispatch(command);
	}

}
