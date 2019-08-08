package org.academiadecodigo.codezillas.converters;

import org.academiadecodigo.codezillas.command.SuspensionDto;
import org.academiadecodigo.codezillas.persistence.model.components.Suspension;

public class SuspensionConverter {

    public Suspension convertSuspDtoToSusp(SuspensionDto suspensionDto) {

        Suspension suspension = new Suspension();

        suspension.setBrand(suspensionDto.getBrand());
        suspension.setType(suspensionDto.getType());

        return suspension;
    }

    public SuspensionDto convertSuspToSuspDto(Suspension suspension) {

        SuspensionDto suspensionDto = new SuspensionDto();

        suspensionDto.setId(suspension.getId());
        suspensionDto.setBrand(suspension.getBrand());
        suspensionDto.setType(suspension.getType());

        return suspensionDto;
    }
}
