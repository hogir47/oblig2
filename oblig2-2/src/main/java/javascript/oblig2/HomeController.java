package javascript.oblig2;

import javascript.oblig2.Kunde;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
@RestController
class BillettController {
    public List<Kunde> billetene = new ArrayList<>();
    @PostMapping("/lagre")
    public void lagrebillet(Kunde enbillett){
        billetene.add(enbillett);
    }
    @GetMapping("/hentAlle")
    public List<Kunde> hentAlle(){
        return billetene;
    }
    @GetMapping("/slettAlle")
    public void slettAlle(){
        billetene.clear();
    }
}