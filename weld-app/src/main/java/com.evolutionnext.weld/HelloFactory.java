package com.evolutionnext.weld;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * @author Daniel Hinojosa
 * @since 8/6/13 4:47 PM
 *        url: <a href="http://www.evolutionnext.com">http://www.evolutionnext.com</a>
 *        email: <a href="mailto:dhinojosa@evolutionnext.com">dhinojosa@evolutionnext.com</a>
 *        tel: 505.363.5832
 */
public class HelloFactory {

    @Inject
    private Conversation conversation;

    @Produces @ConversationScoped @Named("helloBean")
    public HelloBean getHello() {
       conversation.begin();
       return new HelloBean();
    }
}
