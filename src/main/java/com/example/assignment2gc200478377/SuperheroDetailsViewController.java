/**
 * This is a Detail superhero controller class; this class displays appearance and power statics for the superhero once user clicked on detail on the first scene.
 * This class works as a bridge between "JSON parsed data into JAVA object" and View
 */

//This class is a part of this package
package com.example.assignment2gc200478377;

//Imported different classes to use their functionality
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.IOException;

public class SuperheroDetailsViewController
{

    /**
     * Private fields which mapped to Scene's items
     */
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

    /**
     * This method take user to the first scene with initial view and allow user to search superhero.
     */
    @FXML
    void backButtonClick(ActionEvent event) throws IOException
    {
        //Calling static method to load first scene.
        SceneChanger.changeScene(event, "search-superhero-view.fxml");
    }

    //Declared result class object.
    private Result result;

    public void loadSuperheroInfo(String id, ActionEvent event) {

        //Passing Java object into result class object.
        result = APIUtility.getSuperhero(id);

        //Mapping or passing data ino the different label into the second scene.
        superheroTitleLabel.setText(result.getName());

        //Setting up value for Appearance.
        genderLabel.setText(result.getAppearance().getGender());
        raceLabel.setText(result.getAppearance().getRace());
        heightInchLabel.setText(result.getAppearance().getHeight().get(0));
        heightCmLabel.setText(result.getAppearance().getHeight().get(1));
        weightLbLabel.setText(result.getAppearance().getWeight().get(0));
        weightKgLabel.setText(result.getAppearance().getWeight().get(1));
        eyeColourLabel.setText(result.getAppearance().getEyeColour());
        hairColourLabel.setText(result.getAppearance().getHairColour());

        //Setting up value for Power statics.
        intelligenceLabel.setText(result.getPowerstats().getIntelligence());
        strengthLabel.setText(result.getPowerstats().getStrength());
        speedLabel.setText(result.getPowerstats().getSpeed());
        durabilityLabel.setText(result.getPowerstats().getDurability());
        powerLabel.setText(result.getPowerstats().getPower());
        combatLabel.setText(result.getPowerstats().getCombat());

        //Displaying superhero image.
        try
        {
            imageView.setImage(new Image(result.getImage().getUrl()));
        }
        //Displaying default image if superhero doesn't have any image.
        catch (IllegalArgumentException e)
        {
            imageView.setImage(new Image("https://ih1.redbubble.net/image.1893341687.8294/poster,504x498,f8f8f8-pad,600x600,f8f8f8.jpg"));
        }
    }

}
