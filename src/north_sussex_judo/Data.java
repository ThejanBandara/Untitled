/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package north_sussex_judo;


public class Data {
        String name;
        String TrainingProgram;
        int weight;
        String CompetitionWeightCategory;
        int CompetitionEntries;
        int PrivateCoachingHours;

        Data(String name, String TrainingProgram, int weight, String CompetitionWeightCategory, int CompetitionEntries, int PrivateCoachingHours){
            
            this.name = name;
            this.TrainingProgram = TrainingProgram;
            this.weight = weight;
            this.CompetitionWeightCategory = CompetitionWeightCategory;
            this.CompetitionEntries = CompetitionEntries;
            this.PrivateCoachingHours = PrivateCoachingHours;
        }
}
