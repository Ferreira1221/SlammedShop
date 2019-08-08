package org.academiadecodigo.codezillas.converters;

import org.academiadecodigo.codezillas.command.ElectronicsDto;
import org.academiadecodigo.codezillas.persistence.model.components.Electronics;

public class ElectronicsConverter {

    public Electronics convertElecDtoToElec(ElectronicsDto electronicsDto) {

        Electronics electronics = new Electronics();

        electronics.setElecsDescription(electronicsDto.getElecsDescription());

        return electronics;
    }

    public ElectronicsDto covertElecToElecDto(Electronics electronics) {

        ElectronicsDto electronicsDto = new ElectronicsDto();

        electronicsDto.setId(electronics.getId());
        electronicsDto.setElecsDescription(electronics.getElecsDescription());

        return electronicsDto;

    }

}
