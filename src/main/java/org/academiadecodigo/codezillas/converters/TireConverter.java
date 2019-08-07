package org.academiadecodigo.codezillas.converters;

import org.academiadecodigo.codezillas.command.TiresDto;
import org.academiadecodigo.codezillas.persistence.model.components.Tires;

public class TireConverter {


    public Tires convertTireDtoToTire(TiresDto tiresDto){

        Tires tire = new Tires();

        tire.setBrand(tiresDto.getBrand());
        tire.setType(tiresDto.getType());

        return tire;
    }


    public TiresDto convertTiresToTiresDto(Tires tires){

        TiresDto tiresDto = new TiresDto();

        tiresDto.setId(tires.getId());
        tiresDto.setBrand(tires.getBrand());
        tiresDto.setType(tires.getType());

        return tiresDto;
    }
}
