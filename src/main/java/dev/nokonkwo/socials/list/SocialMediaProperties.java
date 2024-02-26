// SocialMediaProperties.java
package dev.nokonkwo.socials.list;

import java.util.List;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("social.media")
@Component
public class SocialMediaProperties {
    private List<SocialMediaAccounts> accounts;

    public List<SocialMediaAccounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<SocialMediaAccounts> accounts) {
        this.accounts = accounts;
    }
}
