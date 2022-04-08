package com.example.assignment2gc200478377;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class SuperheroDetailsViewController {

    @FXML
    private Label combatLabel;

    @FXML
    private Label durabilityLabel;

    @FXML
    private Label eyeColourLabel;

    @FXML
    private Label genderLabel;

    @FXML
    private Label hairColourLabel;

    @FXML
    private Label heightCmLabel;

    @FXML
    private Label heightInchLabel;

    @FXML
    private ImageView imageView;

    @FXML
    private Label intelligenceLabel;

    @FXML
    private Label powerLabel;

    @FXML
    private Label raceLabel;

    @FXML
    private Label speedLabel;

    @FXML
    private Label strengthLabel;

    @FXML
    private Label superheroTitleLabel;

    @FXML
    private Label weightKgLabel;

    @FXML
    private Label weightLbLabel;

    private Result result;

    public void loadSuperheroInfo(String id, ActionEvent event) {

        result = APIUtility.getSuperhero(id);

        superheroTitleLabel.setText(result.getName());

        genderLabel.setText(result.getAppearance().getGender());
        raceLabel.setText(result.getAppearance().getRace());
        heightInchLabel.setText(result.getAppearance().getHeight().get(0));
        heightCmLabel.setText(result.getAppearance().getHeight().get(1));
        weightLbLabel.setText(result.getAppearance().getWeight().get(0));
        weightKgLabel.setText(result.getAppearance().getWeight().get(1));
        eyeColourLabel.setText(result.getAppearance().getEyeColour());
        hairColourLabel.setText(result.getAppearance().getHairColour());

        intelligenceLabel.setText(result.getPowerstats().getIntelligence());
        strengthLabel.setText(result.getPowerstats().getStrength());
        speedLabel.setText(result.getPowerstats().getSpeed());
        durabilityLabel.setText(result.getPowerstats().getDurability());
        powerLabel.setText(result.getPowerstats().getPower());
        combatLabel.setText(result.getPowerstats().getCombat());

        try {
            imageView.setImage(new Image(result.getImage().getUrl()));
        }
        catch (IllegalArgumentException e)
        {
            imageView.setImage(new Image("https://ih1.redbubble.net/image.1893341687.8294/poster,504x498,f8f8f8-pad,600x600,f8f8f8.jpg"));
        }
    }

}
