package mehdi.compteservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import mehdi.compteservice.enums.DTO.VirementRequestDTO;

@RestController
public class AccountRestcontroller {

    @Autowired
    compteService compteServ;


    @PutMapping(path="/comptes/virement")
    public void virement(@RequestBody VirementRequestDTO request){

        compteServ.virement(request.getCodeSource(),request.getCodeDestination(),request.getMontant());

    }

}
