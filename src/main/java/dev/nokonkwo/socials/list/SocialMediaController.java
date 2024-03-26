
package dev.nokonkwo.socials.list;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.ArrayList;
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
    @GetMapping("/config")
    public String envVar(){
        Map<String, String> map = System.getenv();
        StringBuilder sb  = new StringBuilder();

        for(String key : map.keySet()){
            sb.append(key);
            sb.append(" = ");
            sb.append(map.get(key));
            sb.append("\n");
        }
        return sb.toString();

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

    @RequestMapping(value = "/fib", method = RequestMethod.GET)
    public String generateFibonacci(@RequestParam("length") int length) {
        List<Integer> fibonacci = new ArrayList<>();

        int num1 = 0;
        int num2 = 1;

        for(int i = 0; i < length; i++){
            fibonacci.add(num1);
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return fibonacci.toString();
    }
}
