package org.academiadecodigo.codezillas.converters;

import org.academiadecodigo.codezillas.command.StageDto;
import org.academiadecodigo.codezillas.persistence.model.components.Stage;

public class StageConverter {

    public Stage convertStageDtoToStage(StageDto stageDto) {

        Stage stage = new Stage();

        stage.setStage_Type(stageDto.getStage_Type());

        return stage;
    }

    public StageDto convertStageToStageDto(Stage stage) {

        StageDto stageDto = new StageDto();

        stageDto.setId(stage.getId());
        stageDto.setStage_Type(stage.getStage_Type());

        return stageDto;
    }
}
