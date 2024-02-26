
package dev.nokonkwo.socials.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/social-media")
public class SocialMediaController {

    private final SocialMediaProperties socialMediaProperties;

    @Autowired
    public SocialMediaController(SocialMediaProperties socialMediaProperties) {
        this.socialMediaProperties = socialMediaProperties;
    }

    @GetMapping("/accounts")
    public List<SocialMediaAccounts> getSocialMediaAccounts() {
        return socialMediaProperties.getAccounts();
    }

    @PostMapping("/accounts/add")
    public void addSocialMediaAccount(@RequestBody SocialMediaAccounts account) {
        socialMediaProperties.getAccounts().add(account);
    }

    @PutMapping("/accounts/update/{id}")
    public void updateSocialMediaAccount(@PathVariable int id, @RequestBody SocialMediaAccounts account) {
        List<SocialMediaAccounts> accounts = socialMediaProperties.getAccounts();
        if (id >= 0 && id < accounts.size()) {
            accounts.set(id, account);
        }
    }

    @DeleteMapping("/accounts/delete/{id}")
    public void deleteSocialMediaAccount(@PathVariable int id) {
        List<SocialMediaAccounts> accounts = socialMediaProperties.getAccounts();
        if (id >= 0 && id < accounts.size()) {
            accounts.remove(id);
        }
    }
}
